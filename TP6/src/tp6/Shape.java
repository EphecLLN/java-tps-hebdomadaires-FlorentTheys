package tp6;

import java.text.DecimalFormat;

import interfaces.Affichable;
import interfaces.Transformable;

public abstract class Shape implements Affichable, Transformable{
	
	DecimalFormat df = new DecimalFormat("#0.00");
	protected int id;
	protected int x;
	protected int y;
	
	public abstract double surface();
	public abstract double perimetre();
	public abstract int getNextId();
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
		this.id = getNextId();
	}
	
	
	public String getNom() {
		return this.getClass().getSimpleName() + "-" + this.id;
	}
	
	@Override
	public String toString() {
		return "forme: " + this.getNom() + "\nposition: x= " + x + " ; y= " + y + "\npérimètre: " + df.format(this.perimetre()) + 
				"\nsurfarce: " + df.format(this.surface()) + "\n";
	}	
	public static void main(String[] args) {
		Carre c1 = new Carre(5, 4, 6);
		Carre c2 = new Carre(10, 4, 3);
		Cercle cl1 = new Cercle(-5, -2, 3);
		Cercle cl2 = new Cercle(-20, -6, 5);
		Point p1 = new Point(0, 0);
		Point p2 = new Point(10, 52);
		c1.affiche();
		c1.deplace(2, 12);
		c1.agrandit(2);
		c1.affiche();
		c2.affiche();
		cl1.affiche();
		cl1.deplace(2, 12);
		cl1.agrandit(2);
		cl1.affiche();
		cl2.affiche();
		p1.affiche();
		p1.deplace(5, -25);
		p1.agrandit(5);
		p1.affiche();
		p2.affiche();
		
	}
}
