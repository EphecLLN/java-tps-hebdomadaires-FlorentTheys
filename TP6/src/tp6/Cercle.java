package tp6;

public class Cercle extends Shape {


	private double rayon;
	private static int compteurCercle = 0;
	
	public Cercle(int x, int y, double rayon) {
		super(x, y);
		this.rayon = rayon;
	}

	@Override
	public double surface() {
		return rayon * rayon * Math.PI;
	}

	@Override
	public double perimetre() {
		return 2 * rayon * Math.PI;
	}

	@Override
	public int getNextId() {
		compteurCercle++;
		return compteurCercle;
	}

	@Override
	public void affiche() {
		System.out.println(this.toString());		
	}

	@Override
	public void deplace(int deltaX, int deltaY) {
		this.x = deltaX;
		this.y = deltaY;		
	}

	@Override
	public void agrandit(int facteur) {
		this.rayon = this.rayon * facteur;		
	}

}
