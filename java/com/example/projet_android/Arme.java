package com.example.projet_android;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Defines a weapon
 * @author MARCHAL ESTRADA SAVE
 * @version 1
 */
public class Arme implements Parcelable {
    String rarete;
    String nom;
    String description;
    String atq;
    String typeSubstat;
    String substat;
    String effet;
    int image;

    /**
     *
     * @param rarete
     * @param nom
     * @param description
     * @param atq
     * @param typeSubstat
     * @param substat
     * @param effet
     */
    public Arme (String rarete,String nom,String description,String atq,
                 String typeSubstat, String substat,String effet){
        this.rarete=rarete;
        this.nom=nom;
        this.description=description;
        this.atq=atq;
        this.typeSubstat=typeSubstat;
        this.substat=substat;
        this.effet=effet;
    }

    /**
     *
     * @param in
     */
    protected Arme(Parcel in) {
        rarete = in.readString();
        nom = in.readString();
        description = in.readString();
        atq = in.readString();
        typeSubstat = in.readString();
        substat = in.readString();
        effet = in.readString();
        image = in.readInt();
    }

    public static final Creator<Arme> CREATOR = new Creator<Arme>() {

        /**
         *
         * @param in
         * @return
         */
        @Override
        public Arme createFromParcel(Parcel in) {
            return new Arme(in);
        }

        /**
         *
         * @param size
         * @return
         */
        @Override
        public Arme[] newArray(int size) {
            return new Arme[size];
        }
    };

    @Override
    public String toString() {
        return "Arme{" +
                "rarete='" + rarete + '\'' +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", atq='" + atq + '\'' +
                ", typeSubstat='" + typeSubstat + '\'' +
                ", substat='" + substat + '\'' +
                ", effet='" + effet + '\'' +
                ", image=" + image +
                '}';
    }

    public int getImage() {
        return image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    /**
     *
     * @param parcel
     * @param i
     */
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(rarete);
        parcel.writeString(nom);
        parcel.writeString(description);
        parcel.writeString(atq);
        parcel.writeString(typeSubstat);
        parcel.writeString(substat);
        parcel.writeString(effet);
        parcel.writeInt(image);
    }
}

