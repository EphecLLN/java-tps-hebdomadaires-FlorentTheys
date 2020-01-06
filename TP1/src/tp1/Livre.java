/**
 * 
 */
package tp1;

/**
 * @author he201661
 *
 */
public class Livre {
	
	String titre;
	String auteur;
	String numISBN;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Livre liv = new Livre();
		liv.titre = args[0];
		liv.auteur = args[1];
		liv.numISBN = args[2];
		System.out.println(liv.titre + " " + liv.auteur + " " + liv.numISBN);
	}
}
