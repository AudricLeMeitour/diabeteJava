package diabeteJava;
import diabeteJava.Main;

public class Resultat {
	
	private int Somme;
	private int ResultatAge;
	private int ResultatActivitePhy;
	private int ResultatATCDAntiHTA;
	private int ResultatATCDDiabete;
	private int ResultatATCDGlycePlus;
	private int ResultatIMC;
	private int ResultatPartLegume;
	private int ResultatTDT;
	
	
	public Resultat(int somme, int resultatAge, int resultatActivitePhy, int resultatATCDAntiHTA,
			int resultatATCDDiabete, int resultatATCDGlycePlus, int resultatIMC, int resultatPartLegume,
			int resultatTDT) {
		super();
		Somme = somme;
		ResultatAge = resultatAge;
		ResultatActivitePhy = resultatActivitePhy;
		ResultatATCDAntiHTA = resultatATCDAntiHTA;
		ResultatATCDDiabete = resultatATCDDiabete;
		ResultatATCDGlycePlus = resultatATCDGlycePlus;
		ResultatIMC = resultatIMC;
		ResultatPartLegume = resultatPartLegume;
		ResultatTDT = resultatTDT;
	}

	public int ResultAge(String reponseAge) {
		if (reponseAge == "R1")
			ResultatAge = 0;
		if (reponseAge == "R2")
			ResultatAge = 2;
		if (reponseAge == "R3")
			ResultatAge = 3;
		if (reponseAge == "R4")
			ResultatAge = 4;
		return ResultatAge;
	}
	
	public int ResultatTDT(String reponseTDT) {
		if (reponseTDT == "R1")
			ResultatTDT = 0;
		if (reponseTDT == "R2")
			ResultatTDT = 3;
		if (reponseTDT == "R3")
			ResultatTDT = 4;
		return ResultatTDT;
	}
	public int ResultatActivitePhy(String reponseActPhy) {
		if (reponseActPhy == "R1")
			ResultatActivitePhy = 0;
		if (reponseActPhy == "R2")
			ResultatActivitePhy = 2;
		return ResultatActivitePhy;
	}
	
	public int ResultatATCDAntiHTA (String reponseATCDAntiHTA) {
		if (reponseATCDAntiHTA == "R1")
			ResultatATCDAntiHTA = 0;
		if (reponseATCDAntiHTA == "R2")
			ResultatATCDAntiHTA = 2;
		return ResultatATCDAntiHTA;
	}
	
	public int ResultatATCDDiabete (String reponseATCDDiabete) {
		if (reponseATCDDiabete == "R1")
			ResultatATCDDiabete = 0;
		if (reponseATCDDiabete == "R2")
			ResultatATCDDiabete = 3;
		return ResultatATCDDiabete;
	}
	public int ResultatATCDGlycePlus (String reponseATCDGlycemie) {
		if (reponseATCDGlycemie == "R1")
			ResultatATCDGlycePlus = 0;
		if (reponseATCDGlycemie == "R2")
			ResultatATCDGlycePlus = 5;
		return ResultatATCDGlycePlus;
	}
	public int ResultatIMC(String reponseIMC) {
		if (reponseIMC == "R1")
			ResultatIMC = 0;
		if (reponseIMC == "R2")
			ResultatIMC = 1;
		if (reponseIMC == "R3")
			ResultatIMC = 3;
		return ResultatIMC;
	}
	public int ResultatPartLegume (String reponseLegumeVert) {
		if (reponseLegumeVert == "R1")
			ResultatPartLegume = 2;
		if (reponseLegumeVert == "R2")
			ResultatPartLegume = 0;
		if (reponseLegumeVert == "R3")
			ResultatPartLegume = 1;
		return ResultatPartLegume;
	}
}
