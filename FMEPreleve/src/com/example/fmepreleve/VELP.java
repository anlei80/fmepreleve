package com.example.fmepreleve;

public class VELP extends Dossier{

	private static final long serialVersionUID = -4970369682193471147L;
	
	private Integer environTravail;
	
	private String nomOperateur;
	
	private String tache;
	
	private String dureeTache;
	
	private String referenceGEH;
	
	private Integer evaluationInitial;
	
	private String evaluationPeriodique;
	
	private String incidents;
	
	private Boolean preleveSuccessif;
	
	private Integer nbrPeleve;
	
	private Integer protection;
	
	private String conditions;

	public Integer getEnvironTravail() {
		return environTravail;
	}

	public void setEnvironTravail(Integer environTravail) {
		this.environTravail = environTravail;
	}

	public String getNomOperateur() {
		return nomOperateur;
	}

	public void setNomOperateur(String nomOperateur) {
		this.nomOperateur = nomOperateur;
	}

	public String getTache() {
		return tache;
	}

	public void setTache(String tache) {
		this.tache = tache;
	}

	public String getDureeTache() {
		return dureeTache;
	}

	public void setDureeTache(String dureeTache) {
		this.dureeTache = dureeTache;
	}

	public String getReferenceGEH() {
		return referenceGEH;
	}

	public void setReferenceGEH(String referenceGEH) {
		this.referenceGEH = referenceGEH;
	}

	public Integer getEvaluationInitial() {
		return evaluationInitial;
	}

	public void setEvaluationInitial(Integer evaluationInitial) {
		this.evaluationInitial = evaluationInitial;
	}

	public String getEvaluationPeriodique() {
		return evaluationPeriodique;
	}

	public void setEvaluationPeriodique(String evaluationPeriodique) {
		this.evaluationPeriodique = evaluationPeriodique;
	}

	public String getIncidents() {
		return incidents;
	}

	public void setIncidents(String incidents) {
		this.incidents = incidents;
	}

	public Boolean getPreleveSuccessif() {
		return preleveSuccessif;
	}

	public void setPreleveSuccessif(Boolean preleveSuccessif) {
		this.preleveSuccessif = preleveSuccessif;
	}

	public Integer getNbrPeleve() {
		return nbrPeleve;
	}

	public void setNbrPeleve(Integer nbrPeleve) {
		this.nbrPeleve = nbrPeleve;
	}

	public Integer getProtection() {
		return protection;
	}

	public void setProtection(Integer protection) {
		this.protection = protection;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	
	
}
