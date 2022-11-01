package corriges.cours;

// Classe principale

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Maps {

    public static void main(String[] args) {
        
        Map<String, Integer> maPremiereMap = new HashMap<>();
        
        maPremiereMap.put("premiere clé", 3);
        
        System.out.println("Contenu de la clé : premiere clé : " + maPremiereMap.get("premiere clé"));
        System.out.println("Contenu de la clé : deuxieme clé : " + maPremiereMap.get("deuxieme clé"));
        
        maPremiereMap.remove("premiere clé");
        System.out.println("La taille de ma map vaut " + maPremiereMap.size());
        maPremiereMap.clear();
        
        maPremiereMap.put("deuxieme", 2);
        maPremiereMap.keySet().forEach(s -> System.out.println("La clé vaut " + s));
        maPremiereMap.values().forEach(s -> System.out.println("La valeur vaut " + s));
        
        
        for(Entry<String, Integer> entry : maPremiereMap.entrySet()){
            System.out.println("La cle de l'entry vaut " + entry.getKey());
            System.out.println("La valeur de l'entry vaut " + entry.getValue());
        }
        
        
    }
    
    
}
