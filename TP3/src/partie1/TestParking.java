package partie1;

public class TestParking {
    public static void main(String[] args) {
        Vehicule[] v = new Vehicule[4];
        v[0] = new Voiture("V1", "Toyota", 4);
        v[1] = new Voiture("V2", "Renault", 5);
        v[2] = new Moto("M1", "Yamaha", true);
        v[3] = new Camion("C1", "Volvo", 12000);
        
        for (Vehicule veh : v) {
            veh.stationner();
            veh.afficher();   
        }

        for (Vehicule veh : v) {
            if (veh instanceof Voiture) {
                veh.afficher();
            }
        } 
        //question e
        Vehicule x = new Voiture("11C22", "Yamaha", 4);
        Voiture v1 = (Voiture)x;
        System.out.println("downcasting réussi!");
        
    }
}