package platform;

public class TestAbonnements {
 public static void main(String[] args) {

     Abonnement[] abonnements = {
         new AbonnementVideo("Netflix", 80, 4, true, true),
         new AbonnementMusique("Spotify", 40, 2, 25, true),
         new AbonnementJeux("GamePass", 100, 1, 60, 50)
     };

     for (Abonnement a : abonnements) {
         a.afficherInfos();
         System.out.println("Cout mensuel: " + a.calculerCoutMensuel());
         System.out.println("Score satisfaction: " + a.calculerScoreSatisfaction());
     }

     Reducible[] reducibles = {
             (Reducible) abonnements[0],
             (Reducible) abonnements[1]
         };

     for (Reducible r : reducibles) {
         System.out.println("Reduction 20%: " + r.appliquerReduction(20));
         System.out.println("Reduction 50%: " + r.appliquerReduction(50));
     }
 }
}