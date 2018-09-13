package diabeteJava;

import java.util.ArrayList;

public class Critere {
	private String Age;
	private String TourdtH; /*Tour de taille Homme*/
	private String TourdtF; /*Tour de taille Femme*/
	private String ActPhy;
	private String ATCDTraitAntiHTA; /*Antecedent traitement anti-HTA*/
	private String ATCDFamDiabete; /*Antecedent famillial de diabete*/
	private String ATCDGlycePlusNorm; /*Antecedent glycemie superieur à la normale*/
	private String IMC; /* Indice masse corporel*/
	private String PartLegumeVert;
	
	
	public Critere(String age, String tourdtH, String tourdtF, String actPhy, String aTCDTraitAntiHTA, String aTCDFamDiabete,
		String aTCDGlycePlusNorm, String iMC, String partLegumeVert) {
		Age = age;
		TourdtH = tourdtH;
		TourdtF = tourdtF;
		ActPhy = actPhy;
		ATCDTraitAntiHTA = aTCDTraitAntiHTA;
		ATCDFamDiabete = aTCDFamDiabete;
		ATCDGlycePlusNorm = aTCDGlycePlusNorm;
		IMC = iMC;
		PartLegumeVert = partLegumeVert;
	}
	
	
    
	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getTourdtH() {
		return TourdtH;
	}

	public void setTourdtH(String tourdtH) {
		TourdtH = tourdtH;
	}

	public String getTourdtF() {
		return TourdtF;
	}

	public void setTourdtF(String tourdtF) {
		TourdtF = tourdtF;
	}

	public String getActPhy() {
		return ActPhy;
	}

	public void setActPhy(String actPhy) {
		ActPhy = actPhy;
	}

	public String getATCDTraitAntiHTA() {
		return ATCDTraitAntiHTA;
	}

	public void setATCDTraitAntiHTA(String aTCDTraitAntiHTA) {
		ATCDTraitAntiHTA = aTCDTraitAntiHTA;
	}

	public String getATCDFamDiabete() {
		return ATCDFamDiabete;
	}

	public void setATCDFamDiabete(String aTCDFamDiabete) {
		ATCDFamDiabete = aTCDFamDiabete;
	}

	public String getATCDGlycePlusNorm() {
		return ATCDGlycePlusNorm;
	}

	public void setATCDGlycePlusNorm(String aTCDGlycePlusNorm) {
		ATCDGlycePlusNorm = aTCDGlycePlusNorm;
	}

	public String getIMC() {
		return IMC;
	}

	public void setIMC(String iMC) {
		IMC = iMC;
	}

	public String getPartLegumeVert() {
		return PartLegumeVert;
	}

	public void setPartLegumeVert(String partLegumeVert) {
		PartLegumeVert = partLegumeVert;
	}
	
	public String AgeIndividu(String reponse) {

		String R1 = "<45";
		String R2 = "45-54";
		String R3 = "55-64";
		String R4 = ">64";
		reponse = "<45";
		if (reponse.compareTo(R1) == 0 ) {

			this.Age = R1;
		}
		
		if (reponse.compareTo(R2) == 0) {

			this.Age = R2;
		}
		
		if (reponse.compareTo(R3) == 0) {

			this.Age = R3;
		}
					
		if (reponse.compareTo(R4) == 0) {

			this.Age = R4;
		}
		return this.Age;				
	}

	public int tourdt(String reponse) {
		//if (Individu.getSexe() == Homme)
			
			
			
			
	}
}
