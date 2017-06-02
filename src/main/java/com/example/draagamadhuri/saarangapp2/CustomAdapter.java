package com.example.draagamadhuri.saarangapp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by D.RAAGA MADHURI on 30-May-17.
 */

public class CustomAdapter extends BaseAdapter {

    private Context c;

    String[] Events = {"Event 1","Event 2","Event 3","Event 4","Event 5","Event 6"};
    String[] Description = {"About Event 1","About Event 2","About Event 3","About Event 4","About Event 5","About Event 6"};
    String[] Date = {"Date:- 30/05/17","Date:- 31/05/17","Date:- 01/06/17","Date:- 02/06/17","Date:- 03/06/17","Date:- 04/06/17"};
    String[] Time = {"Time:- 5:00pm","Time:- 5:30pm","Time:- 6:00pm","Time:- 4:00pm","Time:- 4:30pm","Time:- 3:30pm"};
    String[] Location = {"OAT","CLT","CRC","SAC","OAT","SAC"};
    String[] Person1 = {"Pr 11","Pr 21","Pr 31","Pr 41","Pr 51","Pr 61"};
    String[] Person2 = {"Pr 12","Pr 22","Pr 32","Pr 42","Pr 52","Pr 62"};
    String[] No1 = {"9000000000","9000000001","9000000002","9000000003","9000000004","9000000005"};
    String[] No2 = {"9111111111","9111111112","9111111113","9111111114","9111111115","9111111116"};
    String[] Email1 = {"e1p1@xyz.com","e2p1@xyz.com","e3p1@xyz.com","e4p1@xyz.com","e5p1@xyz.com","e6p1@xyz.com"};
    String[] Email2 = {"e1p2@xyz.com","e2p2@xyz.com","e3p2@xyz.com","e4p2@xyz.com","e5p2@xyz.com","e6p2@xyz.com"};


    public CustomAdapter(Context ctx) {

        this.c = ctx;

    }

    @Override
    public int getCount() {
        return Events.length;
    }

    @Override
    public Object getItem(int position) {
        return Events[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.event,null);

        }

        //GET VIEWS
        TextView eventname = (TextView) convertView.findViewById(R.id.textView);
        ImageView background = (ImageView) convertView.findViewById(R.id.image);

        //SET DATA
        eventname.setText(Events[position]);

        return convertView;
    }
}
