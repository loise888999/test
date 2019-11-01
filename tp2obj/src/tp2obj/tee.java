package tp2obj;

import java.io.File;

public class tee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Client unObjetClient= new Client("client.txt");
        unObjetClient.ajouteEnregistrement("101 Allard");
        unObjetClient.ajouteEnregistrement("102 Salvar");
        unObjetClient.ajouteEnregistrement("103 Mayar");
        unObjetClient.ajouteEnregistrement("104 Makil");
        unObjetClient.ajouteEnregistrement("105 Poyld");
        unObjetClient.ajouteEnregistrement("106 Deyio");
        //unObjetClient.afficheFichier();
        //System.out.println(unObjetClient.trouverNom("102"));
        
		
        String[] tableu = unObjetClient.retourneFichier();
    	
    	unObjetClient.afficheFichier();
    	//unObjetClient.getPremierMot(tableu[0]);
    	//unObjetClient.getPDeuxiemeMot(tableu[0]);
    	String name;
    	name = unObjetClient.trouverNom("103");
    	System.out.println(name);
	}

}
