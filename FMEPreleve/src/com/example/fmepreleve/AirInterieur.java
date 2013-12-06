package com.example.fmepreleve;

import java.math.BigDecimal;

public class AirInterieur extends Dossier {

	private static final long serialVersionUID = 6292613724448018094L;
	
	private Boolean plan;
	
	private BigDecimal surface;
	
	private Boolean simulation;
	
	private Integer methode;

	public Boolean getPlan() {
		return plan;
	}

	public void setPlan(Boolean plan) {
		this.plan = plan;
	}

	public BigDecimal getSurface() {
		return surface;
	}

	public void setSurface(BigDecimal surface) {
		this.surface = surface;
	}

	public Boolean getSimulation() {
		return simulation;
	}

	public void setSimulation(Boolean simulation) {
		this.simulation = simulation;
	}

	public Integer getMethode() {
		return methode;
	}

	public void setMethode(Integer methode) {
		this.methode = methode;
	}


}
