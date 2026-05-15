package parties;

public class Etudiant {

    private int id;
    private String nom;
    private double moyenne;

    public Etudiant(int id, String nom, double moyenne) {
        this.id = id;
        this.nom = nom;
        this.moyenne = moyenne;
    }
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public double getMoyenne() {
        return moyenne;
    }
    public String toString() {
        return "ID : " + id +"Nom : " + nom +"Moyenne : " + moyenne;
    }
}
