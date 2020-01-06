/**
 * 
 */
package tp1;

/**
 * @author he201661
 *
 */
public class Calculatrice {

	private double valeurCourante;
	
	
	void ajoute(double n) {
		valeurCourante += n;
	}
	
	void soustrait(double n) {
		valeurCourante -= n;
	}
	
	void carre() {
		valeurCourante *= valeurCourante;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculatrice mycalc = new Calculatrice();
		mycalc.ajoute(5);
		System.out.println(mycalc.valeurCourante);
		mycalc.soustrait(2);
		System.out.println(mycalc.valeurCourante);
		mycalc.carre();
		System.out.println(mycalc.valeurCourante);
		}

}
