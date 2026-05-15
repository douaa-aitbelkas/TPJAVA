package parties;

import java.util.HashSet;
import java.util.TreeSet;
public class GestionMatieres {

    public static void main(String[] args) {

        HashSet<String> matieres = new HashSet<>();
        matieres.add("Java");
        matieres.add("Python");
        matieres.add("Reseau");
        System.out.println(matieres);
        TreeSet<String> matieresTriees =
                new TreeSet<>(matieres);
        System.out.println("Matières triées ordre alphabétique :");
        System.out.println(matieresTriees);
    }
}
