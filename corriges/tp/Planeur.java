package corriges.tp;

/**
 *
 * @author francois
 */
public class Planeur extends AbstractObjetVolant {

    private static final double PROBABILITE_ECHEC_PREPARATION = 0.10;
    
    public Planeur(String identifiant){
        this.identifiant = identifiant;
    }
    
    @Override
    public boolean prepareVole() {
        afficheMessage("vérifie le matériel, le pilote, les conditions météo (le vent et l'ensoleillement) ...");
        if(Math.random() > PROBABILITE_ECHEC_PREPARATION){
            afficheMessage("peut voler");
            return true;
        }
        afficheMessage("ne peut pas voler");
        //else...
        return false;
    }

    @Override
    public void decolle() {
        afficheMessage("est tracté par un autre avion !");
    }

    @Override
    public void vole() {
        afficheMessage("gère son altitude avec les courants d'air.");
    }

    @Override
    public void atterrit() {
        afficheMessage("atterrit : n'a droit qu'à une seule chance");
    }

    @Override
    public void repare() {
        afficheMessage("change les ailes.");
    }
    
}
