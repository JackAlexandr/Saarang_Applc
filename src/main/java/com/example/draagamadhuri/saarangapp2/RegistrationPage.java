package com.example.draagamadhuri.saarangapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrationPage extends AppCompatActivity {


    Toolbar toolbar;
    private EditText et_name, et_email, et_number, et_college;
    private String name, email, number, college;
    Button regbutton;
    TextView eventname;
    int position = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        Intent intent = getIntent();
        position = intent.getExtras().getInt("Position");

        final CustomAdapter adapter = new CustomAdapter(this);

        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        toolbar.setTitle(getResources().getString(R.string.registration));

        et_name = (EditText) findViewById(R.id.name);
        et_email = (EditText) findViewById(R.id.email);
        et_number = (EditText) findViewById(R.id.number);
        et_college = (EditText) findViewById(R.id.clgname);
        regbutton = (Button) findViewById(R.id.regbutton);
        eventname = (TextView) findViewById(R.id.textView31);

        eventname.setText(adapter.Events[position]);

        regbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();  //call when the button is clicked to validate the input
            }
        });

    }

    public void register()
    {
        initialize();   //initialize the input to string variables
        if (!validate())
        {
            Toast.makeText(this,"Registration has failed",Toast.LENGTH_SHORT).show();

        }
        else
        {
            onRegisterSuccess();

        }
    }

    public void onRegisterSuccess()
    {
        //TODO what happens if Registration is successfull or valid input is entered

    }

    public boolean validate()
    {
        boolean valid = true;
        if (name.isEmpty()||name.length()>30)
        {
            et_name.setError("Please enter a valid name");
            valid = false;
        }
        if (email.isEmpty()||!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            et_email.setError("Please enter a valid Email Id");
            valid = false;
        }
        if (number.length()>10||number.length()<10)
        {
            et_number.setError("Please enter a valid phone number");
            valid = false;
        }

     return valid;
    }
    public void initialize()
    {
        name = et_name.getText().toString().trim();
        email = et_email.getText().toString().trim();
        number = et_number.getText().toString().trim();
        college = et_college.getText().toString().trim();

    }
}
