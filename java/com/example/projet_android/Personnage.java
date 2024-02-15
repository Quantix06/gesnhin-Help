package com.example.projet_android;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Defines a character
 * @author MARCHAL ESTRADA SAVE
 * @version 1
 */
public class Personnage implements Parcelable {
    String nom;
    String rarete;
    String description;
    String nomAtaque1;
    String descpNomAtaque1;
    String nomAtaque2;
    String descpNomAtaque2;
    String element;
    String arme;
    String region;
    int imgPerso;

    /**
     *
     * @param nom
     * @param rarete
     * @param description
     * @param nomAtaque1
     * @param descpNomAtaque1
     * @param nomAtaque2
     * @param descpNomAtaque2
     * @param vision
     * @param arme
     * @param region
     */
    public Personnage(String nom,String rarete, String description, String nomAtaque1,
                      String descpNomAtaque1, String nomAtaque2, String descpNomAtaque2,
                      String vision,String arme,String region){

        this.nom=nom;
        this.rarete=rarete;
        this.description=description;
        this.nomAtaque1=nomAtaque1;
        this.descpNomAtaque1=descpNomAtaque1;
        this.nomAtaque2=nomAtaque2;
        this.descpNomAtaque2=descpNomAtaque2;
        this.arme=arme;
        this.element=vision;
        this.region=region;
    }

    protected Personnage(Parcel in) {
        nom = in.readString();
        rarete = in.readString();
        description = in.readString();
        nomAtaque1 = in.readString();
        descpNomAtaque1 = in.readString();
        nomAtaque2 = in.readString();
        descpNomAtaque2 = in.readString();
        element = in.readString();
        arme = in.readString();
        region = in.readString();
        imgPerso = in.readInt();
    }

    public static final Creator<Personnage> CREATOR = new Creator<Personnage>() {
        @Override
        public Personnage createFromParcel(Parcel in) {
            return new Personnage(in);
        }

        @Override
        public Personnage[] newArray(int size) {
            return new Personnage[size];
        }
    };

    @Override
    public String toString() {
        return "Personnage{" +
                "rarete='" + rarete + '\'' +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", nomAtaque1='" + nomAtaque1 + '\'' +
                ", descpNomAtaque1='" + descpNomAtaque1 + '\'' +
                ", nomAtaque2='" + nomAtaque2 + '\'' +
                ", descpNomAtaque2='" + descpNomAtaque2 + '\'' +
                ", element='" + element + '\'' +
                ", arme='" + arme + '\'' +
                ", region='" + region + '\'' +
                ", imgPerso=" + imgPerso +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public int getImgPerso() {
        return imgPerso;
    }

    public String getElement() {
        return element;
    }

    public String getNomAtaque1() {
        return nomAtaque1;
    }

    public String getNomAtaque2() {
        return nomAtaque2;
    }

    public String getRarete() {
        return rarete;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nom);
        parcel.writeString(rarete);
        parcel.writeString(description);
        parcel.writeString(nomAtaque1);
        parcel.writeString(descpNomAtaque1);
        parcel.writeString(nomAtaque2);
        parcel.writeString(descpNomAtaque2);
        parcel.writeString(arme);
        parcel.writeString(element);
        parcel.writeString(region);
        parcel.writeInt(imgPerso);

    }
}
