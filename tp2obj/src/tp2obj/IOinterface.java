package tp2obj;

import java.io.File;

/**
 * D�crivez votre interface IOinterface ici.
 *
 * @author  (votre nom)
 * @version (un num�ro de version ou une date)
 */


public interface IOinterface
{
    /**
     * affiche � l'�cran tout le fichier
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
     * ajoute l'enregistrement � la fin du fichier
     *
     * @param  enr    l'enregistrement � ajouter au fichier
     * @return void       
     */
    void ajouteEnregistrement(String enr);
}
