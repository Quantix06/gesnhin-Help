package com.example.projet_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * shows the details of a clicked character
 * @author MARCHAL ESTRADA SAVE
 * @version 1
 */
public class Datafile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datafile);
        TextView nom = findViewById(R.id.nomPerso);
        TextView description = findViewById(R.id.description);
        TextView atq1 = findViewById(R.id.atq1);
        TextView atq2 = findViewById(R.id.atq2);
        TextView element = findViewById(R.id.element);
        TextView rarete = findViewById(R.id.rarete);
        ImageView image = findViewById(R.id.image_perso);
        Intent intent = getIntent();
        Personnage genshin=intent.getParcelableExtra("perso");
        nom.setText(genshin.nom);
        description.setText(genshin.getDescription());
        description.setMovementMethod(new ScrollingMovementMethod());
        atq1.setText("\n"+genshin.getNomAtaque1()+": "+genshin.descpNomAtaque1.replaceAll("\\<.*?\\>", ""));
        atq1.setMovementMethod(new ScrollingMovementMethod());
        atq2.setText("\n"+genshin.getNomAtaque2()+": "+genshin.descpNomAtaque2.replaceAll("\\<.*?\\>", ""));
        atq2.setMovementMethod(new ScrollingMovementMethod());
        element.setText(genshin.getElement());
        rarete.setText("rareté: "+genshin.getRarete());
        image.setImageResource(genshin.imgPerso);
    }
}