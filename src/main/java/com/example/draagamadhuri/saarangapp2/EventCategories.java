package com.example.draagamadhuri.saarangapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class EventCategories extends AppCompatActivity {

    CheckBox check1;
    CheckBox check2;
    CheckBox check3;
    TextView text;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_categories);

        check1 = (CheckBox) findViewById(R.id.checkBox1);
        check2 = (CheckBox) findViewById(R.id.checkBox2);
        check3 = (CheckBox) findViewById(R.id.checkBox3);
        text = (TextView) findViewById(R.id.textView4);
        button  = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(EventCategories.this, EventsList.class);

                if (check1.isChecked()) {
                    i.putExtra("Category 1", check1.getText().toString().trim());
                    //startActivity(i);
                }

                else {

                    i.putExtra("Category 1", text.getText().toString().trim());
                    //startActivity(i);

                }

                if (check2.isChecked()) {

                    i.putExtra("Category 2", check2.getText().toString().trim());

                }
                else {

                    i.putExtra("Category 2", text.getText().toString().trim());
                    //startActivity(i);

                }

                if (check3.isChecked()) {

                    i.putExtra("Category 3", check3.getText().toString().trim());

                }

                else {

                    i.putExtra("Category 3", text.getText().toString().trim());
                    //startActivity(i);

                }

                startActivity(i);

            }
        });
    }
}
