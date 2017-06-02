package com.example.draagamadhuri.saarangapp2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class EventDetails extends AppCompatActivity {

    Toolbar mToolbar;
    int position = 0;
    ImageView call1;
    ImageView call2;
    Button register;
    TextView email1;
    TextView email2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);

        mToolbar = (Toolbar) findViewById(R.id.toolbar1);
        call1 = (ImageView) findViewById(R.id.imageView3);
        call2 = (ImageView) findViewById(R.id.imageView4);
        register = (Button) findViewById(R.id.button);
        email1 = (TextView) findViewById(R.id.textView12);
        email2 = (TextView) findViewById(R.id.textView13);



        //GET PASSED DATA
        Intent intent = getIntent();
        position = intent.getExtras().getInt("Position");

        /*Bundle bundle = getIntent().getExtras();
        if (bundle !=null)
        {
            mToolbar.setTitle(bundle.getString("Eventname"));

        }*/



        //GET VIEWS
        final CustomAdapter adapter = new CustomAdapter(this);
        final TextView description = (TextView) findViewById(R.id.textView1);
        final TextView date = (TextView) findViewById(R.id.textView2);
        final TextView time = (TextView) findViewById(R.id.textView3);
        final TextView location = (TextView) findViewById(R.id.textView5);
        final TextView per1 = (TextView) findViewById(R.id.textView7);
        final TextView ph1 = (TextView) findViewById(R.id.textView8);
        final TextView per2 = (TextView) findViewById(R.id.textView9);
        final TextView ph2 = (TextView) findViewById(R.id.textView10);
        final TextView email1 = (TextView) findViewById(R.id.textView12);
        final TextView email2 = (TextView) findViewById(R.id.textView13);


        //SET DATA
        description.setText(adapter.Description[position]);
        date.setText(adapter.Date[position]);
        time.setText(adapter.Time[position]);
        location.setText(adapter.Location[position]);
        per1.setText(adapter.Person1[position]);
        ph1.setText(adapter.No1[position]);
        per2.setText(adapter.Person2[position]);
        ph2.setText(adapter.No2[position]);
        email1.setText(adapter.Email1[position]);
        email2.setText(adapter.Email2[position]);

        PhoneNumberUtils.formatNumber(ph1.getText().toString());
        PhoneNumberUtils.formatNumber(ph2.getText().toString());


        mToolbar.setTitle(adapter.Events[position]);

        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:"+adapter.No1[position]));
                startActivity(intent1);
            }


        });

        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(Intent.ACTION_DIAL);
                intent2.setData(Uri.parse("tel:"+adapter.No2[position]));
                startActivity(intent2);
            }
        });

        email1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{adapter.Email1[position]});
                //intent.putExtra(Intent.EXTRA_SUBJECT,"HELLO!!");
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"send email.."));
            }
        });

        email2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{adapter.Email2[position]});
               // intent.putExtra(Intent.EXTRA_SUBJECT,"HELLO!!");
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"send email.."));
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(v.getContext(),RegistrationPage.class);
                startActivity(intent3);
            }
        });

    }
}
