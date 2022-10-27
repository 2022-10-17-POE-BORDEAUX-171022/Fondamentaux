package corriges.cours;

public interface IAppareil{
    
    public static String getNom(String nom){
        return "Je suis un appareil de type " + nom;
    }
    
    String effectueTravail();

}