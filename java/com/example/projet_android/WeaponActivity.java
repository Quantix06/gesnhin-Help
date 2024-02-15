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

public class WeaponActivity extends AppCompatActivity {
    private static final String TAG = "estrada " + HttpAsyncGet.class.getSimpleName();
    static WeaponList weapons = new WeaponList();
    private ProgressDialog progressDialog;
    static int count=0;
    int testeurSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon2);
        ImageView imgPerso= findViewById(R.id.persoimg2);
        ImageView Equipe= findViewById(R.id.plusButton2);
        Intent intent = getIntent();
        int size=intent.getIntExtra("size",0);
        ListCharacter genshin=new ListCharacter();
        for (int i=0;i<size;i++){
            genshin.add(intent.getParcelableExtra("perso"+i));
        }

        imgPerso.setOnClickListener(view -> {
            Intent intent1 = new Intent(WeaponActivity.this, MainActivity.class);
            startActivity(intent1);
            overridePendingTransition(R.anim.in, R.anim.out);
        });
        Equipe.setOnClickListener(view -> {
            Intent intent12 = new Intent(WeaponActivity.this, Team_Maker.class);
            intent12.putExtra("size",genshin.size());
            for (int i=0;i<genshin.size();i++){
                intent12.putExtra("perso"+i,genshin.get(i));
            }
            startActivity(intent12);
            overridePendingTransition(R.anim.in, R.anim.out);
        });
        if (weapons.size()==0){
            doAlbedo();
        }else{
            ListView weaponList= (ListView) findViewById(R.id.listWeapon);
            CustomListWeapon weaponAdapter =new CustomListWeapon(getApplicationContext(),weapons);
            weaponList.setAdapter(weaponAdapter);
            weaponList.setOnItemClickListener((adapterView, view, i, l) -> {
                Intent intent13 = new Intent(WeaponActivity.this, activity_data_file_weapons.class);
                intent13.putExtra("perso", weapons.get(i));
                startActivity(intent13);
                overridePendingTransition(R.anim.in, R.anim.out);
            });
        }

    }
    public  void executeInThread(String url) {
        onPreExecute();
        ArrayList<String> testeur=new ArrayList<String>();
        testeur.add("https://api.npoint.io/36cecdb6a0ae2e4895bd");
        testeur.add("https://api.npoint.io/649735422ea0c8eef10a");
        testeur.add("https://api.npoint.io/07add52991cc14d56038 ");
        testeur.add("https://api.npoint.io/76ee728de11ac36d0b2c");
        testeur.add("https://api.npoint.io/885d8b3b6d0f6d1fd713");
        testeur.add("https://api.npoint.io/dd1aa0ebb23320816578");
        testeur.add("https://api.npoint.io/163dc57585a994337677");
        testeur.add("https://api.npoint.io/0f67fcbbc806815804f4");
        testeur.add("https://api.npoint.io/69eb1af940a8a01262e7");
        testeur.add("https://api.npoint.io/488f23d8661888d2b738");
        testeur.add("https://api.npoint.io/8fcaaccaf4e4e5465f33");
        testeur.add("https://api.npoint.io/cd5334750dba29e9d14f");
        testeur.add("https://api.npoint.io/73eb0a191b837945014a");
        testeur.add("https://api.npoint.io/f90ee4a908afc43029f2");
        testeur.add("https://api.npoint.io/783102cda0d77f679d08");
        testeur.add("https://api.npoint.io/09d82bf6148896d83470");
        testeur.add("https://api.npoint.io/4e15527687d9d38541c8");
        testeur.add("https://api.npoint.io/ce65db0cd936333ec02b");
        testeur.add("https://api.npoint.io/a20d27b2a63e523ae4ec");
        testeur.add("https://api.npoint.io/f1836634f5c465dfc0db");
        testeur.add("https://api.npoint.io/d05a628c67c4169e4b42");
        testeur.add("https://api.npoint.io/4c5d1bb430a48ae5bac3");
        testeur.add("https://api.npoint.io/d1e707ba2031e6355ea2");
        testeur.add("https://api.npoint.io/a70cd7c1ec1995729493");
        testeur.add("https://api.npoint.io/1e1aa4ae618c6897a09e");
        testeur.add("https://api.npoint.io/46f7b422b6ad8d38f234");
        testeur.add("https://api.npoint.io/2fb1453c955f74528385");
        testeur.add("https://api.npoint.io/5b207990ede24f838c47");
        testeur.add("https://api.npoint.io/277f1184d1703fcf5c9f");
        testeur.add("https://api.npoint.io/435bd7178e4ad0c2b449");
        testeur.add("https://api.npoint.io/2e7941bb8d3100c3e45b");
        testeur.add("https://api.npoint.io/dbea18feeb1c844ccb77");
        testeur.add("https://api.npoint.io/3411776312c04819e2ac");
        testeur.add("https://api.npoint.io/0c60820ba4e77a689fcf");
        testeur.add("https://api.npoint.io/d0eb569855daa9a5e4f4");
        testeur.add("https://api.npoint.io/0a8b0b10983812ce1fa7");
        testeur.add("https://api.npoint.io/8c3d1030b91862edfe01");
        testeur.add("https://api.npoint.io/5225f6cb1b3acf6f1aeb");
        testeur.add("https://api.npoint.io/6060445b117038418f03");
        testeur.add("https://api.npoint.io/ef6af5eb4222a732570c");
        testeur.add("https://api.npoint.io/8178b5cd42b7e6062c94");
        testeur.add("https://api.npoint.io/116c9db40304fde43fc6");
        testeur.add("https://api.npoint.io/37c7bc65b7e128764f4e");
        testeur.add("https://api.npoint.io/f5fd95bb4dd5cee73ef8");
        testeur.add("https://api.npoint.io/302e317b80421d296465");
        testeur.add("https://api.npoint.io/8cfeca3e542440d5a408");
        testeur.add("https://api.npoint.io/5d11703123e70f768881");
        testeur.add("https://api.npoint.io/03eb63995edf85e8fba2");
        testeur.add("https://api.npoint.io/8496c99ac249d3e41262");
        testeur.add("https://api.npoint.io/40bb154a9c2b0861fb17");
        testeur.add("https://api.npoint.io/052d8d663154922a09bd");
        testeur.add("https://api.npoint.io/2e1f1f1f1cb176c28a64");
        testeur.add("https://api.npoint.io/4aa29b61f059817170a5");
        testeur.add("https://api.npoint.io/a70e209862acb9108b84");
        testeur.add("https://api.npoint.io/99c7ecc177618da18c2d");
        testeur.add("https://api.npoint.io/79fead3b6065e36e5554");
        testeur.add("https://api.npoint.io/8740c5efc3447896149b");
        testeur.add("https://api.npoint.io/8fe5dc9a617f211c55bd");
        testeur.add("https://api.npoint.io/7c1c444fe21243681c53");
        testeur.add("https://api.npoint.io/33d9e9d7863aaefda81d");
        testeur.add("https://api.npoint.io/cf7f37d6b1761a9d8c8a");
        testeur.add("https://api.npoint.io/63064db3b3363523da5f");
        testeur.add("https://api.npoint.io/ad37ba28c3d07f7dc5b7");
        testeur.add("https://api.npoint.io/e97c66a3050a2d9f946b");
        testeur.add("https://api.npoint.io/db5bd1020635103c8058");
        testeur.add("https://api.npoint.io/08a34a24b0a2a0bc7a5c");
        testeur.add("https://api.npoint.io/92f862a40303ea30ae9f");
        testeur.add("https://api.npoint.io/a3b1888336cc45c788d5");
        testeur.add("https://api.npoint.io/2fc7cc2ef6371d6f7bef");
        testeur.add("https://api.npoint.io/c9259c131eb6b1602e64");
        testeur.add("https://api.npoint.io/d6e4de212609bcb38b5a");
        testeur.add("https://api.npoint.io/7b9fc897fbcb593e67dc");
        testeur.add("https://api.npoint.io/494e665990462a28cb7e");
        testeur.add("https://api.npoint.io/58edd769c071c9b29f7f");
        testeur.add("https://api.npoint.io/c1e7b67f062168916208");
        testeur.add("https://api.npoint.io/3e1d0f5f17615f08826d");
        testeur.add("https://api.npoint.io/a90e9b82d630e0ff321b");
        testeur.add("https://api.npoint.io/9e0f818ff73e3c54b618");
        testeur.add("https://api.npoint.io/0a3fca09f8f1804a8b41");
        testeur.add("https://api.npoint.io/2179034f68f7042245cd");
        testeur.add("https://api.npoint.io/c57dcb0d007fa452e81b");
        testeur.add("https://api.npoint.io/e31066f2511bca09c8e4");
        testeur.add("https://api.npoint.io/43f0e1069c2e1a87f395");
        testeur.add("https://api.npoint.io/22079ee65b25b4db20e1");
        testeur.add("https://api.npoint.io/8a007ee036e686733e53");
        testeur.add("https://api.npoint.io/d6c2454ba51ab4aad99e");
        testeur.add("https://api.npoint.io/b5320c046ac0784bfc61");
        testeur.add("https://api.npoint.io/df49cbc965596881ae0c");
        testeur.add("https://api.npoint.io/609491e258601b2e8c71");
        testeur.add("https://api.npoint.io/73f3c404242638d15846");
        testeur.add("https://api.npoint.io/447432870360d330bc29");
        testeur.add("https://api.npoint.io/b7bf904cd9c622fd8e36");
        testeur.add("https://api.npoint.io/4de57bdcefea33b57d2f");
        testeur.add("https://api.npoint.io/14a653587628ae85fa94");
        testeur.add("https://api.npoint.io/dbd8860834ba5a9f32ef");
        testeur.add("https://api.npoint.io/42cdec802c2af4b2c7e2");
        testeur.add("https://api.npoint.io/eacdba8aa323c8a5f49a");
        testeur.add("https://api.npoint.io/c6cbb76192ecd4fe099e");
        testeur.add("https://api.npoint.io/c45d632b4cb9f2055e54");
        testeur.add("https://api.npoint.io/ead952f155a7efaf6432");
        testeur.add("https://api.npoint.io/ec874103769ca4a56baa");
        testeur.add("https://api.npoint.io/11a443b905a2cf804d94");
        testeur.add("https://api.npoint.io/7b9e81e30e851d4e028f");
        testeur.add("https://api.npoint.io/1c2507f8a31ffc23796e");
        testeur.add("https://api.npoint.io/9a7a4ecf552e9d6fbacb");
        testeur.add("https://api.npoint.io/b0962abd8bae830784ee");
        testeur.add("https://api.npoint.io/3bc587998d5186673ea7");
        testeur.add("https://api.npoint.io/e970aef0b03b45a88a62");
        testeur.add("https://api.npoint.io/228bcdd9b4735daad2a1");
        testeur.add("https://api.npoint.io/c571c60aa86c9ded2b1b");
        testeur.add("https://api.npoint.io/bbddaf09319298b3bd31");
        testeur.add("https://api.npoint.io/b924cbc10d91f9598b15");
        testeur.add("https://api.npoint.io/8b60dd6301d2788cd6d2");
        testeur.add("https://api.npoint.io/c6bef5237c38540c7d67");
        testeur.add("https://api.npoint.io/dde00d46c1ed6b3b28ca");
        testeur.add("https://api.npoint.io/6515fa92e551593f77a0");
        testeur.add("https://api.npoint.io/008d29a034ad8a603b86");
        testeur.add("https://api.npoint.io/9da3b738a6b3443bd7c5");


        testeurSize=testeur.size();
        for (int i=0;i<testeur.size();i++){

            WeaponHttpAsyncGet getCharacter = new WeaponHttpAsyncGet(testeur.get(i));
            Runnable runnable = ()->{
                getCharacter.doInBackGround();
                runOnUiThread(() ->onPostExecute(getCharacter.getItemResult()));
            };
            Executors.newSingleThreadExecutor().execute( runnable );
        }

    }

    /**
     *
     * @param characterInfo
     */
    private  void onPostExecute(ArrayList<String> characterInfo) {

        Arme perso=new Arme(characterInfo.get(0),characterInfo.get(1),characterInfo.get(2),characterInfo.get(3),
                characterInfo.get(4),characterInfo.get(5),characterInfo.get(6));
        weapons.add(perso);
        ListView persos= (ListView) findViewById(R.id.listWeapon);
        ArrayList<String> testAlbedo= new ArrayList<String>() ;
        for (int i=0;i<weapons.size();i++){
            testAlbedo.add(weapons.get(i).toString());
        }
        testAlbedo.add("test");
        count++;
        if (count==testeurSize){
            progressDialog.dismiss();
            PictureGiver pictureGiver =new PictureGiver(weapons);
            weapons = pictureGiver.SendImageWeapon();
            CustomListWeapon weaponAdapter =new CustomListWeapon(getApplicationContext(),weapons);
            persos.setAdapter(weaponAdapter);
            persos.setOnItemClickListener((adapterView, view, i, l) -> {
                Intent intent = new Intent(WeaponActivity.this, activity_data_file_weapons.class);
                intent.putExtra("perso", weapons.get(i));
                startActivity(intent);
                overridePendingTransition(R.anim.in, R.anim.out);
            });
        }
        Log.d("Quentin", "size: "+weapons.size());

    }
    public void doAlbedo(){
        executeInThread("");
    }

    private void onPreExecute() {
        progressDialog = new ProgressDialog(WeaponActivity.this);
        progressDialog.setMessage("Connexion en cours...");
        progressDialog.setCancelable(false);
        progressDialog.show();
    }
}