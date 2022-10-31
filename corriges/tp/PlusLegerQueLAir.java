package corriges.tp;

/**
 *
 * @author francois
 */
public abstract class PlusLegerQueLAir extends AbstractObjetVolant {

    protected EtatEnveloppe etatEnveloppe = EtatEnveloppe.DEGONFLE;
    
    @Override
    public void repare() {
        this.etatEnveloppe = EtatEnveloppe.DEGONFLE;
        afficheMessage("répare l'enveloppe");
    }
    
}
