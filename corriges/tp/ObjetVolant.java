
package corriges.tp;

/**
 * Décrit un objet volant.
 */
public interface ObjetVolant {

    /**
     * Effectue les actions de préparation du vol. Renvoie true si l'objet
     * peut voler.
     * @return 
     */
    public boolean prepareVole();

    /**
     * Décolle.
     */
    public void decolle();

    /**
     * Vole : déplace l'objet.
     */
    public void vole();

    /**
     * Atterrit.
     */
    public void atterrit();

    /**
     * Remet l'appareil en état.
     */
    public void repare();
    
}
