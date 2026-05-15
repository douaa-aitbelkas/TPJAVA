package parties;

import java.util.HashMap;
import java.util.Map;

public class GestionNotes {

    public static void main(String[] args) {
        HashMap<String, Double> notes =
                new HashMap<>();
        notes.put("Amal", 14.5);
        notes.put("Hiba", 17.0);
        notes.put("Omar", 12.5);
        System.out.println("Liste des notes :");
        for (Map.Entry<String, Double> entry :
                notes.entrySet()) {
            System.out.println( entry.getKey() + " : " +entry.getValue() );
        }
        System.out.println("Note de Amal : "+ notes.get("Amal") );
        notes.put("Ali", 16.0);
        notes.remove("Omar");
        double somme = 0;
        for (double note : notes.values()) {
            somme += note;
        }
        double moyenne =
                somme / notes.size();
        System.out.println( "Moyenne générale : "+ moyenne );
    }
}