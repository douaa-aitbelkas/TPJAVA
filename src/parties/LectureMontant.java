package parties;

public class LectureMontant {

    public static double lireMontant(
            String valeur
    ) {
        try {
            double montant =
                    Double.parseDouble(valeur);
            if (montant < 0) {
                throw new IllegalArgumentException("Montant négatif" );
            }
            return montant;
        } catch (NumberFormatException e ) {
            System.out.println( "Valeur non numérique");
        } catch (IllegalArgumentException e ) {
            System.out.println(e.getMessage() );
        }
        return 0;
    }
    public static void main(String[] args) {
        double montant =
                lireMontant("-50");
        System.out.println(
                "Montant : "
                + montant
        );
    }
}
