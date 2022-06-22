package sg.edu.np.mad.madpractical1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<VH> {

    public static ArrayList<User> userList;

    public Adapter(ArrayList<User> user) {
        userList = user;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_vh , parent, false);
            return new VH(item);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        User s = userList.get(position);
        holder.name.setText(s.Name);
        holder.description.setText(s.Description);

        holder.profilepicture.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());

                builder.setTitle("Profile");
                builder.setMessage("" + s.Name);
                builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent i2 = new Intent(view.getContext(), MainActivity.class);
//                        i2.putExtra("Username", s.Name);
//                        i2.putExtra("Description", s.Description);
//                        i2.putExtra("Followed", s.Followed);
//                        i2.putExtra("UserList", userList);
                        i2.putExtra("index", position);
                        (view.getContext()).startActivity(i2);
                    }
                });
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });
                builder.show();
            };
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }



}
