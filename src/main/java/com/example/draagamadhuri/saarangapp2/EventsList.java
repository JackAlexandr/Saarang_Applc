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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_list);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        list = (ListView) findViewById(R.id.listView);

        //ADAPTER
        CustomAdapter adapter = new CustomAdapter(this);
        list.setAdapter(adapter);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(EventsList.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Events));

        //EVENTS
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

       // list.setAdapter(mAdapter);
    }
}
