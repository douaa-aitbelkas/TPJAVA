package partie1;

public class Moto extends Vehicule {
    private boolean avecCasque;
	public Moto(String matricule, String marque,boolean avecCasque) {
		super(matricule, marque);
		this.avecCasque = avecCasque;
	}
    public void stationner() {
    	System.out.println("La moto se gare dans une place réservée aux deux-roues");
    }
    public void affiche() {
    	super.afficher();
        System.out.println("avec casque : " + avecCasque);
    }
}
