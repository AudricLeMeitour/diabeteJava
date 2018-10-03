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
	
	public int ResultAge(String Age) {
		if (Critere.getAge() == "R1")
			this.Resultat = 0;
		if (Critere.getAge() == "R2")
			this.Resultat = 2;
		
	}

	

}
