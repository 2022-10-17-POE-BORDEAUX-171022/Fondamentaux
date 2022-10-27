
package corriges.cours.nouveau;


public class MonPojo {
    
    private int age;
    private String nom;
    
    public MonPojo(){
        System.out.println("Un objet a été créé");
        this.age = 3;
        this.nom = "Inconnu";
    }
    
    public MonPojo(int paramAge, String paramNom){
        this();
        this.age = paramAge;
        this.nom = paramNom;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public int ageDansXAns(int nombreAnnees){
        return this.age + nombreAnnees;
    }
    
    public String toJson(){
      return "{'nom':'"  + this.nom + "'}";
    }
    
}


