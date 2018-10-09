package diabeteJava;


public class Main {
	 public void main(String[] args) {
		 System.out.println("Quel est votre nom ?");
		 String reponseNom = "";
		 
		 System.out.println("Quel est votre prénom ? ?");
		 String reponsePrenom = "";
		 
		 System.out.println("Quel est votre N° de sécurité Social ");
		 String reponseNSS = "";
		 
		 System.out.println("Quel est votre Sexe ?");
		 String reponseSexe = "";
		 
		 System.out.println("Quel age avez-vous ?");
		 String reponseAge = "";
		 	
		 System.out.println("Quel est votre tour de taille ?");
		 String reponseTDT = "";
		 
		 System.out.println("Faites-vous du sport plus de 30m/jour ?");
		 String reponseActPhy = "";

		 System.out.println("Avez vous des antécedant de traitement anti hypertension artérielle ?");
		 String reponseATCDAntiHTA = "";

		 System.out.println("Avez vous des antécedants familial de diabete ?");
		 String reponseATCDDiabete = "";
		 
		 System.out.println("Avez vous des antécedants de glycemie superieur à la normale");
		 String reponseATCDGlycemie = "";
		 
		 System.out.println("Quel est votre Indice de Masse Corporel?");
		 String reponseIMC = "";
		 
		 System.out.println("Mangez vous régulierment des légumes vert ?");
		 String reponseLegumeVert = "";
		  

		 
		 Critere critereIndividu = new Critere(reponseNom, reponsePrenom, reponseNSS, reponseSexe, reponseAge, reponseTDT, reponseActPhy, reponseATCDAntiHTA, reponseATCDDiabete, reponseATCDGlycemie,reponseIMC, reponseLegumeVert);
		 
		 critereIndividu.AgeIndividu(reponseAge);
		 critereIndividu.Tourdt(reponseTDT);
		 critereIndividu.ActivitePhy(reponseActPhy);
		 critereIndividu.ATCDAntiHTA(reponseATCDAntiHTA);
		 critereIndividu.ATCDDiabete(reponseATCDDiabete);
		 critereIndividu.ATCDGlycePlus(reponseATCDGlycemie);
		 critereIndividu.IMC(reponseIMC);
		 critereIndividu.PartLegume(reponseLegumeVert);
		 
		 Resultat R = new Resultat();
		 R.ResultAge(reponseAge);
		 R.ResultatTDT(reponseTDT);
		 R.ResultatActivitePhy(reponseActPhy);
		 R.ResultatATCDAntiHTA(reponseATCDAntiHTA);
		 R.ResultatATCDDiabete(reponseATCDDiabete);
		 R.ResultatATCDGlycePlus(reponseATCDGlycemie);
		 R.ResultatIMC(reponseIMC);
		 R.ResultatPartLegume(reponseLegumeVert);
		 
		 
	 
	 }
	 
}

