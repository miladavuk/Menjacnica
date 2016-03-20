package interfejsi;

import java.util.GregorianCalendar;

import kurs.Kurs;

public interface KursInterfejs {
	
	public boolean dodajKurs(String nazivValute, String skrNazivValute,String vrsta, double iznos, GregorianCalendar datum);
	public boolean obrisiKurs(String skrNazivValute, String vrsta, GregorianCalendar datum);
	public Kurs vratiKurs(String skrNazivValute, String vrsta, GregorianCalendar datum);


}
