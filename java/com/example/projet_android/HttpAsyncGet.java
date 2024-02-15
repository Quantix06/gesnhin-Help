package com.example.projet_android;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Collects JSON characters data file
 * @author MARCHAL ESTRADA SAVE
 * @version 1
 */
public class HttpAsyncGet{
    private static final String TAG = "estrada " + HttpAsyncGet.class.getSimpleName();
    private final String urlAddress;
    private final ArrayList infoList;
    private final HttpHandler webService;

    public HttpAsyncGet(String url) {
        super();
        this.urlAddress = url;
        webService = new HttpHandler();
        infoList = new ArrayList();
    }

    public void doInBackGround(){
        String name;
        String description;
        String rarete;
        String arme;
        String region;
        String nomAtaque1;
        String descpNomAtaque1;
        String nomAtaque2;
        String descpNomAtaque2;

        String element;

        // get the jsonStr to parse
        String jsonStr = webService.makeServiceCall(urlAddress);

        //parse jsonStr
        if (jsonStr != null) {
            try {
                JSONObject jsonObj = new JSONObject(jsonStr);

                name = jsonObj.getString("name");
                arme = jsonObj.getString("weapon_type");
                description = jsonObj.getString("description");
                region = jsonObj.getString("region");
                rarete = jsonObj.getString("rarity");
                element = jsonObj.getString("element");
                JSONArray currentSkills =jsonObj.getJSONArray("skills");
                JSONObject sk1 = currentSkills.getJSONObject(1);
                nomAtaque1=sk1.getString("name");
                descpNomAtaque1=sk1.getString("description");
                JSONObject sk2 = currentSkills.getJSONObject(2);
                nomAtaque2=sk2.getString("name");
                descpNomAtaque2=sk2.getString("description");


                infoList.add(name);
                infoList.add(rarete);
                infoList.add(description);
                infoList.add(nomAtaque1);
                infoList.add(descpNomAtaque1);
                infoList.add(nomAtaque2);
                infoList.add(descpNomAtaque2);
                infoList.add(arme);
                infoList.add(element);
                infoList.add(region);

            } catch (final JSONException e) {
                Log.d(TAG, "Erreur JSON " + e.getMessage());
            }
        } else {
            Log.e(TAG, "Probleme connexion ");
        }
        Log.d(TAG, "Parfait");
    }

    public ArrayList<String> getItemResult() {
        return infoList;
    }

    static class HttpHandler { //innerClass

        public String makeServiceCall(String reqUrl) {
            String response = null;
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(reqUrl).openConnection();
                connection.setRequestMethod("GET");
                // lecture du fichier
                InputStream inputStream = new BufferedInputStream(connection.getInputStream());
                response = convertStreamToString(inputStream);
            } catch (MalformedURLException e) {
                Log.e(TAG, "MalformedURLException: " + e.getMessage());
            } catch (ProtocolException e) {
                Log.e(TAG, "ProtocolException: " + e.getMessage());
            } catch (IOException e) {
                Log.e(TAG, "IOException: " + e.getMessage());
            } catch (Exception e) {
                Log.e(TAG, "Exception: " + e.getMessage());
            }
            return response;
        }

        //Conversion flux en String
        private String convertStreamToString(InputStream inputStream) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            try {
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line).append('\n');
                    Log.e(TAG,line);
                }
            }
            catch (IOException e) {  e.printStackTrace();   }
            finally {
                try { inputStream.close(); } catch (IOException e) { e.printStackTrace();  }
            }
            return stringBuilder.toString();
        }
    }
}