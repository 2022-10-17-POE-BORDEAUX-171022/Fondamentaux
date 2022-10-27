
package cours_exercices.exercices.hertiage;


public abstract class Compte{
    
    protected int montantCompte;
    
    public void afficheCompte(){
        System.out.println("Je suis un compte");
    }
    
    public void setMontantCompte(int montantCompte){
        this.montantCompte = montantCompte;
    }
    
    public void methodeNonSurchargee(){
        
    }
    
    public int calculeInterets(){
        //ici, des calculs vraiment extrêmement consommateurs ....
        return 0;
    }
    
    public void additionneCompte(Compte autreCompte){
        this.montantCompte += autreCompte.montantCompte;
    }
    
    public abstract void emprunter(int montant);
    
}
