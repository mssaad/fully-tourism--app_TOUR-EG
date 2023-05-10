package com.example.tour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.sdsmdg.tastytoast.TastyToast;

public class Register extends AppCompatActivity {
    private EditText ename;
    private EditText epassword;
    private EditText email;
    private EditText phone;
    private EditText conformpassword;
    private Button ebutton;
    private TextView Haccount;
    private FirebaseAuth fAuth;
    private ProgressBar progressBar;
private ImageButton imageButton;

    private TextView eregister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ename = findViewById(R.id.name);
        epassword = findViewById(R.id.password);
        ebutton = findViewById(R.id.registerbutton);
        email=findViewById(R.id.mail);
        phone=findViewById(R.id.mobile);
        conformpassword=findViewById (R.id.cformpassword);
        Haccount=findViewById(R.id.Haccount);
        imageButton=findViewById(R.id.imageButton);

        fAuth= FirebaseAuth.getInstance ();
        progressBar=findViewById (R.id.progressBar);
        if(fAuth.getCurrentUser ()!=null){
            startActivity(new Intent (getApplicationContext (),Homepage.class));
            finish ();
        }

        ebutton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                final String name= ename.getText ().toString ().trim ();
                String mail=email.getText ().toString ().trim ();
                String password=epassword.getText ().toString ().trim ();
                String mobile=phone.getText ().toString ().trim ();
                String cformpassword=conformpassword.getText ().toString ().trim ();



                if( TextUtils.isEmpty (name) ){
                    ename.setError ("Email is Required");
                    return;
                }
                if( TextUtils.isEmpty (mail) ){
                    email.setError ("Email is Required");
                    return;
                }
                if(TextUtils.isEmpty (password)){
                    epassword.setError ("password is Required");
                    return;
                }
                if(password.length ()<6){
                    epassword.setError ("password must be 6 characters at least");
                    return;

                }
                if(cformpassword.isEmpty()||!cformpassword.equals (password)){
                    conformpassword. setError ("password is  not match!");
                    return;
                }

                progressBar.setVisibility (View.VISIBLE);
                //register the user in firebase
                fAuth.createUserWithEmailAndPassword (mail,password).addOnCompleteListener (new OnCompleteListener<AuthResult> () {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful ()){
                            TastyToast.makeText(getApplicationContext(), "User Created", TastyToast.LENGTH_LONG, TastyToast.SUCCESS);

                            startActivity(new Intent (getApplicationContext (),Homepage.class));

                        }

                        else {
                            TastyToast.makeText (Register.this,"Error !"+task.getException ().getMessage (), TastyToast.LENGTH_LONG, TastyToast.ERROR).show ();
                            progressBar.setVisibility (View.GONE);


                        }
                    }
                });
            }
        });


        Haccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (Register.this ,Login.class));

            }
        });
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (Register.this ,Login.class));

            }
        });
    }
}
