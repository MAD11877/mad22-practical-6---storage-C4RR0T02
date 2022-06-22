package sg.edu.np.mad.madpractical1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        EditText enteredusername = (EditText)findViewById(R.id.loginuserenteredname);
        EditText enteredpassword = (EditText)findViewById(R.id.loginuserenteredpassword);
        Button submit = (Button)findViewById(R.id.login);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance("https://mad-practical-6---sherlena-default-rtdb.asia-southeast1.firebasedatabase.app/");
                DatabaseReference myRef = database.getReference("Users");

                String username = enteredusername.getText().toString();
                String password = enteredpassword.getText().toString();

                myRef.child(username).get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DataSnapshot> task) {
                        if (task.isSuccessful()) {
                            String correctpassword = task.getResult().child("password").getValue(String.class);
                            if (correctpassword != null && correctpassword.equals(password)){
                                Intent i1 = new Intent(Loginpage.this, ListActivity.class);
                                Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();
                                startActivity(i1);
                            }
                            else {
                                Toast.makeText(getApplicationContext(), "Login Fail", Toast.LENGTH_LONG).show();
                            }
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "User not found", Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
    }
}