package diabeteJava;

public class Critere {
	private int Age;
	private int TourdtH; /*Tour de taille Homme*/
	private int TourdtF; /*Tour de taille Femme*/
	private String ActPhy;
	private String ATCDTraitAntiHTA; /*Antecedent traitement anti-HTA*/
	private String ATCDFamDiabete; /*Antecedent famillial de diabete*/
	private String ATCDGlycePlusNorm; /*Antecedent glycemie superieur à la normale*/
	private int IMC; /* Indice masse corporel*/
	private String PartLegumeVert;
	
	
	public Critere(int age, int tourdtH, int tourdtF, String actPhy, String aTCDTraitAntiHTA, String aTCDFamDiabete,
			String aTCDGlycePlusNorm, int iMC, String partLegumeVert) {
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
	
	
    
}
