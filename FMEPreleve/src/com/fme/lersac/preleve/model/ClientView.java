package com.fme.lersac.preleve.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ClientView implements Parcelable{

	private Integer idClient;
	
	private String raisonSocial;
	
	public ClientView() {
		
	}
	
	public ClientView(Parcel source) {
		idClient = source.readInt();
		raisonSocial = source.readString();
	}

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public String getRaisonSocial() {
		return raisonSocial;
	}

	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(idClient);
		dest.writeString(raisonSocial);
	}
	
	
}
