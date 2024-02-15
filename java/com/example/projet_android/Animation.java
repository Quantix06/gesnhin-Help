package com.example.projet_android;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * 
 * @author MARCHAL ESTRADA SAVE
 * @version 1
 */
public class Animation extends Fragment {
    private static final String TAG = "estrada test";
    private Button buttonAimation;
    private ImageView imageSavedTeam;

    /**
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_animation, container, false);

        buttonAimation=rootView.findViewById(R.id.animationButton);
        imageSavedTeam=rootView.findViewById(R.id.imageSavedTeam);

        return rootView;
    }

    /**
     *
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        imageSavedTeam.setImageResource(R.drawable.xiao);

        buttonAimation.setOnClickListener(view -> Log.i(TAG, "Animation"));
    }
}