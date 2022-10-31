package corriges.tp;

/**
 *
 * @author francois
 */
public class Dirigeable extends PlusLegerQueLAir {

    private static final double PROBABILITE_ECHEC_PREPARATION = 0.20;
    private Moteur moteur = new Moteur();
    
    public Dirigeable(String identifiant){
        this.identifiant = identifiant;
    }
    
    @Override
    public boolean prepareVole() {
        afficheMessage("vérifie le matériel, l'enveloppe, la nacelle, le pilote, les moteurs");
        if(Math.random() > PROBABILITE_ECHEC_PREPARATION){
            afficheMessage("peut voler");
            return true;
        }
        //else...
        afficheMessage("ne peut pas voler");
        this.etatEnveloppe = EtatEnveloppe.DECHIRE;
        return false;
    }

    @Override
    public void decolle() {
        this.etatEnveloppe = EtatEnveloppe.GONFLE;
        afficheMessage(this.moteur.tourne());
        afficheMessage("met de l'hélium dans le ballon, et s'envole");
    }

    @Override
    public void vole() {
        afficheMessage(this.moteur.tourne());
        afficheMessage("va vers l'aéroport suivant");
    }

    @Override
    public void atterrit() {
        afficheMessage(this.moteur.tourne());
        this.etatEnveloppe = EtatEnveloppe.DEGONFLE;
        afficheMessage("dégonfle le ballon");
    }

    @Override
    public void repare() {
        super.repare();
        afficheMessage("répare les moteurs et la nacelle");
    }
    
}
