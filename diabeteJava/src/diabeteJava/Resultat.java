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
		int ResultatTDT = 0;
		if (reponseTDT == "R1")
			ResultatTDT = 0;
		if (reponseTDT == "R2")
			ResultatTDT = 3;
		if (reponseTDT == "R3")
			ResultatTDT = 4;
		return ResultatTDT;
	}
	public int ResultatActivitePhy(String reponseActPhy) {
		int ResultatActivitePhy = 0;
		if (reponseActPhy == "R1")
			ResultatActivitePhy = 0;
		if (reponseActPhy == "R2")
			ResultatActivitePhy = 2;
		return ResultatActivitePhy;
	}
	
	public int ResultatATCDAntiHTA (String reponseATCDAntiHTA) {
		int ResultatATCDAntiHTA = 0;
		if (reponseATCDAntiHTA == "R1")
			ResultatATCDAntiHTA = 0;
		if (reponseATCDAntiHTA == "R2")
			ResultatATCDAntiHTA = 2;
		return ResultatATCDAntiHTA;
	}
	
	public int ResultatATCDDiabete (String reponseATCDDiabete) {
		int ResultatATCDDiabete = 0;
		if (reponseATCDDiabete == "R1")
			ResultatATCDDiabete = 0;
		if (reponseATCDDiabete == "R2")
			ResultatATCDDiabete = 3;
		return ResultatATCDDiabete;
	}
	public int ResultatATCDGlycePlus (String reponseATCDGlycemie) {
		int ResultatATCDGlycePlus = 0;
		if (reponseATCDGlycemie == "R1")
			ResultatATCDGlycePlus = 0;
		if (reponseATCDGlycemie == "R2")
			ResultatATCDGlycePlus = 5;
		return ResultatATCDGlycePlus;
	}
	public int ResultatIMC(String reponseIMC) {
		int ResultatIMC = 0;
		if (reponseIMC == "R1")
			ResultatIMC = 0;
		if (reponseIMC == "R2")
			ResultatIMC = 1;
		if (reponseIMC == "R3")
			ResultatIMC = 3;
		return ResultatIMC;
	}
	public int ResultatPartLegume (String reponseLegumeVert) {
		int ResultatPartLegume = 0;
		if (reponseLegumeVert == "R1")
			ResultatPartLegume = 2;
		if (reponseLegumeVert == "R2")
			ResultatPartLegume = 0;
		if (reponseLegumeVert == "R3")
			ResultatPartLegume = 1;
		return ResultatPartLegume;
	}
	
	public int Somme (String reponseAge,String reponseTDT,String reponseActPhy, String reponseATCDAntiHTA, String reponseATCDDiabete,String reponseATCDGlycemie,String reponseIMC,String reponseLegumeVert) {
		int somme = 0;
		somme = ResultAge(reponseAge)+ ResultatTDT(reponseTDT)+ ResultatActivitePhy(reponseActPhy)+ ResultatATCDAntiHTA(reponseATCDAntiHTA)+ ResultatATCDDiabete(reponseATCDDiabete)+ ResultatATCDGlycePlus(reponseATCDGlycemie)+ ResultatIMC(reponseIMC)+ ResultatPartLegume(reponseLegumeVert); 
		System.out.println(somme);
		return somme;
	}
	
	
}
