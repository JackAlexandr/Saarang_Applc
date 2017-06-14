package com.example.draagamadhuri.saarangapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EventsList extends AppCompatActivity {

    Toolbar toolbar;
    ListView list;
    ListView list2;
    ListView list3;
    private String check1;
    private String check2;
    private String check3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_list);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        list = (ListView) findViewById(R.id.listView);
        list2 = (ListView) findViewById(R.id.listView2);
        list3 = (ListView) findViewById(R.id.listView3);

        Bundle bn1 = getIntent().getExtras();

        check1 = bn1.getString("Category 1");
        check2 = bn1.getString("Category 2");
        check3 = bn1.getString("Category 3");


        //ADAPTER
        //CustomAdapter adapter = new CustomAdapter(this);
        //list.setAdapter(adapter);

        if(check1.equals("Category 1"))
        {
            ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(EventsList.this, android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.Cat_1));

            list.setAdapter(mAdapter);

            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),EventDetails.class);

                    //PASS INDEX OR POSITION
                    intent.putExtra("Position",position);
                    startActivity(intent);
                    intent.putExtra("Eventname", list.getItemAtPosition(position).toString());
                }
            });

        }

        else
        {
            ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(EventsList.this, android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.Cat_n));

            list.setAdapter(mAdapter);

            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),EventDetails.class);

                    //PASS INDEX OR POSITION
                    intent.putExtra("Position",position);
                    startActivity(intent);
                    intent.putExtra("Eventname", list.getItemAtPosition(position).toString());
                }
            });

        }

        if(check2.equals("Category 2"))
        {
            ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(EventsList.this, android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.Cat_2));

           list2.setAdapter(mAdapter);

            list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),EventDetails.class);

                    //PASS INDEX OR POSITION
                    intent.putExtra("Position",position);
                    startActivity(intent);
                    intent.putExtra("Eventname", list.getItemAtPosition(position).toString());
                }
            });

        }

        else
        {
            ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(EventsList.this, android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.Cat_n));

            list2.setAdapter(mAdapter);

            list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),EventDetails.class);

                    //PASS INDEX OR POSITION
                    intent.putExtra("Position",position);
                    startActivity(intent);
                    intent.putExtra("Eventname", list.getItemAtPosition(position).toString());
                }
            });


        }

        if(check3.equals("Category 3"))
        {
            ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(EventsList.this, android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.Cat_3));

            list3.setAdapter(mAdapter);

            list3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),EventDetails.class);

                    //PASS INDEX OR POSITION
                    intent.putExtra("Position",position);
                    startActivity(intent);
                    intent.putExtra("Eventname", list.getItemAtPosition(position).toString());
                }
            });

        }

        else
        {
            ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(EventsList.this, android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.Cat_n));

            list3.setAdapter(mAdapter);

            list3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),EventDetails.class);

                    //PASS INDEX OR POSITION
                    intent.putExtra("Position",position);
                    startActivity(intent);
                    intent.putExtra("Eventname", list.getItemAtPosition(position).toString());
                }
            });

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
