package cours_exercices.exercices.hertiage.autre;

import cours_exercices.exercices.hertiage.Compte;

public class CompteBancaire extends Compte {

    private int montantEmprunte;

    @Override
    public void afficheCompte() {
        super.afficheCompte();
        System.out.println(" ... et je vaux " + this.montantCompte);
    }

    @Override
    public int calculeInterets() {
        super.calculeInterets();
        return 5;
    }

    @Override
    public void emprunter(int montant) {
        this.montantEmprunte += montant;
        this.montantCompte += montant;
    }

    public void methodeEnPlus() {

    }

    public void methodeNonSurchargee(String arg1) {

    }

}
