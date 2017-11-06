package loginmsg.android.manjubs.com.ui_login_msg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class WelcomeMessageActivity extends Activity {

    // Text view control
    private TextView welcomeMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_message_display);

        Intent intentObject = getIntent();
        //String userName = intentObject.getStringExtra("UserName");
       // boolean isRegistered = intentObject.getBooleanExtra("isRegistered", true);

        String userNameBundle=intentObject.getExtras().getString("BundleUserName");
        //Toast.makeText(getApplicationContext(),userNameBundle, Toast.LENGTH_LONG).show();

        // SET the message fromtext box
        welcomeMsg = (TextView) findViewById(R.id.txtShowMsg);

        //Set the message
        welcomeMsg.setText("Welcome " + userNameBundle);

    }
}
