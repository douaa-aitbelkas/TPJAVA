package parties;

public class PropagationExceptions {

    public static double lireMontant( String valeur)
            throws NumberFormatException,
            IllegalArgumentException {
        double montant =Double.parseDouble(valeur);
        if (montant < 0) {
            throw new IllegalArgumentException("Montant négatif" );
        }
        return montant;
    }
    public static void main(String[] args) {
        try {
            double montant =lireMontant("-10");
             System.out.println("Montant : "+ montant);
        } catch (NumberFormatException e
        ) { System.out.println( "Erreur format" );
        } catch ( IllegalArgumentException e
        ) {
            System.out.println( e.getMessage() );
        }
    }
}
