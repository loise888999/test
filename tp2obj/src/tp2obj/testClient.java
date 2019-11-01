package tp2obj;

import java.util.Random;

/**
 * Décrivez votre classe testClient ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class testClient
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;

    /**
     * Constructeur d'objets de classe testClient
     */
    public testClient(Client a)
    {
    	
    	Client unObjetClient= new Client("clients.txt");
        unObjetClient.ajouteEnregistrement("101 Allard");
        unObjetClient.ajouteEnregistrement("102 Salvar");
        unObjetClient.ajouteEnregistrement("103 Mayar");
        unObjetClient.ajouteEnregistrement("104 Makil");
        unObjetClient.ajouteEnregistrement("105 Poyld");
        unObjetClient.ajouteEnregistrement("106 Deyio");
        //unObjetClient.afficheFichier();
        //System.out.println(unObjetClient.trouverNom("102"));
        
    	
        String[] tableu = unObjetClient.retourneFichier(null);
    	
    	unObjetClient.afficheFichier();
    	unObjetClient.getPremierMot(tableu[0]);
    	unObjetClient.getPDeuxiemeMot(tableu[0]);
    	String name;
    	name = unObjetClient.trouverNom("102");
    	System.out.println(name);
        
 
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public int sampleMethod(int y)
    {
        // Insérez votre code ici
        return x + y;
    }
}
