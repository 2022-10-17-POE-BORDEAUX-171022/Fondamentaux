
package corriges.cours.nouveau;

import corriges.cours.OperationUnitaire;


public class OperationDouble implements OperationUnitaire{

    @Override
    public double effectueOperation(double d) {
        return 2 * d;
    }
    
}
