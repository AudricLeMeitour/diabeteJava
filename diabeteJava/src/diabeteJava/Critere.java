package diabeteJava;



public class Critere {
	private String Nom;
	private String Prenom;
	private String NumSecu;
	private String Sexe;
	private String Age;
	private String TourDT; /*Tour de taille*/
	private String ActPhy;
	private String ATCDTraitAntiHTA; /*Antecedent traitement anti-hypertension artérielle*/
	private String ATCDFamDiabete; /*Antecedent famillial de diabete*/
	private String ATCDGlycePlusNorm; /*Antecedent glycemie superieur à la normale*/
	private String IMC; /* Indice masse corporel*/
	private String PartLegumeVert;

	
	public Critere(String nom, String prenom, String numSecu, String sexe, String age, String tourdt, String actPhy, String aTCDTraitAntiHTA, String aTCDFamDiabete,
		String aTCDGlycePlusNorm, String iMC, String partLegumeVert) {
		Nom = nom;
		Prenom = prenom;
		NumSecu = numSecu;
		Sexe = sexe;
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
	
	public String AgeIndividu(String reponseAge) {

		String R1 = "<45";
		String R2 = "45-54";
		String R3 = "55-64";
		String R4 = ">64";

		if (reponseAge.compareTo(R1) == 0 ) {

			Age = R1;
		}
		
		if (reponseAge.compareTo(R2) == 0) {

			Age = R2;
		}
		
		if (reponseAge.compareTo(R3) == 0) {

			Age = R3;
		}
					
		if (reponseAge.compareTo(R4) == 0) {

			Age = R4;
		}
		System.out.println(Age);
		return Age;				
	}

	public String Tourdt(String reponse) {
		
		if (Sexe() == 'Homme')
			String R1 = "<94";
			String R2 = "94-102";
			String R3 = ">102";
			if (reponse.compareTo(R1) == 0 ) {

				TourDT = R1;
			}
			
			if (reponse.compareTo(R2) == 0) {

				TourDT = R2;
			}
			
			if (reponse.compareTo(R3) == 0) {

				TourDT = R3;
			}
			System.out.println(TourDT);
			return TourDT;	
			else 
				String R1 = "<80";
				String R2 = "80-88";
				String R3 = ">88";
				if (reponse.compareTo(R1) == 0 ) {

					TourDT = R1;
				}
				
				if (reponse.compareTo(R2) == 0) {

					TourDT = R2;
				}
				
				if (reponse.compareTo(R3) == 0) {

					TourDT = R3;
				}
				System.out.println(TourDT);
				return TourDT;	
	}
	
	public String ActivitePhy(String reponse){
 	
		String R1 = "Oui";
		String R2 = "Non";
		if (reponse.compareTo(R1) == 0 ) {

			ActPhy = R1;
		}
		
		if (reponse.compareTo(R2) == 0) {

			ActPhy = R2;
		}
		System.out.println(ActPhy);
		return ActPhy;
		}	
	
	public String ATCDAntiHTA (String reponse) {
		String R1 = "Non";
		String R2 = "Oui";
		if (reponse.compareTo(R1) == 0 ) {

			ATCDTraitAntiHTA = R1;
		}
		
		if (reponse.compareTo(R2) == 0) {

			ATCDTraitAntiHTA = R2;
		}
		
		System.out.println(ATCDTraitAntiHTA);
		return ATCDTraitAntiHTA;
	}
	
	public String ATCDDiabete (String reponse) {
		String R1 = "Non";
		String R2 = "Oui";
		if (reponse.compareTo(R1) == 0 ) {

			ATCDFamDiabete = R1;
		}
		
		if (reponse.compareTo(R2) == 0) {

			ATCDFamDiabete = R2;
		}
		
		System.out.println(ATCDFamDiabete);
		return ATCDFamDiabete;
	}
	
	public String ATCDGlycePlus (String reponse) {
		String R1 = "Non";
		String R2 = "Oui";
		if (reponse.compareTo(R1) == 0 ) {
	
			ATCDGlycePlusNorm = R1;
		}
		
		if (reponse.compareTo(R2) == 0) {
	
			ATCDGlycePlusNorm = R2;
		}
		
		System.out.println(ATCDGlycePlusNorm);
		return ATCDGlycePlusNorm;
	}
	public String IMC (String reponse) {
		String R1 = "<25";
		String R2 = "25-30";
		String R3 = ">30";
		if (reponse.compareTo(R1) == 0 ) {
	
			IMC = R1;
		}
		
		if (reponse.compareTo(R2) == 0) {
	
			IMC = R2;
		}
		
		System.out.println(IMC);
		return IMC;
	}
	public String PartLegume (String reponse) {
		String R1 = "Non";
		String R2 = "Tout les jours";
		String R3 = "Pas tout les jours";
		if (reponse.compareTo(R1) == 0 ) {
	
			PartLegumeVert = R1;
		}
		
		if (reponse.compareTo(R2) == 0) {
	
			PartLegumeVert = R2;
		}
		
		System.out.println(PartLegumeVert);
		return PartLegumeVert;
	}
	
}
