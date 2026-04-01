package partie1;
public class CompteBancaire {
    //QUESTION 2   
    private int    numero;             
    private String  titulaire;         
    private double solde;             
    private double decouvertAutorise;  

    // QUESTION 3 
    private static int    nbComptes        = 0;     
    private static double tauxInteretAnnuel = 0.03; 

    // QUESTION 4 
    public CompteBancaire() {
        nbComptes++;                       
        this.numero            = nbComptes; 
        this.titulaire         = "Inconnu";
        this.solde             = 0;
        this.decouvertAutorise = 0;
    }

    // QUESTION 5 
    public CompteBancaire(String titulaire, double solde, double decouvertAutorise) {
        nbComptes++;                            
        this.numero            = nbComptes;     
        this.titulaire         = titulaire;
        this.solde             = solde;
        this.decouvertAutorise = decouvertAutorise;
    }

  
    // QUESTION 6 
    public int getNumero() { return numero; }
    public String getTitulaire() { return titulaire; }
    public void setTitulaire(String titulaire) {
        if (titulaire != null && !titulaire.isEmpty())
            this.titulaire = titulaire;
        else
            System.out.println("Erreur : le titulaire ne peut pas être vide.");
    }  
    public double getSolde() { return solde; }   
    public double getDecouvertAutorise() { return decouvertAutorise; }
    public void setDecouvertAutorise(double d) {
        if (d >= 0)
            this.decouvertAutorise = d;
        else
            System.out.println("Erreur : le découvert ne peut pas être négatif.");
    }   
    // QUESTION 7 
    public void afficher() {
        System.out.println("Compte N°" + numero +
            "  Titulaire : " + titulaire +
            "  Solde : " + solde + " MAD" +
            "  Découvert autorisé : " + decouvertAutorise + " MAD");
    }
    //  QUESTION 8
    public void deposer(double montant) {
        if (montant > 0)
            solde += montant;
        else
            System.out.println("Montant de dépôt invalide.");
    }   
    public void retirer(double montant) {
        if (montant > 0 && montant <= solde + decouvertAutorise)
            solde -= montant;
        else
            System.out.println("Retrait refusé.");
    }    
    public void virementVers(CompteBancaire autre, double montant) {
        if (montant > 0 && montant <= solde + decouvertAutorise) {
            this.retirer(montant);   
            autre.deposer(montant); 
        } else {
            System.out.println("Virement impossible : montant ou solde insuffisant.");
        }
    }
    // QUESTION 9    
    public double calculerSoldeAvecInterets() {
        return solde * (1 + tauxInteretAnnuel);
    }  
    public double calculerSoldeAvecInterets(double bonus) {
        return solde * (1 + tauxInteretAnnuel + bonus);
    } 
    //  QUESTION 10 
    public static int    getNbComptes(){ return nbComptes; }
    public static double getTauxInteretAnnuel(){ return tauxInteretAnnuel; }
    public static void   setTauxInteretAnnuel(double taux)  {
        if (taux >= 0) tauxInteretAnnuel = taux;
    }
}