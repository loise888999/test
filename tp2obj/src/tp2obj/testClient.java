package tp2obj;

import java.util.Random;

/**
 * D�crivez votre classe testClient ici.
 *
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class testClient
{
    // variables d'instance - remplacez l'exemple qui suit par le v�tre
    private int x;

    /**
     * Constructeur d'objets de classe testClient
     */
    public testClient(Client a)
    {
    	
    	Client unObjetClient= new Client("clients.txt");
        //unObjetClient.ajouteEnregistrement("101 Allard");
        //unObjetClient.ajouteEnregistrement("102 Salvar");
        //unObjetClient.ajouteEnregistrement("103 Mayar");
        //unObjetClient.afficheFichier();
        //System.out.println(unObjetClient.trouverNom("102"));
        
    	
        String[] tableu = unObjetClient.retourneFichier(null);
    	
    	unObjetClient.afficheFichier();
    	unObjetClient.getPremierMot(tableu[0]);
    	unObjetClient.getPDeuxiemeMot(tableu[0]);
        
 
    }

    /**
     * Un exemple de m�thode - remplacez ce commentaire par le v�tre
     *
     * @param  y   le param�tre de la m�thode
     * @return     la somme de x et de y
     */
    public int sampleMethod(int y)
    {
        // Ins�rez votre code ici
        return x + y;
    }
}