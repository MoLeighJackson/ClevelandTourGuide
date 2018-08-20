package com.example.moleigh.clevelandtourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class PublicSquareFragment extends Fragment {


    public PublicSquareFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //inflate the view
        View view = inflater.inflate(R.layout.fragment_publicsquare, container, false);

        //array of location's attractions
        String[] attractions = {"Shop at Tower City", "Take a GCRTA bus", "Summer Splash"};

        //find the xml file and find the list view id stuff to do
        ListView listView = view.findViewById(R.id.stuffToDo);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                attractions
        );

        listView.setAdapter(listViewAdapter);

        return view;
    }

}
