package kurs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsi.KursInterfejs;

public class PromenaKursa implements KursInterfejs {
	
	private  LinkedList<Kurs> kursevi;

	@Override
	public boolean dodajKurs(String nazivValute, String skrNazivValute, String vrsta, double iznos,
			GregorianCalendar datum) {
		
		Kurs noviKurs = new Kurs();
		
		noviKurs.setNazivValute(skrNazivValute);
		noviKurs.setSkrNazivValute(skrNazivValute);
		noviKurs.setVrsta(vrsta);
		noviKurs.setIznos(iznos);
		noviKurs.setDatum(datum);
		if(kursevi.contains(noviKurs)) return false;
		
		kursevi.add(noviKurs);		
		return true;

	}

	@Override
	public boolean obrisiKurs(String skrNazivValute, String vrsta, GregorianCalendar datum) {
		
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).getSkrNazivValute().equals(skrNazivValute) && 
					kursevi.get(i).getVrsta().equals(vrsta) && kursevi.get(i).getDatum().equals(datum))
				kursevi.remove(kursevi.get(i));			
		}		
		return true;
	}

	@Override
	public Kurs vratiKurs(String skrNazivValute, String vrsta, GregorianCalendar datum) {
		
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).getSkrNazivValute().equals(skrNazivValute) && 
					kursevi.get(i).getVrsta().equals(vrsta) && kursevi.get(i).getDatum().equals(datum))
				return kursevi.get(i);			
		}		
		return null;
	}

}
