package corriges.tp;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author francois
 */
public class Aeroport {

    private List<ObjetVolant> objetsVolants = new ArrayList<>();

    public void ajoute(ObjetVolant objetVolant) {
        this.objetsVolants.add(objetVolant);
    }

    private void demarre() {
        if (this.objetsVolants.isEmpty()) {
            return;
        }

        while (true) {
            for (ObjetVolant objetVolant : this.objetsVolants) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    System.out.println("Erreur grave");
                    return;
                }
                if (!objetVolant.prepareVole()) {
                    objetVolant.decolle();
                    objetVolant.vole();
                    objetVolant.atterrit();
                } else {
                    objetVolant.repare();
                }
            }
        }

    }

    public static void main(String args[]) {
        Aeroport charlesDeGaulle = new Aeroport();
        //Ajouter ici des avions
        //ObjetVolant objetVolant = new ....
        //charlesDeGaulle.ajoute(..);
        charlesDeGaulle.demarre();
    }

}
