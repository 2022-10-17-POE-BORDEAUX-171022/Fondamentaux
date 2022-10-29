
package corriges.cours.nouveau;

import corriges.cours.OperationUnitaire;


public class OperationMultipliePar4 implements OperationUnitaire{

    @Override
    public double effectueOperation(double d) {
        return 4 * d;
    }
    
}
