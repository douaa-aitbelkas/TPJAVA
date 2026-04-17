package part;

public class CompteCourant extends Compte {
	private double decouvertAutorise;
    public CompteCourant(String numero, String titulaire, double solde, double decouvertAutorise) {
        super(numero, titulaire, solde);
        this.decouvertAutorise = decouvertAutorise;
    }
    @Override
    public void retirer(double montant) {
        if (solde - montant >= -decouvertAutorise) {
            solde -= montant;
        } else {
            System.out.println("Dépassement du découvert");
        }
    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Découvert: " + decouvertAutorise);
    }
}
