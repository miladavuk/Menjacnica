package kurs;

import java.util.GregorianCalendar;

import interfejsi.KursInterfejs;

public class PromenaKursa implements KursInterfejs {	

	@Override
	public boolean dodajKurs(String nazivValute, String skrNazivValute, String vrsta, double iznos,
			GregorianCalendar datum) {			
		if(datum!=null)
			return true;
		return false;
	}

	@Override
	public boolean obrisiKurs(String skrNazivValute, String vrsta, GregorianCalendar datum) {		
		return false;
	}

	@Override
	public Kurs vratiKurs(String skrNazivValute, String vrsta, GregorianCalendar datum) {		
		return null;
	}

}
