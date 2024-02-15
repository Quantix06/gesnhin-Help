package com.example.projet_android;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

/**
 * Custom adapter for a list of characters
 * @author MARCHAL ESTRADA SAVE
 * @version 1
 */
public class CustomList extends BaseAdapter {
    private final ListCharacter listData;
    private final LayoutInflater layoutInflater;
    private final Context context;
    public CustomList(Context aContext, ListCharacter listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }
    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int i) {
        return listData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    /**
     *
     * @param i
     * @param view
     * @param viewGroup
     * @return
     */
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ConstraintLayout layoutItem ;
        if (view==null){
            layoutItem = (ConstraintLayout) layoutInflater.inflate(R.layout.nom_personnage,viewGroup, false);
        }else {
            layoutItem = (ConstraintLayout) view;
        }
        TextView nom= (TextView)layoutItem.findViewById(R.id.nom);
        Log.d("quentin","i="+i);
        Log.d("quentin",listData.toString());
        Log.d("quentin",nom+"");
        nom.setText(listData.get(i).nom);
        ImageView img= (ImageView)layoutItem.findViewById(R.id.pfp);
        img.setImageResource(listData.get(i).getImgPerso());
        return layoutItem;
    }
}
