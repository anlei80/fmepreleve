package com.fme.lersac.preleve.model;

import android.os.Parcel;
import android.os.Parcelable;

public class PersonnelView implements Parcelable {
	
	private int id;
	
	private String nom;
	
	private String prenom;

	public PersonnelView() {

	}
	
	public PersonnelView(Parcel source) {
		this.id = source.readInt();
		this.nom = source.readString();
		this.prenom = source.readString();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getPrenomNom() {
		return this.getNom() + " " + this.getPrenom();
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(id);
		dest.writeString(nom);
		dest.writeString(prenom);
	}
	
	public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {

        @Override
        public PersonnelView createFromParcel(Parcel source) {
            return new PersonnelView(source);
        }

        @Override
        public PersonnelView[] newArray(int size) {
            return new PersonnelView[size];
        }

    };
    
    @Override
    public String toString() {
        return getPrenomNom();
    }
}
