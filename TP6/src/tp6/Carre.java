package tp6;

public class Carre extends Shape {

	private int cote;
	private static int compteurCarre = 0;
	
	public Carre(int x, int y, int cote) {
		super(x, y);
		this.cote = cote;
	}
	
	@Override
	public double surface() {
		return cote * cote;
	}

	@Override
	public double perimetre() {
		return cote * 4;
	}

	@Override
	public int getNextId() {
		compteurCarre++;
		return compteurCarre;
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
		this.cote = this.cote * facteur;		
	}
}
