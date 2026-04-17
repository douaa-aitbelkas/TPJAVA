package part;

public class TestBanque {
	public static void main(String[] args) {
	Compte[] comptes = new Compte[4];

    comptes[0] = new CompteCourant("4775990", "Aliyae", 1000, 500);
    comptes[1] = new CompteEpargne("938949", "Sara", 2000, 0.05);
    comptes[2] = new ComptePremium("09428467", "Youssef", 3000, 1000);
    comptes[3] = new CompteCourant("7852351", "Mehdi", 1500, 300);

    for (Compte c : comptes) {
        c.deposer(200);
        c.retirer(500);
        c.afficher();
    }
    System.out.println("filtrage:");
    for (Compte c : comptes) {
        if (c instanceof CompteEpargne) {
            c.afficher();
        }
    }
    Compte c = new CompteEpargne("74587090", "Hajar", 1000, 0.03);
    CompteCourant cc = (CompteCourant) c;
}
}
