package nl.ignadas.dailyshoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText fullname;
    private  EditText email;
    private  EditText username;
    private EditText password;
    private  EditText passwordRepeat;
    private Button btnRegisterNow;
    private Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        fullname=findViewById(R.id.etFullnameReg);
        email=findViewById(R.id.etEmailaddressReg);
        username=findViewById(R.id.etUsernameReg);
        password=findViewById(R.id.etPasswordReg);
        passwordRepeat=findViewById(R.id.etPasswordRepeatReg);

        btnRegisterNow=findViewById(R.id.btRegisterNow);
        btnCancel=findViewById(R.id.btCancelReg);

        btnRegisterNow.setOnClickListener(new View.OnClickListener(){

            // save new entry of registration and go to the main page
            // still missing saving

            @Override
            public void onClick(View view){
                String mFullname = fullname.getText().toString().trim();
                String mEmail=email.getText().toString().trim();
                String mUsername = username.getText().toString().trim();
                String mPassword=password.getText().toString().trim();
                String mPasswordRepeat = passwordRepeat.getText().toString().trim();

                if(TextUtils.isEmpty(mFullname)){
                    fullname.setError("Required Field..");
                    return;
                }
                if(TextUtils.isEmpty(mEmail)){
                    email.setError("Required Field..");
                    return;

                    // uizoeken contains @
                }
                if(TextUtils.isEmpty(mUsername)){
                    username.setError("Required Field..");
                    return;

                    // verify if user name already exist
                }
                if(TextUtils.isEmpty(mPassword)){
                    password.setError("Required Field..");
                    return;
                }

                //  set password  requirements

                if(TextUtils.isEmpty(mPasswordRepeat)){
                    passwordRepeat.setError("Required Field..");
                    return;
                }

                startActivity(new Intent(getApplicationContext(), MainActivity.class));

            }

            });


        btnCancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }

        });
    }

    public void btnCancelRegister(){

    }

    public void btnRegisterNow(){

    }


}
