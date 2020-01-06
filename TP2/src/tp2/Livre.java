/**
 * 
 */
package tp2;

/**
 * @author Florent Theys
 *
 */
public class Livre {
	
	private String titre;
	private String auteur;
	private String numISBN;

	/**
	 * mets sous forme de texte les attributs de notre objet.
	 */
	@Override
	public String toString() {
		return "Livre:\n titre= " + titre + "\n auteur= " + auteur + "\n numISBN= " + numISBN;
	}

	/**
	 * Constructeur sans paramètre
	 */
	public Livre() {
		this.titre = "";
		this.auteur = "";
		this.numISBN = "";
	}
	
	/**
	 * Constructeur avec paramètres
	 * @param titre		titre du livre
	 * @param auteur	auteur du livre
	 * @param numISBN	numero isbn du livre
	 */
	public Livre(String titre, String auteur, String numISBN) {
		this.titre = titre;
		this.auteur = auteur;
		this.numISBN = numISBN;
	}
	
	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/**
	 * @return the numISBN
	 */
	public String getNumISBN() {
		return numISBN;
	}

	/**
	 * @param numISBN the numISBN to set
	 */
	public void setNumISBN(String numISBN) {
		this.numISBN = numISBN;
	}

	/**
	 * Instancie un nouvel objet Livre.
	 * Définit les attributs de l'objet via les paramètres.
	 * Affiche notre objet en console.
	 * @param args[0]	titre du livre
	 * @param args[1]	auteur du livre
	 * @param args[2]	numero isbn du livre
	 */
	public static void main(String[] args) {
		
		Livre liv = new Livre();
		liv.setTitre(args[0]);
		liv.setAuteur(args[1]);
		liv.setNumISBN(args[2]);
		System.out.println(liv);
	}
}
