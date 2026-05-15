package parties;

import java.util.Map;
import java.util.TreeMap;

public class ClassementEtudiants {

    public static void main(String[] args) {
        TreeMap<Integer, String> etudiants =
                new TreeMap<>();
        etudiants.put(120, "Amal");
        etudiants.put(101, "Hiba");
        etudiants.put(150, "Omar");
        etudiants.put(99, "Nadia");
        System.out.println("Liste triée :");
        for (Map.Entry<Integer, String> e :
                etudiants.entrySet()) {
            System.out.println( e.getKey() + " : " +e.getValue() );}
        System.out.println("Premier étudiant :");
        System.out.println( etudiants.firstEntry());
        System.out.println("Dernier étudiant :");
        System.out.println(etudiants.lastEntry());
        System.out.println("Étudiants numéro > 100 :");
        for (Map.Entry<Integer, String> e :
                etudiants.tailMap(101).entrySet()) {
            System.out.println(e.getKey() +" : " +e.getValue());
        }
    }
}
