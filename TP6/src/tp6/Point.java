package tp6;

public class Point extends Shape {
	
	private static int compteurPoint = 0;
	
	public Point(int x, int y) {
		super(x, y);
	}

	public double perimetre() {
		return 0;
	}
	
	public double surface() {
		return 0;
	}

	@Override
	public int getNextId() {
		compteurPoint++;
		return compteurPoint;
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
	}
}
