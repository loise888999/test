/**
 * Décrivez votre classe IOFichier ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
package tp2obj;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;


public class IOFichier implements IOinterface, Phrase
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
	
	
    private String nomFichier;
    String[] tableau = new String[40];
    
    /**
     * Constructeur d'objets de classe IOFichier
     */
    public IOFichier(String nomF)
    {
        // initialisation des variables d'instance
        nomFichier = "client.txt";
    }

    /**
     * affiche à l'écran tout le fichier
     *
     * @param
     * @return  
     */
    public void afficheFichier()
    {
        // Insérez votre code ici
    	int length = tableau.length;
    	for (int i = 0; i  < length ; i++) {
        	if (tableau[i] != null) {
        		System.out.println(tableau[i]);
        	}
        	
        }
    }
    
    /**
     * retourne tout le fichier dans un tableau de String
     * 
     *
     * @param
     * @return String[] un tableau de String
     */
    public String[] retourneFichier(File myObject)
    {	
    	int i=0;
		try {
			
		    Scanner scanner = new Scanner(new File(nomFichier));
		    scanner.useDelimiter("\n");
		    while (scanner.hasNextLine()) {
				
				tableau[i] = scanner.nextLine();
				i++;
				System.out.println(scanner.nextLine());
				
			}
			scanner.close();
		} catch (Exception e) {	
		}
		return tableau;
       
    }  
    /*
     * ajoute l'enregistrement à la fin du fichier
     *
     * @param  enr    l'enregistrement à ajouter au fichier
     * @return void       
     */
    public void ajouteEnregistrement(String enr)
    {
         // Insérez votre code ici
    	try {
    		FileWriter fw = new FileWriter(nomFichier,true);
    		for (int i = 0; i < enr.length() ; i++) {
        		char c = enr.charAt(i);
        		fw.append(c);
    		}
    		fw.append('\n');
    		fw.close();
		} catch (Exception e) {
		
		}	
    }
    
    
    /**
     * Retourne le 1er mot de l'enregistrement, une String nommée enr
     *
     * @param  enr String - l'enregistrement
     * @return String - 1er mot de l'enregistrement
     */
    public String getPremierMot(String enr) {
    	Boolean pas_espace = new Boolean(true);
    	String mot_premiert = "";
    	for (int i = 0; (i < enr.length())&& (pas_espace)  ; i++) {
    		char c = enr.charAt(i);
    		if ( c != ' ') {
    			mot_premiert += c;
    			
    		} else {
    			pas_espace = false;
    		}
		}
    	System.out.println(mot_premiert);
    	return mot_premiert;
    }
    
    /**
     * Retourne le 2e mot de l'enregistrement, une String nommée enr
     *
     * @param  enr String - l'enregistrement
     * @return 2e mot de l'enregistrement
     */
    public String getPDeuxiemeMot(String enr) {
    	Boolean espace = new Boolean(false);
    	String deusiem_mot = "";
    	for (int i = 0; (i < enr.length())  ; i++) {
    		char c = enr.charAt(i);
    		if ( (c != ' ') && (espace)   ) {
    	    	deusiem_mot += c;
    			
    		} else if (c == ' ') {
    			espace = true;
    			
    		}
		}
   
    	System.out.println(deusiem_mot);
    	
    	return deusiem_mot;
    }
    
   
    /**
     * retourne tout le nom à partir de son id
     *
     * @param le id du nom recherché
     * @return String le nom recherché
     */
    public String trouverNom(String id)
    {
        // Insérez votre code ici
        String nom = new String();
        
        return nom;
    }
}


