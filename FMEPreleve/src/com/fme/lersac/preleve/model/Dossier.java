package com.fme.lersac.preleve.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import android.os.Parcel;
import android.os.Parcelable;

public class Dossier implements Parcelable, Serializable {
	
	private static final long serialVersionUID = -6893350046398383149L;


	public static final Parcelable.Creator<Dossier> CREATOR = new Parcelable.Creator<Dossier>() {
		  @Override
		  public Dossier createFromParcel(Parcel source) {
		    return new Dossier(source);
		  }

		  @Override
		  public Dossier[] newArray(int size) {
		    return new Dossier[size];
		  }
	};

	
	private String client;
	
	private String lieu;
	
	private String fonctionBati;
	
	private String refFme;
	
	private String numFiltre;
	
	private String numTemoin;
	
	private String numBlanc;
	
	private Boolean ventilation;
	
	private Boolean zoneConfinee;
	
	private Boolean humidification;
	
	private Boolean captage;
	
	private Boolean faisantPartiEnsemble;
	
	private String natureMateriau;
	
	private Integer typeAnalyse;
	
	private String localisation;
	
	private String numVentilateur;
	
	private String dureeSimulation;
	
	private String conditionParticulère;
	
	private String numPompe;
	
	private String numProgrammeur;
	
	private String numChronometre;
	
	private String numTeteCATHIA;
	
	private BigDecimal coefDerive;
	
	private String numBattrie;
	
	private Date debutPrelevment;
	
	private Date finPrelevement;
	
	private BigDecimal tempsExpDebut;
	
	private BigDecimal tempsExpFin;
	
	private String nomPreleveur;
	
	private BigDecimal verifDebitDebut1;
	
	private BigDecimal verifDebitDebut2;
	
	private BigDecimal verifDebitDebut3;
	
	private BigDecimal verifDebitFin1;
	
	private BigDecimal verifDebitFin2;
	
	private BigDecimal verifDebitFin3;
	
	private BigDecimal releveCompteur;
	
	private BigDecimal releveDebutCompteur;
	
	private BigDecimal releveFinCompteur;
	

	public Dossier() {
		
	}
	
	public Dossier(Parcel in) {
		refFme = in.readString();
	}


	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(refFme);
		
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getFonctionBati() {
		return fonctionBati;
	}

	public void setFonctionBati(String fonctionBati) {
		this.fonctionBati = fonctionBati;
	}

	public String getRefFme() {
		return refFme;
	}

	public void setRefFme(String refFme) {
		this.refFme = refFme;
	}

	public String getNumFiltre() {
		return numFiltre;
	}

	public void setNumFiltre(String numFiltre) {
		this.numFiltre = numFiltre;
	}

	public String getNumTemoin() {
		return numTemoin;
	}

	public void setNumTemoin(String numTemoin) {
		this.numTemoin = numTemoin;
	}

	public String getNumBlanc() {
		return numBlanc;
	}

	public void setNumBlanc(String numBlanc) {
		this.numBlanc = numBlanc;
	}

	public Boolean getVentilation() {
		return ventilation;
	}

	public void setVentilation(Boolean ventilation) {
		this.ventilation = ventilation;
	}

	public Boolean getZoneConfinee() {
		return zoneConfinee;
	}

	public void setZoneConfinee(Boolean zoneConfinee) {
		this.zoneConfinee = zoneConfinee;
	}

	public Boolean getHumidification() {
		return humidification;
	}

	public void setHumidification(Boolean humidification) {
		this.humidification = humidification;
	}

	public Boolean getCaptage() {
		return captage;
	}

	public void setCaptage(Boolean captage) {
		this.captage = captage;
	}

	public Boolean getFaisantPartiEnsemble() {
		return faisantPartiEnsemble;
	}

	public void setFaisantPartiEnsemble(Boolean faisantPartiEnsemble) {
		this.faisantPartiEnsemble = faisantPartiEnsemble;
	}

	public String getNatureMateriau() {
		return natureMateriau;
	}

	public void setNatureMateriau(String natureMateriau) {
		this.natureMateriau = natureMateriau;
	}

	public Integer getTypeAnalyse() {
		return typeAnalyse;
	}

