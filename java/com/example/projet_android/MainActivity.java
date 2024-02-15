package com.example.projet_android;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.concurrent.Executors;

/**
 * Main activity of the project
 * @author MARCHAL ESTRADA SAVE
 * @version 1
 */
public class MainActivity extends AppCompatActivity {
    static ListCharacter listcharacter = new ListCharacter();
    private ListCharacter saveList= new ListCharacter();
    private ProgressDialog progressDialog;
    static int count=0;
    int listcharacterSize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView Arme= findViewById(R.id.Weaponimg);
        ImageView Equipe= findViewById(R.id.plusButton);
        ListView persos= (ListView) findViewById(R.id.listPerso);
        if (listcharacter.size()==0){
            doAlbedo();
        }else {
            CustomList customList =new CustomList(getApplicationContext(),listcharacter);
            persos.setAdapter(customList);
            persos.setOnItemClickListener((adapterView, view, i, l) -> {
                Intent intent = new Intent(MainActivity.this, Datafile.class);
                intent.putExtra("perso", listcharacter.get(i));
                startActivity(intent);
                overridePendingTransition(R.anim.in, R.anim.out);
            });
        }

        Arme.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, WeaponActivity.class);
            intent.putExtra("size",listcharacter.size());
            for (int i=0;i<listcharacter.size();i++){
                intent.putExtra("perso"+i,listcharacter.get(i));
            }
            startActivity(intent);
            overridePendingTransition(R.anim.in, R.anim.out);
        });
        Equipe.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Team_Maker.class);
            intent.putExtra("size",listcharacter.size());
            for (int i=0;i<listcharacter.size();i++){
                intent.putExtra("perso"+i,listcharacter.get(i));
            }
            startActivity(intent);
            overridePendingTransition(R.anim.in, R.anim.out);
        });
    }
    public  void executeInThread() {
        onPreExecute();
        ArrayList<String> testeur=new ArrayList<String>();
        testeur.add("https://api.npoint.io/fa6686b78b01c981f813");
        testeur.add("https://api.npoint.io/f073d492668db1ed4f5e");
        testeur.add("https://api.npoint.io/1d64696abea53f73f622");
        testeur.add("https://api.npoint.io/bb193d9c7dde25ee8579");
        testeur.add("https://api.npoint.io/17f792157133ce1e6177");
        testeur.add("https://api.npoint.io/0538dc4a746abcb9de9f");
        testeur.add("https://api.npoint.io/6fcd40bd13036351fe0e");
        testeur.add("https://api.npoint.io/b832bb6a3a86837b61b9");
        testeur.add("https://api.npoint.io/a88245f9895ab14c5032");
        testeur.add("https://api.npoint.io/896265c56b149357fcc1");
        testeur.add("https://api.npoint.io/3aedebb442bd606bfa9a");
        testeur.add("https://api.npoint.io/5546ba45eba4305e808d");
        testeur.add("https://api.npoint.io/1ef403d55573c803a118");
        testeur.add("https://api.npoint.io/4bea3a3cd0740518d728");
        testeur.add("https://api.npoint.io/efdc8d19f289a677441f");
        testeur.add("https://api.npoint.io/82719e19c4c5e8f43193");
        testeur.add("https://api.npoint.io/2c254c97665d4900ff17");
        testeur.add("https://api.npoint.io/74fd93cd786e47f55df9");
        testeur.add("https://api.npoint.io/4d120dd646b870b18155");
        testeur.add("https://api.npoint.io/c8526d1692ff87845a96");
        testeur.add("https://api.npoint.io/db422019c97d407b71c8");
        testeur.add("https://api.npoint.io/ea2ca1b010f95ec33b58");
        testeur.add("https://api.npoint.io/7de40642d6c6acff5809");
        testeur.add("https://api.npoint.io/d1796495f42584372d2c");
        testeur.add("https://api.npoint.io/2711f696ea00cdbb4b3c");
        testeur.add("https://api.npoint.io/8010c2be6cd34f9836fd");
        testeur.add("https://api.npoint.io/d973f18f4306df7b6e8b");
        testeur.add("https://api.npoint.io/40a42e3afb7260e88595");
        testeur.add("https://api.npoint.io/9ed1162b41fcd2418da8");
        testeur.add("https://api.npoint.io/89d51e43128ff87beee9");
        testeur.add("https://api.npoint.io/c4b52e4a69310062ee69");
        testeur.add("https://api.npoint.io/0509dd3be8cae7c3e22e");
        testeur.add("https://api.npoint.io/beb4d958ac136530ed34");
        testeur.add("https://api.npoint.io/a7c7e6208724ccea6b80");
        testeur.add("https://api.npoint.io/a4313bf3480a9d0fe199");
        testeur.add("https://api.npoint.io/88bedf349a852868f0ac");
        testeur.add("https://api.npoint.io/c68073f40ec03451a33d");




        listcharacterSize=testeur.size();
        for (int i=0;i<testeur.size();i++){

            HttpAsyncGet getCharacter = new HttpAsyncGet(testeur.get(i));
            Runnable runnable = ()->{
                getCharacter.doInBackGround();
                runOnUiThread(() ->onPostExecute(getCharacter.getItemResult()));
            };
            Executors.newSingleThreadExecutor().execute( runnable );
        }

    }


    private  void onPostExecute(ArrayList<String> characterInfo) {

        Personnage perso=new Personnage(characterInfo.get(0),characterInfo.get(1),characterInfo.get(2),characterInfo.get(3),
                characterInfo.get(4),characterInfo.get(5),characterInfo.get(6),characterInfo.get(7),characterInfo.get(8),characterInfo.get(9));
        listcharacter.add(perso);
        ListView persos= (ListView) findViewById(R.id.listPerso);
        count++;
        if (count==listcharacterSize){

            progressDialog.dismiss();
            PictureGiver pictureGiver = new PictureGiver(listcharacter);
            pictureGiver.SendImageCharacter();
            CustomList customList =new CustomList(getApplicationContext(),listcharacter);
            persos.setAdapter(customList);
            persos.setOnItemClickListener((adapterView, view, i, l) -> {
                Intent intent = new Intent(MainActivity.this, Datafile.class);
                intent.putExtra("perso", listcharacter.get(i));
                startActivity(intent);
            });
            saveList=listcharacter;
        }
        Log.d("Quentin", "size: "+listcharacter.size());

    }
    public void doAlbedo(){
        executeInThread();
    }

    private void onPreExecute() {
        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Connexion en cours...");
        progressDialog.setCancelable(false);
        progressDialog.show();
    }


}