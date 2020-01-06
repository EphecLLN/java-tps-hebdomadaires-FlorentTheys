/**
 * 
 */
package tp2;

/**
 * @author Florent Theys
 *
 */
public class Calculatrice {

	private double valeurCourante;
	
	
	/**
	 * @return the valeurCourante
	 */
	public double getValeurCourante() {
		return valeurCourante;
	}

	/**
	 * @param valeurCourante the valeurCourante to set
	 */
	public void setValeurCourante(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}

	/**
	 * Constructeur sans paramètre
	 */
	public Calculatrice( ) {
		this.valeurCourante = 0;
	}
	
	/**
	 * Constructeur avec paramètre
	 * @param n		nombre entier de valeurCourante
	 */
	public Calculatrice(double n) {
		super();
		this.valeurCourante = n;
	}
	
	/**
	 * additionne notre valeur courante avec un nombre n.
	 * @param n		nombre qu'on veut rajouter à notre valeur courante.
	 */
	void ajoute(double n) {
		valeurCourante += n;
	}
	
	/**
	 * soustrait notre valeur courante avec un nombre n.
	 * @param n		nombre qu'on veut soustraire à notre valeur courante.
	 */
	void soustrait(double n) {
		valeurCourante -= n;
	}
	
	/**
	 * va mettre au carré le nombre de notre valeur courante.
	 */
	void carre() {
		valeurCourante *= valeurCourante;
	}

	/**
	 *	@return  une  représentation  textuelle de la  valeur  actuelle  de la  calculatrice
	 */
	public  String  toString() {
		return "Valeur  affichée : " + valeurCourante;
	}
	
	/**
	 * Instancie un nouvel objet calculatrice dont l'attribut sera le paramètre.
	 *	ajoute à l'attribut du nouvel objet 5.
	 *	soustrait à l'attribut du nouvel objet 2.
	 *	mets au carré l'attribut du nouvel objet.
	 *	Affiche la valeur actuel à chaque étape cité précédement.
	 * @param args[0]	valeur de la valeur courante du nouvel objet.
	 */
	public static void main(String[] args) {
		Calculatrice myCalc = new Calculatrice();
		myCalc.setValeurCourante(Integer.parseInt(args[0]));
		System.out.println(myCalc);
		myCalc.ajoute(5);
		System.out.println(myCalc);
		myCalc.soustrait(2);
		System.out.println(myCalc);
		myCalc.carre();
		System.out.println(myCalc);
		}

}
