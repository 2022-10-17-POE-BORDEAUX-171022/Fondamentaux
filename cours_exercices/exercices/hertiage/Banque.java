package cours_exercices.exercices.hertiage;


public class Banque {
    
    private Compte compte;
    
    public void setCompte(Compte compte){
        this.compte = compte;
    }
    
    public void afficheLeCompte(){
        compte.afficheCompte();
    }
    
    public void emprunte(int montant){
        compte.emprunter(43);
    }
    
}