	public void setTypeAnalyse(Integer typeAnalyse) {
		this.typeAnalyse = typeAnalyse;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public String getNumVentilateur() {
		return numVentilateur;
	}

	public void setNumVentilateur(String numVentilateur) {
		this.numVentilateur = numVentilateur;
	}

	public String getDureeSimulation() {
		return dureeSimulation;
	}

	public void setDureeSimulation(String dureeSimulation) {
		this.dureeSimulation = dureeSimulation;
	}

	public String getConditionParticulère() {
		return conditionParticulère;
	}

	public void setConditionParticulère(String conditionParticulère) {
		this.conditionParticulère = conditionParticulère;
	}

	public String getNumPompe() {
		return numPompe;
	}

	public void setNumPompe(String numPompe) {
		this.numPompe = numPompe;
	}

	public String getNumProgrammeur() {
		return numProgrammeur;
	}

	public void setNumProgrammeur(String numProgrammeur) {
		this.numProgrammeur = numProgrammeur;
	}

	public String getNumChronometre() {
		return numChronometre;
	}

	public void setNumChronometre(String numChronometre) {
		this.numChronometre = numChronometre;
	}

	public String getNumTeteCATHIA() {
		return numTeteCATHIA;
	}

	public void setNumTeteCATHIA(String numTeteCATHIA) {
		this.numTeteCATHIA = numTeteCATHIA;
	}

	public BigDecimal getCoefDerive() {
		return coefDerive;
	}

	public void setCoefDerive(BigDecimal coefDerive) {
		this.coefDerive = coefDerive;
	}

	public String getNumBattrie() {
		return numBattrie;
	}

	public void setNumBattrie(String numBattrie) {
		this.numBattrie = numBattrie;
	}

	public Date getDebutPrelevment() {
		return debutPrelevment;
	}

	public void setDebutPrelevment(Date debutPrelevment) {
		this.debutPrelevment = debutPrelevment;
	}

	public Date getFinPrelevement() {
		return finPrelevement;
	}

	public void setFinPrelevement(Date finPrelevement) {
		this.finPrelevement = finPrelevement;
	}

	public BigDecimal getTempsExpDebut() {
		return tempsExpDebut;
	}

	public void setTempsExpDebut(BigDecimal tempsExpDebut) {
		this.tempsExpDebut = tempsExpDebut;
	}

	public BigDecimal getTempsExpFin() {
		return tempsExpFin;
	}

	public void setTempsExpFin(BigDecimal tempsExpFin) {
		this.tempsExpFin = tempsExpFin;
	}

	public String getNomPreleveur() {
		return nomPreleveur;
	}

	public void setNomPreleveur(String nomPreleveur) {
		this.nomPreleveur = nomPreleveur;
	}

	public BigDecimal getVerifDebitDebut1() {
		return verifDebitDebut1;
	}

	public void setVerifDebitDebut1(BigDecimal verifDebitDebut1) {
		this.verifDebitDebut1 = verifDebitDebut1;
	}

	public BigDecimal getVerifDebitDebut2() {
		return verifDebitDebut2;
	}

	public void setVerifDebitDebut2(BigDecimal verifDebitDebut2) {
		this.verifDebitDebut2 = verifDebitDebut2;
	}

	public BigDecimal getVerifDebitDebut3() {
		return verifDebitDebut3;
	}

	public void setVerifDebitDebut3(BigDecimal verifDebitDebut3) {
		this.verifDebitDebut3 = verifDebitDebut3;
	}

	public BigDecimal getVerifDebitFin1() {
		return verifDebitFin1;
	}

	public void setVerifDebitFin1(BigDecimal verifDebitFin1) {
		this.verifDebitFin1 = verifDebitFin1;
	}

	public BigDecimal getVerifDebitFin2() {
		return verifDebitFin2;
	}

	public void setVerifDebitFin2(BigDecimal verifDebitFin2) {
		this.verifDebitFin2 = verifDebitFin2;
	}

	public BigDecimal getVerifDebitFin3() {
		return verifDebitFin3;
	}

	public void setVerifDebitFin3(BigDecimal verifDebitFin3) {
		this.verifDebitFin3 = verifDebitFin3;
	}

	public BigDecimal getReleveCompteur() {
		return releveCompteur;
	}

	public void setReleveCompteur(BigDecimal releveCompteur) {
		this.releveCompteur = releveCompteur;
	}

	public BigDecimal getReleveDebutCompteur() {
		return releveDebutCompteur;
	}

	public void setReleveDebutCompteur(BigDecimal releveDebutCompteur) {
		this.releveDebutCompteur = releveDebutCompteur;
	}

	public BigDecimal getReleveFinCompteur() {
		return releveFinCompteur;
	}

	public void setReleveFinCompteur(BigDecimal releveFinCompteur) {
		this.releveFinCompteur = releveFinCompteur;
	}
	
	
	
	
}
