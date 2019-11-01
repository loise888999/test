package tp2obj;

import java.io.File;

/**
 * Décrivez votre interface IOinterface ici.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 */


public interface IOinterface
{
    /**
     * affiche à l'écran tout le fichier
     *
     * @param
     * @return  
     */
    void afficheFichier();
    	
    /**
     * retourne tout le fichier dans un tableau de String
     *
     * @param
     * @return String[] un tableau de String
     */
    String[] retourneFichier(File myObject);
    
    /**
     * 
     * ajoute l'enregistrement à la fin du fichier
     *
     * @param  enr    l'enregistrement à ajouter au fichier
     * @return void       
     */
    void ajouteEnregistrement(String enr);
}
