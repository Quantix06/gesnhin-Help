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
 * Collects JSON weapons data file
 * @author MARCHAL ESTRADA SAVE
 * @version 1
 */
public class WeaponHttpAsyncGet {
    private static final String TAG = "estrada " + HttpAsyncGet.class.getSimpleName();
    private final String urlAddress;
    private final ArrayList infoList;
    private HttpHandler webService;

    public WeaponHttpAsyncGet(String url) {
        super();
        this.urlAddress = url;
        webService = new HttpHandler();
        infoList = new ArrayList();
    }

    public void doInBackGround(){
        String name = "null";
        String rarete="null";
        String arme = "null";
        String bonus = "null";
        String secondary = "null" ;
        String secondaryStat = "null" ;
        String firstStat= "null";

        // get the jsonStr to parse
        String jsonStr = webService.makeServiceCall(urlAddress);
        Log.d(TAG, "doInBackGround: ");
        //parse jsonStr
        if (jsonStr != null) {
            try {
                JSONObject jsonObj = new JSONObject(jsonStr);

                name = jsonObj.getString("name");
                arme = jsonObj.getString("type");
                bonus = jsonObj.getString("bonus");
                rarete = jsonObj.getString("rarity");

                JSONObject stats = jsonObj.getJSONObject("stats");
                secondary = stats.getString("secondary");
                JSONArray finalstat = stats.getJSONArray("levels");
                JSONObject sk2 = finalstat.getJSONObject(13);
                firstStat=sk2.getString("primary");
                secondaryStat=sk2.getString("secondary");

                infoList.add(rarete);
                infoList.add(name);
                infoList.add(bonus);
                infoList.add(arme);
                infoList.add(secondary);
                infoList.add(firstStat);
                infoList.add(secondaryStat);

            } catch (final JSONException e) {
                Log.d(TAG, "Erreur JSON " + e.getMessage());
            }
        } else {
            Log.e(TAG, "Probleme connexion ");
        }
        Log.d(TAG, "Parfait");
    }

    public ArrayList <String> getItemResult() {
        return infoList;
    }

    class HttpHandler { //innerClass

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
