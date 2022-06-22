package sg.edu.np.mad.madpractical1;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class VH extends RecyclerView.ViewHolder {

    TextView name;
    TextView description;
    ImageView profilepicture;

    public VH(View v) {
        super(v);
        profilepicture = v.findViewById(R.id.profilepic);
        name = itemView.findViewById(R.id.username);
        description = itemView.findViewById(R.id.Descript);
    }
}
