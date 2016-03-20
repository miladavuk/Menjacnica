package kurs;

import java.util.*;

public class Kurs {
	
	private String nazivValute;
	private String skrNazivValute;
	private String vrsta; //prodajni, kupovni ili srednji
	private double iznos;
	private GregorianCalendar datum;
	
	
	public String getNazivValute() {
		return nazivValute;
	}
	public void setNazivValute(String nazivValute) {
		this.nazivValute = nazivValute;
	}
	public String getSkrNazivValute() {
		return skrNazivValute;
	}
	public void setSkrNazivValute(String skrNazivValute) {
		this.skrNazivValute = skrNazivValute;
	}
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	public double getIznos() {
		return iznos;
	}
	public void setIznos(double iznos) {
		this.iznos = iznos;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	
	
}
