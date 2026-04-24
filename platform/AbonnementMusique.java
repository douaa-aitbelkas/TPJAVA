package platform;

public class AbonnementMusique extends Abonnement implements Reducible {
 private int nbPlaylists;
 private boolean optionOffline;

 public AbonnementMusique(String nom, double prixBase, int nbProfils, int nbPlaylists, boolean optionOffline) {
     super(nom, prixBase, nbProfils);
     this.nbPlaylists = nbPlaylists;
     this.optionOffline = optionOffline;
 }
 public double calculerCoutMensuel() {
     double cout = getPrixBase();
     if (optionOffline) cout += 15;
     return cout;
 }
 public int calculerScoreSatisfaction() {
     int score = 50;
     if (nbPlaylists > 20) score += 20;
     if (optionOffline) score += 20;
     if (getNbProfils() > 1) score += 10;
     if (score > 100) score = 100;
     return score;
 }
 public double appliquerReduction(double pourcentage) {
     if (estEligibleReduction(pourcentage)) {
         return calculerCoutMensuel() * (1 - pourcentage / 100);
     }
     return calculerCoutMensuel();
 }
 public boolean estEligibleReduction(double pourcentage) {
     return pourcentage <= 30;
 }
}