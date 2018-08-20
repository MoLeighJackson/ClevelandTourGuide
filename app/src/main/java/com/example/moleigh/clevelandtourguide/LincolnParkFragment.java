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
public class LincolnParkFragment extends Fragment {


    public LincolnParkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lincolnpark, container, false);

        String[] attractions = {"Arts in August", "Swim at the public pool", "Visit the Tremont Farmers Market"};

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
