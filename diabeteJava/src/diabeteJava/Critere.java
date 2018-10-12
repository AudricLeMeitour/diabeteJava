package diabeteJava;



public class Critere {
	private String Age;
	private String TourDT; /*Tour de taille*/
	private String ActPhy;
	private String ATCDTraitAntiHTA; /*Antecedent traitement anti-hypertension artérielle*/
	private String ATCDFamDiabete; /*Antecedent famillial de diabete*/
	private String ATCDGlycePlusNorm; /*Antecedent glycemie superieur à la normale*/
	private String IMC; /* Indice masse corporel*/
	private String PartLegumeVert;

	
	public Critere( String age, String tourdt, String actPhy, String aTCDTraitAntiHTA, String aTCDFamDiabete,
		String aTCDGlycePlusNorm, String iMC, String partLegumeVert) {
		Age = age;
		TourDT = tourdt;
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

	public String getTourDT() {
		return TourDT;
	}

	public void setTourDT(String tourDT) {
		TourDT = tourDT;
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
	
	
}
