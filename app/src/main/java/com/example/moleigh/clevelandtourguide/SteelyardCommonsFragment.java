package com.example.moleigh.clevelandtourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SteelyardCommonsFragment extends Fragment {


    public SteelyardCommonsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_steelyardcommons, container, false);

        String[] attractions = {"Tow Path", "Shop and grab a bite to eat at the strip mall", "Check out the ArcelorMittal Steel Heritage Center"};

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
