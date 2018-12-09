package nl.ignadas.dailyshoppinglist;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText etUsername;
    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       etUsername = (EditText) findViewById(R.id.etUsername);
       etPassword=(EditText) findViewById(R.id.etPassword);

    }

    /**
     * Temp Hardcode Login details
     */

    String username ="admin";
    String password ="1111";

    public void btnLogin(View view){
        if(username.equals(etUsername.getText().toString()) &&
                password.equals(etPassword.getText().toString())){

            Toast.makeText(getApplicationContext(), "Login succesfully", Toast.LENGTH_SHORT).show();

            // go to second activity
            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
            intent.putExtra("Username : ", etUsername.getText().toString());
            intent.putExtra("Password : ", etPassword.getText().toString());
            startActivity(intent);
        }
    }

    public void btnRegister(View view){
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        MainActivity.this.startActivity(intent);

    }


}

