package parties;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class GestionEtudiants {
    public static void main(String[] args) {
        ArrayList<Etudiant> liste = new ArrayList<>();
        liste.add(new Etudiant(1, "Amal", 14.5));
        liste.add(new Etudiant(2, "Hiba", 17.0));
        liste.add(new Etudiant(3, "Omar", 12.0));
        liste.add(new Etudiant(4, "Nadia", 15.5));
        liste.add(new Etudiant(5, "Yassine", 18.0));
        System.out.println("Liste des étudiants :");
        for (Etudiant e : liste) {
            System.out.println(e);
        }
        String nomRecherche = "Omar";
        for (Etudiant e : liste) {
            if (e.getNom().equalsIgnoreCase(nomRecherche)) {
                System.out.println("Etudiant trouvé :");
                System.out.println(e);
            }
        }
        int idSupprimer = 3;
        liste.removeIf(e -> e.getId() == idSupprimer);
        System.out.println("Liste après suppression :");
        for (Etudiant e : liste) {
            System.out.println(e);
        }
        Collections.sort(
                liste,
                Comparator.comparingDouble(Etudiant::getMoyenne)
        );
        System.out.println("Liste après tri :");
        for (Etudiant e : liste) {
            System.out.println(e);
        }
        Etudiant meilleur = Collections.max(
                liste,
                Comparator.comparingDouble(Etudiant::getMoyenne)
        );
        System.out.println("Meilleur étudiant est :");
        System.out.println(meilleur);
    }
}
