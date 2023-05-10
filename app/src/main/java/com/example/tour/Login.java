package com.example.tour;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.sdsmdg.tastytoast.TastyToast;

public class Login extends AppCompatActivity {

    private EditText email;
    private EditText epassword;
    private Button btnlogin;
    private TextView eregister;
    private TextView faccount;
    private ImageView image;

    private FirebaseAuth fAuth;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_login);


        email = findViewById(R.id.mail);
        epassword = findViewById(R.id.password);
        btnlogin = findViewById(R.id.loginbutton);
        faccount=findViewById (R.id.Faccount);
        image=findViewById (R.id.imageButton);

        fAuth= FirebaseAuth.getInstance ();
        progressBar=findViewById (R.id.progressBar);


        btnlogin.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String mail=email.getText ().toString ().trim ();
                String password=epassword.getText ().toString ().trim ();

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
                progressBar.setVisibility (View.VISIBLE);
                //authenticate the user
                fAuth.signInWithEmailAndPassword (mail,password).addOnCompleteListener (new OnCompleteListener<AuthResult> () {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful ()){
                            TastyToast.makeText(getApplicationContext(), "logged in successfully", TastyToast.LENGTH_LONG, TastyToast.SUCCESS);
                            startActivity(new Intent (getApplicationContext (),Homepage.class));
                        }
                        else {
                            TastyToast.makeText (Login.this,"Error !"+task.getException ().getMessage (), TastyToast.LENGTH_LONG, TastyToast.ERROR).show ();
                            progressBar.setVisibility (View.GONE);

                        }
                    }
                });


            }
        });
        eregister=findViewById (R.id.tvregister);
        eregister.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this ,Register.class));
            }


        });

        faccount=findViewById (R.id.Faccount);
        faccount.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (Login.this ,forgetpassword.class));



            }
        });
        image.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (Login.this ,Register.class));
            }
        });

        faccount=findViewById (R.id.Faccount);
        faccount.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                final EditText restmail= new EditText (v.getContext ());
                AlertDialog.Builder passwordResetDialog= new AlertDialog.Builder(v.getContext ());
                passwordResetDialog.setTitle ("Rest password ?");
                passwordResetDialog.setMessage ("Enter your E-Mail to Received Rest Link");
                passwordResetDialog.setView (restmail);


                passwordResetDialog.setPositiveButton ("yes" ,new DialogInterface.OnClickListener () {
                    @Override
                    public void onClick(DialogInterface dialog ,int which) {
                    //extract the email and send rest link
                      String mail=restmail.getText ().toString ();
                      fAuth.sendPasswordResetEmail (mail).addOnSuccessListener (new OnSuccessListener<Void> () {
                          @Override
                          public void onSuccess(Void aVoid) {
                         Toast.makeText (Login .this,"Reset Link Sent To Your Mail",Toast.LENGTH_SHORT).show ();

                          }
                      }).addOnFailureListener (new OnFailureListener () {
                          @Override
                          public void onFailure(@NonNull Exception e) {
                              Toast.makeText (Login .this,"Error Reset Link is not Sent "+e.getMessage (),Toast.LENGTH_SHORT).show ();
                          }
                      });


                    }
                });


passwordResetDialog.setNegativeButton ("No" ,new DialogInterface.OnClickListener () {
    @Override
    public void onClick(DialogInterface dialog ,int which) {
  // close the dialog

    }
});
passwordResetDialog.create ().show ();
            }
        });
    }
}

