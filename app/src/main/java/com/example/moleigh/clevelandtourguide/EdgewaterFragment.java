package com.example.moleigh.clevelandtourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EdgewaterFragment extends Fragment {


    public EdgewaterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Watched tutorial https://www.youtube.com/watch?v=edZwD54xfbk
        //1.5:Display a ListView in a Fragment by Samantha Squires
        View view = inflater.inflate(R.layout.fragment_edgewater, container, false);

        // an array of stuff to do at Edgewater
        String[] attractions = {"Swim in the lake", "Relax on the beach", "Have a BBQ "};

        //find the stuff to do id in the xml layout
        ListView listView = view.findViewById(R.id.stuffToDo);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
            getActivity(),
            android.R.layout.simple_list_item_1,
            attractions
        );

        listView.setAdapter(listViewAdapter);

        return view;



    }

}
