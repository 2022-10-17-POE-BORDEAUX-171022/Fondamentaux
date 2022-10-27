package corriges.exercices.heritage;

public abstract class Interprete {
    
    public String traduirePhrase(){
        return "En " + getNomLangue() + " on dit " + getCommentCaVa() + ".";
    }
    
    public abstract String getNomLangue();
    public abstract String getCommentCaVa();
    
}
