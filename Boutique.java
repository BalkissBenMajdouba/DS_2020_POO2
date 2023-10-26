package ds2021;

public class Boutique {

		 private Vetement[] tabVet;
		 private String nom;
		 private int nbVet=0;
		 public Boutique(String n, int taille) {
			 this.nom = n;
		     this.tabVet = new Vetement[taille];
		 }
		 public void ajoutVetement(Vetement v) {
			  if(nbVet<tabVet.length) {
				  tabVet[nbVet]=v;
				  nbVet++;
			  }
			  else 
				  System.out.println("Boutique plein!");
		 }
		 
		 public void afficheStock(int remise) {
			 for (int i=0; i<nbVet;i++) {
				 if(tabVet[i].getQtStock()>0) {
					 System.out.println(tabVet[i].toString()+" son prixTTc: "+String.format("%.3f", tabVet[i].prixTTC(remise))+ " DT.");
				 }
			 }
		 }
		 
		 
		 
		 
		 
			public static void main(String[] args) {
				// TODO Auto-generated method stub*
				Vetement v= new Vetement("veste", 59.500f, "V11", "grise");
				v.setQtStock(8);
				System.out.println(v);
				VetementEnfant vE= new VetementEnfant("Gillet", 23.900f, "M22", "rouge");
				vE.setAge(0.5f);
				vE.setQtStock(4);
				System.out.println(vE);
				System.out.println("---------------------------------------------------------------");
				
				
				VetementEnfant vE2= new VetementEnfant("Robe", 29.900f, "R100", "R100");
				Vetement v2= new Vetement("Manteau",169.900f, "M200", "gris");
				v2.setQtStock(0);
				vE2.setQtStock(510);
				vE2.setAge(0.5f);
				
				
				Boutique b= new Boutique(" ZEN ",4);
				
				b.ajoutVetement(v);
				b.ajoutVetement(v2);
				b.ajoutVetement(vE);
				b.ajoutVetement(vE2);
				
				b.afficheStock(60);
				//elle affiche tjrs 3 vetements seulement! 
	}
}
