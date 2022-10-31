package corriges.tp;

/**
 *
 * @author francois
 */
public class AvionDeLigne extends AbstractObjetVolant {

    private static final double PROBABILITE_ECHEC_PREPARATION = 0.12;
    private Moteur moteur = new Moteur();
    
    //Carburant, en litres
    private double carburant;
    
    public AvionDeLigne(String identifiant){
        this.identifiant = identifiant;
    }
    
    @Override
    public boolean prepareVole() {
        afficheMessage("vérifie le matériel, l'équipage, les conditions météo, le plan de vol ...");
        this.carburant = 200_000;
        if(Math.random() > PROBABILITE_ECHEC_PREPARATION){
            afficheMessage("peut voler");
            return true;
        }
        //else...
        afficheMessage("ne peut pas voler");
        return false;
    }

    @Override
    public void decolle() {
        this.carburant -= 12_000;
        afficheMessage(this.moteur.tourne());
        afficheMessage("décolle lentement");
    }

    @Override
    public void vole() {
        this.carburant -= 100_000;
        afficheMessage(this.moteur.tourne());
        afficheMessage("va d'un aéroport à l'autre");
    }

    @Override
    public void atterrit() {
        this.carburant -= 6_000;
        afficheMessage(this.moteur.tourne());
        afficheMessage("atterrit, en finesse.");
    }

    @Override
    public void repare() {
        afficheMessage(": il faut changer les moteurs !");
    }

    
    
}
