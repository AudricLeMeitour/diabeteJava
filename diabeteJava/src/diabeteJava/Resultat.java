package diabeteJava;
import diabeteJava.Main;

public class Resultat {
	
	private String ReponseAge;
	private String ReponseActivitePhy;
	private String ReponseATCDAntiHTA;
	private String ReponseATCDDiabete;
	private String ReponseATCDGlycePlus;
	private String ReponseIMC;
	private String ReponsePartLegume;
	private String ReponseTDT;
	
	
	public Resultat(String reponseAge, String reponseActivitePhy, String reponseATCDAntiHTA,
			String reponseATCDDiabete, String reponseATCDGlycePlus, String reponseIMC, String reponsePartLegume,
			String reponseTDT) {
		super();

		ReponseAge = reponseAge;
		ReponseActivitePhy = reponseActivitePhy;
		ReponseATCDAntiHTA = reponseATCDAntiHTA;
		ReponseATCDDiabete = reponseATCDDiabete;
		ReponseATCDGlycePlus = reponseATCDGlycePlus;
		ReponseIMC = reponseIMC;
		ReponsePartLegume = reponsePartLegume;
		ReponseTDT = reponseTDT;
	}

	public int ResultAge(String reponseAge) {
		int ResultatAge = 0;
		if (reponseAge == "<45")
			ResultatAge = 0;
		if (reponseAge == "45-54")
			ResultatAge = 2;
		if (reponseAge == "55-64")
			ResultatAge = 3;
		if (reponseAge == ">64")
			ResultatAge = 4;
		return ResultatAge;
	}
	
	public int ResultatTDT(String reponseTDT) {
		int ResultatTDT = 0;
		if (Individu.getSexe() == "Homme") {
			if (reponseTDT == "<94")
				ResultatTDT = 0;
			if (reponseTDT == "94-102")
				ResultatTDT = 3;
			if (reponseTDT == ">102")
				ResultatTDT = 4;
		}
		else {
			if (reponseTDT == "<80")
				ResultatTDT = 0;
			if (reponseTDT == "80-88")
				ResultatTDT = 3;
			if (reponseTDT == ">88")
				ResultatTDT = 4;
		}
		
		return ResultatTDT;
	}
	public int ResultatActivitePhy(String reponseActPhy) {
		int ResultatActivitePhy = 0;
		if (reponseActPhy == "Oui")
			ResultatActivitePhy = 0;
		if (reponseActPhy == "Non")
			ResultatActivitePhy = 2;
		return ResultatActivitePhy;
	}
	
	public int ResultatATCDAntiHTA (String reponseATCDAntiHTA) {
		int ResultatATCDAntiHTA = 0;
		if (reponseATCDAntiHTA == "Non")
			ResultatATCDAntiHTA = 0;
		if (reponseATCDAntiHTA == "Oui")
			ResultatATCDAntiHTA = 2;
		return ResultatATCDAntiHTA;
	}
	
	public int ResultatATCDDiabete (String reponseATCDDiabete) {
		int ResultatATCDDiabete = 0;
		if (reponseATCDDiabete == "Non")
			ResultatATCDDiabete = 0;
		if (reponseATCDDiabete == "Oui")
			ResultatATCDDiabete = 3;
		return ResultatATCDDiabete;
	}
	public int ResultatATCDGlycePlus (String reponseATCDGlycemie) {
		int ResultatATCDGlycePlus = 0;
		if (reponseATCDGlycemie == "Non")
			ResultatATCDGlycePlus = 0;
		if (reponseATCDGlycemie == "Oui")
			ResultatATCDGlycePlus = 5;
		return ResultatATCDGlycePlus;
	}
	public int ResultatIMC(String reponseIMC) {
		int ResultatIMC = 0;
		if (reponseIMC == "<25")
			ResultatIMC = 0;
		if (reponseIMC == "25-30")
			ResultatIMC = 1;
		if (reponseIMC == ">30")
			ResultatIMC = 3;
		return ResultatIMC;
	}
	public int ResultatPartLegume (String reponseLegumeVert) {
		int ResultatPartLegume = 0;
		if (reponseLegumeVert == "Non")
			ResultatPartLegume = 2;
		if (reponseLegumeVert == "Tous les jours")
			ResultatPartLegume = 0;
		if (reponseLegumeVert == "Pas tous les jours")
			ResultatPartLegume = 1;
		System.out.println(ResultatPartLegume);
		return ResultatPartLegume;
	}
	
	public int Somme (String reponseAge,String reponseTDT,String reponseActPhy, String reponseATCDAntiHTA, String reponseATCDDiabete,String reponseATCDGlycemie,String reponseIMC,String reponseLegumeVert) {
		int somme = 0;
		somme = ResultAge(reponseAge)+ ResultatTDT(reponseTDT)+ ResultatActivitePhy(reponseActPhy)+ ResultatATCDAntiHTA(reponseATCDAntiHTA)+ ResultatATCDDiabete(reponseATCDDiabete)+ ResultatATCDGlycePlus(reponseATCDGlycemie)+ ResultatIMC(reponseIMC)+ ResultatPartLegume(reponseLegumeVert); 
		System.out.println(somme);
		return somme;
	}
	 
	
}
