/**
 * 
 */
package tp1;

/**
 * @author he201661
 *
 */
public class Date {
	
	public int jour;
	public int mois;
	public int annee;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date etuDate = new Date();
		etuDate.jour = Integer.parseInt(args[0]);
		etuDate.mois = Integer.parseInt(args[1]);
		etuDate.annee = Integer.parseInt(args[2]);
		System.out.println(etuDate.jour + "/" + etuDate.mois + "/" + etuDate.annee);
	}

}
