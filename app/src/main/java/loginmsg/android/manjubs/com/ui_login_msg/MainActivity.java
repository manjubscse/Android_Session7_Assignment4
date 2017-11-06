package loginmsg.android.manjubs.com.ui_login_msg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText userName;
    private EditText pass;
    private Button loin_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Defining button control
        loin_btn = (Button) findViewById(R.id.btnLogin);


        loin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userName = (EditText) findViewById(R.id.txtUserName);
                pass = (EditText) findViewById(R.id.txtPass);

                // Validating user name length
                if (userName.length() <= 6) {
                    Toast.makeText(MainActivity.this, "Username should be greater than 6 characters.", Toast.LENGTH_LONG).show();
                }
                // Validating user name length
                else if (userName.length() > 50) {
                    Toast.makeText(MainActivity.this, "Username should not be greater than 50 characters.", Toast.LENGTH_LONG).show();
                }
                // Validating Password length
                else if (pass.length() <= 6) {
                    Toast.makeText(MainActivity.this, "Password should be greater than 6 characters.", Toast.LENGTH_LONG).show();
                }
                else{
                    Intent openNewActivity = new Intent(MainActivity.this, WelcomeMessageActivity.class);
                     // Declaring object of bundle control
                    Bundle dataBundle = new Bundle();
                    dataBundle.putString("BundleUserName", userName.getText().toString());
                    openNewActivity.putExtras(dataBundle);
                    startActivity(openNewActivity);
                }


            }
        });


    }
}
