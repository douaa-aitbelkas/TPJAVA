package partie2;

import partie1.CompteBancaire;

public class Banque {  
    // QUESTION 1
    private String nom;       
    private CompteBancaire[] comptes;   
    private int nbActuels;    
    // QUESTION 2
    public Banque(String nom, int capaciteMax) {
        this.nom       = nom;
        this.comptes   = new CompteBancaire[capaciteMax]; 
        this.nbActuels = 0;
    } 
    //QUESTION 3a 
    public void ajouterCompte(CompteBancaire c) {
        if (nbActuels < comptes.length) {
            comptes[nbActuels] = c;   
            nbActuels++;
            System.out.println("Compte ajouté : " + c.getTitulaire());
        } else {
            System.out.println("La banque est pleine, impossible d'ajouter un compte.");
        }
    }   
    //QUESTION 3b
    public void afficherTous() {
        System.out.println("\n Comptes de la banque : " + nom + "");
        for (int i = 0; i < nbActuels; i++) {
            comptes[i].afficher();
        }
    }
}