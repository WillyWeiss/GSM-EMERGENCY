package com.firebase.gsm_emergency;
//Make Imports
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//Main Activity
public class MainActivity extends AppCompatActivity {
    //Define Button
    Button Alert_btn;
    //Message to be send
    String messageToSend = "TEXT_MESSAGE_HERE";
    //Destination Phone Number
    //Please use international format
    String number = "+4400000000";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Alert_btn= (Button) findViewById(R.id.Alert_btn);
        Alert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //SMS FUNCTION.
                //UNCOMMENT the below line for production purposes (not working in emulator)
                //SmsManager.getDefault().sendTextMessage(number, null, messageToSend, null,null);
                //Toast confirmation (use in emulator to test button functionality)
                Toast.makeText(getApplicationContext(), "HELP IS ON THE WAY", Toast.LENGTH_LONG).show();
            }
        });
    }
}