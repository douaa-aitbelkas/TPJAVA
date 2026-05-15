package parties;

public class Paiement {

    public static double effectuerPaiement(double montant,double solde) {
        if (montant <= 0) {
            throw new IllegalArgumentException(
                    "Montant invalide"
            );
        }
        if (montant > solde) {
            throw new ArithmeticException("Solde insuffisant");
        }
        return solde - montant;
    }
    public static void main(String[] args) {
        double solde = 1000;
        try {
            solde =
                    effectuerPaiement(
                            200,
                            solde
                    );
            System.out.println("Paiement effectué" );
            System.out.println( "Nouveau solde : "+ solde);
        } catch ( IllegalArgumentException e) {
            System.out.println("Erreur : montant invalide");
        } catch (ArithmeticException e) {
            System.out.println("Erreur : solde insuffisant");
        } finally {
            System.out.println("Fin de la transaction" );
        }
    }
}
