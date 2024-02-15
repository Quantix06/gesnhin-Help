package com.example.projet_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;

/**
 * Team maker activity
 * @author MARCHAL ESTRADA SAVE
 * @version 1
 */
public class Team_Maker extends AppCompatActivity {
    String perso1;
    String perso2;
    String perso3;
    String perso4;
    ArrayList <String> saveData= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_maker);
        Intent intent = getIntent();
        int size=intent.getIntExtra("size",0);
        ListCharacter genshin=new ListCharacter();
        for (int i=0;i<size;i++){
            genshin.add(intent.getParcelableExtra("perso"+i));
        }
        System.out.println("size of parcelable: "+size);
        Button Equipes = findViewById(R.id.Equipes);
        Equipes.setOnClickListener(view -> {
            Intent intent1 = new Intent(Team_Maker.this, FragmentActivity.class);
            intent1.putExtra("size",saveData.size());
            for (int i=0;i<saveData.size();i++){
                intent1.putExtra("perso"+i,saveData.get(i));
            }

            startActivity(intent1);
            overridePendingTransition(R.anim.in, R.anim.out);
        });
        Spinner sp1 = findViewById(R.id.Perso1);
        Spinner sp2 = findViewById(R.id.Perso2);
        Spinner sp3 = findViewById(R.id.Perso3);
        Spinner sp4 = findViewById(R.id.Perso4);
        ArrayList<String> nomPerso =new ArrayList<>();
        for (int i=0;i<size;i++){
            nomPerso.add(genshin.get(i).getNom());
        }
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, nomPerso);
        //CustomList customList=new CustomList(getApplicationContext(),genshin);
        sp1.setAdapter(dataAdapter);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                perso1 =nomPerso.get(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        sp2.setAdapter(dataAdapter);
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                perso2 =nomPerso.get(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        sp3.setAdapter(dataAdapter);
        sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                perso3 =nomPerso.get(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        sp4.setAdapter(dataAdapter);
        sp4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                perso4 =nomPerso.get(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        Button envoyer = findViewById(R.id.button);
        EditText Numero = findViewById(R.id.editTextTextPersonName);
        EditText message = findViewById(R.id.editTextTextPersonName2);
        envoyer.setOnClickListener(view -> {
            float star =ratingBar.getRating();
            String SMS = message.getText().toString().trim();
            SMS+="Voici donc mon équipe: \n"+"  "+perso1+"\n"+"  "+perso2+"\n"+"  "+perso3+"\n"+"  "+perso4+"\n"+"  "+"voici sa note: "+star;
            saveData(SMS);
            if (ActivityCompat.checkSelfPermission(getApplicationContext(),
                    Manifest.permission.SEND_SMS) !=
                    PackageManager.PERMISSION_GRANTED) {
                // Permission not yet granted. Use requestPermissions().
                // MY_PERMISSIONS_REQUEST_SEND_SMS is an
                // app-defined int constant. The callback method gets the
                // result of the request.
                ActivityCompat.requestPermissions(Team_Maker.this,
                        new String[]{Manifest.permission.SEND_SMS},1);

            }
            if (star != 0 && Numero.getText().length()==10){
                if (star != 0 && Numero.getText().length()==10) {
                    String phoneNo = Numero.getText().toString().trim();

                    try {
                        SmsManager smsManager = SmsManager.getDefault();
                        smsManager.sendTextMessage(phoneNo, null, SMS, null, null);
                        Toast.makeText(getApplicationContext(), "Message is sent", Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Faild to send messa", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
    public void saveData(String save) {
        saveData.add(save);
    }

}

