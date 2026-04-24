package platform;

public abstract class Abonnement {
 private String nom;
 private double prixBase;
 private int nbProfils;

 public Abonnement(String nom, double prixBase, int nbProfils) {
     this.nom = nom;
     if (prixBase <= 0) {
         this.prixBase = 10;
     } else {
         this.prixBase = prixBase;
     }
     if (nbProfils <= 0) {
         this.nbProfils = 1;
     } else {
         this.nbProfils = nbProfils;
     }
 }
 public String getNom() { return nom; }
 public void setNom(String nom) { this.nom = nom; }
 public double getPrixBase() { return prixBase; }
 public void setPrixBase(double prixBase) {this.prixBase = prixBase }
 public int getNbProfils() { return nbProfils; }
 public void setNbProfils(int nbProfils) {this.nbProfils = nbProfils }

 public boolean estPartageFamilial() {
     if (nbProfils >= 3) {
         return true;
     } else {
         return false;
     }
 }
 public void afficherInfos() {
     System.out.println("Nom: " + nom);
     System.out.println("Prix de base: " + prixBase);
     System.out.println("Nombre de profils: " + nbProfils);
     System.out.println("Partage familial: " + estPartageFamilial());
 }

 public abstract double calculerCoutMensuel();
 public abstract int calculerScoreSatisfaction();
}
