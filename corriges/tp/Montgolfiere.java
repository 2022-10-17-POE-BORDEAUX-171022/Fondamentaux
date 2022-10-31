package corriges.tp;

/**
 *
 * @author francois
 */
public class Montgolfiere extends PlusLegerQueLAir {

    private static final double PROBABILITE_ECHEC_PREPARATION = 0.10;
    
    public Montgolfiere(String identifiant){
        this.identifiant = identifiant;
    }
    
    @Override
    public boolean prepareVole() {
        afficheMessage("vérifie le matériel, l'enveloppe, la nacelle, le pilote");
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
        afficheMessage("fait chauffer l'air pour gonfle le ballon, et décolle");
    }

    @Override
    public void vole() {
        afficheMessage("se laisse porter par le vent");
    }

    @Override
    public void atterrit() {
        this.etatEnveloppe = EtatEnveloppe.DEGONFLE;
        afficheMessage("laisse refroidir le ballon, et atterrit");
    }

    @Override
    public void repare() {
        super.repare();
        afficheMessage("répare la nacelle");
    }
    
}