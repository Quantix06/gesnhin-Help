package com.example.projet_android;

import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * Team register fragment
 * @author MARCHAL ESTRADA SAVE
 * @version 1
 */
public class TeamRegister extends Fragment {

    private static final String TAG = "Quentin";
    private ListView listSavedTeam;
    ArrayList<String> teams = new ArrayList<String>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_team_register, container, false);



        listSavedTeam=rootView.findViewById(R.id.listSavedTeam);


        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        teams = new ArrayList<String>();
        for (int i=0;i<loadDataSize();i++){
            teams.add(loadDataString(i));
        }
        Log.d(TAG, "onActivityCreated: "+teams);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getView().getContext(), android.R.layout.simple_list_item_1, teams);
        listSavedTeam.setAdapter(arrayAdapter);
    }


    public String loadDataString(int i) {
        SharedPreferences preferences = this.getActivity().getSharedPreferences("SHARED_PREFS", MODE_PRIVATE);
        String text = preferences.getString("TEXT"+i, "");
        return text;
    }
    public int loadDataSize() {
        SharedPreferences preferences = this.getActivity().getSharedPreferences("SHARED_PREFS", MODE_PRIVATE);
        int size = preferences.getInt("size", 0);
        return size;
    }
}