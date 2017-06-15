package com.example.draagamadhuri.saarangapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class EventsList extends AppCompatActivity {

    Toolbar toolbar;
    ListView list;
    ListView list2;
    ListView list3;
    private String note;
    TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_list);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        list = (ListView) findViewById(R.id.listView);
        list2 = (ListView) findViewById(R.id.listView2);
        list3 = (ListView) findViewById(R.id.listView3);
        msg = (TextView) findViewById(R.id.message);



        boolean isCat_1_checked = getIntent().getBooleanExtra("Category 1",false);
        boolean isCat_2_checked = getIntent().getBooleanExtra("Category 2",false);
        boolean isCat_3_checked = getIntent().getBooleanExtra("Category 3",false);

      // msg.setText(getIntent().getExtras().toString());




        //ADAPTER
        //CustomAdapter adapter = new CustomAdapter(this);
        //list.setAdapter(adapter);

        if((isCat_1_checked)||(isCat_2_checked)||(isCat_3_checked))

        {

            if (isCat_1_checked) {
                ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(EventsList.this, android.R.layout.simple_list_item_1,
                        getResources().getStringArray(R.array.Cat_1));

                list.setAdapter(mAdapter);

                list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        Intent intent = new Intent(getApplicationContext(), EventDetails.class);

                        //PASS INDEX OR POSITION
                        intent.putExtra("Position", position);
                        startActivity(intent);
                        intent.putExtra("Eventname", list.getItemAtPosition(position).toString());
                    }
                });

            }


            if (isCat_2_checked) {
                ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(EventsList.this, android.R.layout.simple_list_item_1,
                        getResources().getStringArray(R.array.Cat_2));

                list2.setAdapter(mAdapter);

                list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        Intent intent = new Intent(getApplicationContext(), EventDetails.class);

                        //PASS INDEX OR POSITION
                        intent.putExtra("Position", position);
                        startActivity(intent);
                        intent.putExtra("Eventname", list.getItemAtPosition(position).toString());
                    }
                });

            }


            if (isCat_3_checked) {
                ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(EventsList.this, android.R.layout.simple_list_item_1,
                        getResources().getStringArray(R.array.Cat_3));

                list3.setAdapter(mAdapter);

                list3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        Intent intent = new Intent(getApplicationContext(), EventDetails.class);

                        //PASS INDEX OR POSITION
                        intent.putExtra("Position", position);
                        startActivity(intent);
                        intent.putExtra("Eventname", list.getItemAtPosition(position).toString());
                    }
                });

            }

        }

        else
        {
            Bundle b1 = getIntent().getExtras();
            note = b1.getString("None");
            msg.setText(note.toString());

        }


        //ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(EventsList.this, android.R.layout.simple_list_item_1,
          //      getResources().getStringArray(R.array.Events));

        //EVENTS
        /*list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(),EventDetails.class);

                //PASS INDEX OR POSITION
                intent.putExtra("Position",position);
                startActivity(intent);
                intent.putExtra("Eventname", list.getItemAtPosition(position).toString());
            }
        });*/

      //  list.setAdapter(mAdapter);
    }
}
