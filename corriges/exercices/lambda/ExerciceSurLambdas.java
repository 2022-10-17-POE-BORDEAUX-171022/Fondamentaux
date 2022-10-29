package corriges.exercices.lambda;

import java.util.ArrayList;

public class ExerciceSurLambdas {

    public static void main(String[] args) {
        executeOperation((a, b) -> a + b, 3, 2);
        executeOperation((a, b) -> a * b, 3, 2);
        new ArrayList<>();
 
    }

    public static void executeOperation(OperationBinaire operationBinaire, double arg1, double arg2) {
        System.out.println(operationBinaire.execute(arg1, arg2));
    }

}
