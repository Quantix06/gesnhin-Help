package com.example.projet_android;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Fragment activity
 * @author MARCHAL ESTRADA SAVE
 * @version 1
 */
public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        Intent intent = getIntent();
        int size=intent.getIntExtra("size",0);
        for (int i=0;i<size;i++){
            saveData(intent.getParcelableExtra("perso"+i));
        }


    }
    public void saveData(String save) {
        SharedPreferences sharedPreferences = getSharedPreferences("SHARED_PREFS", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int size = sharedPreferences.getInt("size", 0);
        editor.putString("TEXT"+size, save);
        editor.putInt("size",size++);

        editor.apply();

        Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show();
    }

}