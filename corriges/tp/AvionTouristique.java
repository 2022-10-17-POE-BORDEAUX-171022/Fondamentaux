package corriges.tp;

/**
 *
 * @author francois
 */
public class AvionTouristique extends AbstractObjetVolant  {

    private static final double PROBABILITE_ECHEC_PREPARATION = 0.25;
    
    //Carburant, en litres
    private double carburant;
    private Moteur moteur = new Moteur();
    
    public AvionTouristique(String identifiant){
        this.identifiant = identifiant;
    }
    
    @Override
    public boolean prepareVole() {
        afficheMessage("vérifie le matériel, le pilote, les conditions météo ...");
        if(Math.random() > PROBABILITE_ECHEC_PREPARATION){
            afficheMessage("peut voler");
            this.carburant = 2_000;
            return true;
        }
        //else...
        afficheMessage("ne peut voler");
        return false;
    }

    @Override
    public void decolle() {
        this.carburant -= 200;
        afficheMessage(this.moteur.tourne());
        afficheMessage("décolle viite !");
    }

    @Override
    public void vole() {
        this.carburant -= 1_000;
        afficheMessage(this.moteur.tourne());
        afficheMessage("fait des tours pour admirer le paysage");
    }

    @Override
    public void atterrit() {
        this.carburant -= 100;
        afficheMessage(this.moteur.tourne());
        afficheMessage("atterrit, attention, ça secoue");
    }

    @Override
    public void repare() {
        afficheMessage(" un bon coup de pied sur le moteur, et ça repart !");
    }
    
}
