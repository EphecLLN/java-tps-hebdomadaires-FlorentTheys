package tp4;

/**
 * 
 * @author Florent Theys
 *
 */
public class Cercle {

	private double rayon;
	
	/**
	 * Constructeur sans paramètres
	 */
	public Cercle() {
		this.rayon = 0.00;
	}
	
	/**
	 * Constructeur avec paramètre
	 * @param rayon	le rayon du cercle
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	/**
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	/**
	 * Renvoie l'affichage de notre classe cercle
	 */
	@Override
	public String toString() {
		return "Cercle: \n rayon=" + rayon;
	}
	
	/**
	 * Calcule l'aire du cercle
	 * @return			aire du cercle
	 */
	public double calculerAire() {	
		return rayon * rayon * Math.PI ;
	}
	
	/**
	 * Calcule le périmètre du cercle 
	 * @return 			périmètre du cercle
	 */
	public double calculerPerimetre() {
		return 2 * Math.PI * rayon;
	}
}
