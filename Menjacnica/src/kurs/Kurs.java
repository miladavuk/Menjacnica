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
		if(nazivValute==null) throw new RuntimeException("Naziv valute ne sme biti null!");
		this.nazivValute = nazivValute;
	}
	public String getSkrNazivValute() {
		return skrNazivValute;
	}
	public void setSkrNazivValute(String skrNazivValute) {
		if(skrNazivValute==null) throw new RuntimeException("Skraceni naziv valute ne sme biti null!");
		this.skrNazivValute = skrNazivValute;
	}
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		if(vrsta==null) throw new RuntimeException("Vrsta kursa ne sme biti null!");
		this.vrsta = vrsta;
	}
	public double getIznos() {
		return iznos;
	}
	public void setIznos(double iznos) {
		if(iznos<=0) throw new RuntimeException("Iznos mora biti veci od nule!");
		this.iznos = iznos;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum==null) throw new RuntimeException("Datum ne sme biti null!");
		this.datum = datum;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((skrNazivValute == null) ? 0 : skrNazivValute.hashCode());
		result = prime * result + ((vrsta == null) ? 0 : vrsta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (skrNazivValute == null) {
			if (other.skrNazivValute != null)
				return false;
		} else if (!skrNazivValute.equals(other.skrNazivValute))
			return false;
		if (vrsta == null) {
			if (other.vrsta != null)
				return false;
		} else if (!vrsta.equals(other.vrsta))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Kurs [nazivValute=" + nazivValute + ", skrNazivValute=" + skrNazivValute + ", vrsta=" + vrsta
				+ ", iznos=" + iznos + ", datum=" + datum + "]";
	}
	
}
