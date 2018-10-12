package diabeteJava;

public class Individu {
	
	private String Nom;
	private String Prenom;
	private String NumSecu;
	private static String Sexe;
	
	
	public Individu(String nom, String prenom, String numSecu, String sexe) {
		Nom = nom;
		Prenom = prenom;

		NumSecu = numSecu;
		Sexe = sexe;
	}


	public static String getSexe() {
		return Sexe;
	}


	public void setSexe(String sexe) {
		Sexe = sexe;
	}
}
