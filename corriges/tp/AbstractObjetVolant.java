package corriges.tp;

/**
 *
 * @author francois
 */
public abstract class AbstractObjetVolant implements ObjetVolant {

    protected String identifiant;

    /**
     * Affichage dans la console this.identifiant et message.
     * @param message 
     */
    protected void afficheMessage(String message) {
        System.out.println(this.identifiant + " " + message); 
    }
    
}
