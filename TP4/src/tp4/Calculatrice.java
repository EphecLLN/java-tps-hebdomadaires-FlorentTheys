/**
 * 
 */
package tp4;

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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(valeurCourante);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	/**
	 * Vérifie si deux objets on la même valeur sémentique
	 * @param obj		objet à comparer
	 * @return true		si éqal 
	 * @return false	si non égal
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculatrice other = (Calculatrice) obj;
		if (Double.doubleToLongBits(valeurCourante) != Double.doubleToLongBits(other.valeurCourante))
			return false;
		return true;
	}
	
	/**
	 * compare les 2 valeurs courantes de notre calculatrice 
	 * @param calc	objet calculatrice à comparer
	 * @return 0	si les deux valeurs courantes sont les même
	 * @return 1	si la valeur courante actuel est plus grand
	 * @return -1	si la valeur courante de l'objet comparé est plus grand
	 */
	public int compareTo(Calculatrice calc) {
		if(this.valeurCourante > calc.valeurCourante) {
			return 1;
		} else if(this.valeurCourante < calc.valeurCourante) {
			return -1;
		} else {
			return 0;
		}
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
