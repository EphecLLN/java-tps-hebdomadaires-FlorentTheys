/**
 * 
 */
package tp4;


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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numISBN == null) ? 0 : numISBN.hashCode());
		return result;
	}

	/**
	 * Vérifie si deux objets Livre sont les même sur base de leur ISBN
	 * @param obj		Livre à comparer
	 * @return true		Si livre identique
	 * @return false 	Si livre différent
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livre other = (Livre) obj;
		if (numISBN == null) {
			if (other.numISBN != null)
				return false;
		} else if (!numISBN.equals(other.numISBN))
			return false;
		return true;
	}

	/**
	 * Compare deux livre sur base de leur ISBN
	 * @param liv		livre à comparer
	 * @return 0		Si même livre
	 * @return 1		Si le livre comparé à un ISBN plus petit
	 * @return -1		Si le livre comparé à un IBNS plus grand 
	 */
	public int compareString(Livre liv) {
		int result = this.numISBN.compareTo(liv.numISBN);
		if(this.equals(liv)) {
			return 0;
		} else if(result > 0){
			return 1;
		} else {
			return -1;
		}
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
