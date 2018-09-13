package diabeteJava;

public class Individu {
	
	private String Nom;
	private String Prenom;
	private String DateNaissance;
	private String NumSecu;
	private String Sexe;
	
	
	public Individu(String nom, String prenom, String dateNaissance, String numSecu, String sexe) {
		Nom = nom;
		Prenom = prenom;
		DateNaissance = dateNaissance;
		NumSecu = numSecu;
		Sexe = sexe;
	}


	public String getSexe() {
		return Sexe;
	}


	public void setSexe(String sexe) {
		Sexe = sexe;
	}
}
