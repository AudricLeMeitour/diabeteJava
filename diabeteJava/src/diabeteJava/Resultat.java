package diabeteJava;

public class Resultat {
	
	private int Somme;
	private int Resultat;
	
	
	public Resultat(int somme, int resultat) {
		Somme = somme;
		Resultat = resultat;
	}
	
	public int getResultat() {
		return Resultat;
	}


	public void setResultat(int resultat) {
		Resultat = resultat;
	}
	
	public int ResultAge() {
		if (Critere.getAge() == "R1")
			Resultat = 0;
		if (Critere.getAge() == "R2")
			Resultat = 2;
		
	}
	
	public int ResultatTDT() {
		if (Critere.getTourDT() == "R1")
			Resultat = 0;
		if (Critere.getTourDT() == "R2")
			Resultat = 3;
		if (Critere.getTourDT() == "R3")
			Resultat = 4;
	}

}
