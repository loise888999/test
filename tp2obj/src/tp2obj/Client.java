package tp2obj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * D�crivez votre classe Client ici.
 *
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class Client extends IOFichier
{
    // variables d'instance - remplacez l'exemple qui suit par le v�tre
    

    /**
     * Constructeur d'objets de classe Client
     */
    public Client(String nomF)
    {
        // initialisation des variables d'instance
    	super(nomF);
    	try {
			PrintWriter writer = new PrintWriter(nomF);
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
        
        
        
    }


}
