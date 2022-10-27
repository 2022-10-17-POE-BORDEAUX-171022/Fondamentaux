
package cours_exercices.exercices.hertiage.autre;

import cours_exercices.exercices.hertiage.Compte;


public class CompteEntreprise extends Compte {
    
    private int montantCompteEmprunt;
    
    public void afficheCompteBancaire(){
        afficheCompte();
        System.out.println(this.montantCompte); 
   }
    
    public int calculeInteretsMieux(){
        int interetsComptes = calculeInterets();
        interetsComptes += 10;
        return interetsComptes;
    }

    @Override
    public void emprunter(int emprunt) {
        this.montantCompteEmprunt += emprunt;
        this.montantCompte += emprunt;
    }
    
}
