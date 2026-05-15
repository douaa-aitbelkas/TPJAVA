package miniprojet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Bibliotheque {

    public static void main(String[] args) {

        ArrayList<Livre> livres =
                new ArrayList<>();
        livres.add(
                new Livre(
                        "111",
                        "Java",
                        "Amal",
                        2020
                )
        );
        livres.add(
                new Livre(
                        "222",
                        "Python",
                        "Nadaa",
                        2021
                )
        );
        livres.add(
                new Livre(
                        "333",
                        "Reseau",
                        "Omar",
                        2019
                )
        );
        HashSet<String> categories =
                new HashSet<>();
        categories.add("Programmation");
        categories.add("IA");
        categories.add("Base de données");
        HashMap<String, String> emprunts =
                new HashMap<>();
        emprunts.put("Ossama", "Java");
        emprunts.put("Douaa", "Python");
        String recherche = "Python";
        System.out.println("Recherche livre :");
        for (Livre l : livres) {
            if (l.getTitre().equalsIgnoreCase(recherche)) {
                System.out.println(l);
            }
        }
        livres.removeIf(
                l -> l.getIsbn().equals("333")
        );
        System.out.println("Livres disponibles :");
        for (Livre l : livres) {
            System.out.println(l);
        }
        System.out.println("RAPPORT");
        System.out.println("Nombre de livres : "+ livres.size());
        System.out.println("Catégories : "+ categories);
        System.out.println("Emprunts : "+ emprunts);
    }
}
