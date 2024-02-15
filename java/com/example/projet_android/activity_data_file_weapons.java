package com.example.projet_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * shows the details of a clicked weapon
 * @author MARCHAL ESTRADA SAVE
 * @version 1
 */
public class activity_data_file_weapons extends AppCompatActivity {

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_file_weapons);
        TextView nom = findViewById(R.id.nomWeapon);
        TextView description = findViewById(R.id.description);
        TextView atq1 = findViewById(R.id.atq1);
        TextView atq2 = findViewById(R.id.atq2);
        TextView rarete = findViewById(R.id.rarete);
        TextView weapontype = findViewById(R.id.textView3);
        ImageView imageWeapon = findViewById(R.id.imageWeapon);

        Intent intent = getIntent();
        Arme genshin=intent.getParcelableExtra("perso");
        rarete.setText("rarete: "+genshin.rarete);
        nom.setText(genshin.nom);
        description.setMovementMethod(new ScrollingMovementMethod());
        atq2.setText("\n"+genshin.typeSubstat+": "+genshin.effet);
        atq1.setMovementMethod(new ScrollingMovementMethod());
        atq1.setText("\n Ataque:"+ genshin.effet);
        description.setText("\n"+genshin.description.replaceAll("\\<.*?\\>", ""));
        atq2.setMovementMethod(new ScrollingMovementMethod());
        weapontype.setText(genshin.atq);
        imageWeapon.setImageResource(genshin.image);
    }
}