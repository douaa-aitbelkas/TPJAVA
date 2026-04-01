package partie3;
import partie1.CompteBancaire;
import partie2.Banque;
public class TestBanque {

    public static void main(String[] args) {
        // QUESTION 1
        Banque marocBank = new Banque("MarocBank", 1500);
        //  QUESTION 2 
        CompteBancaire c1 = new CompteBancaire("ali",1000, 500);
        CompteBancaire c2 = new CompteBancaire("noha",2000, 300);
        CompteBancaire c3 = new CompteBancaire("salma", 500,  200);
        //  QUESTION 3
        marocBank.ajouterCompte(c1);
        marocBank.ajouterCompte(c2);
        marocBank.ajouterCompte(c3);
        // QUESTION 4a
        System.out.println("\n Opérations sur c1 ");
        c1.deposer(500);   
        c1.retirer(200);  
        c1.retirer(2000);  
        //  QUESTION 4b 
        System.out.println("\n Virement c2 → c3 (400 MAD) ");
        c2.virementVers(c3, 400);
        // QUESTION 5
        marocBank.afficherTous();
        //  QUESTION 6 
        System.out.println("\n Intérêts sur c2 ");
        System.out.println("Avec taux annuel seul    : "
            + c2.calculerSoldeAvecInterets());
        System.out.println("Avec taux + bonus 1.5%   : "
            + c2.calculerSoldeAvecInterets(0.015));
        // QUESTION 7 
        System.out.println("\n Infos globales");
        System.out.println("Nombre total de comptes créés : "
            + CompteBancaire.getNbComptes());      
        System.out.println("Taux d'intérêt annuel         : "
            + CompteBancaire.getTauxInteretAnnuel()); 
    }
}