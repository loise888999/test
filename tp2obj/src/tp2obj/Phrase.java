package tp2obj;


/**
 * Décrivez votre interface Phrase ici.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 */

public interface Phrase
{
    /**
     * Retourne le 1er mot de l'enregistrement, une String nommée enr
     *
     * @param  enr String - l'enregistrement
     * @return String - 1er mot de l'enregistrement
     */
    String getPremierMot(String enr);
    
    /**
     * Retourne le 2e mot de l'enregistrement, une String nommée enr
     *
     * @param  enr String - l'enregistrement
     * @return 2e mot de l'enregistrement
     */
    String getPDeuxiemeMot(String enr);
}
