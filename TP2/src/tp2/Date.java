/**
 *
 */
package tp2;

/**
 * @author Florent Theys
 *
 */
public class Date {

	private int jour;
	private int mois;
	private int annee;

	/**
	 * @return the jour
	 */
	public int getJour() {
		return jour;
	}


	/**
	 * @param jour the jour to set
	 */
	public void setJour(int jour) {
		if(jour <= 0 || jour >= 31) {
			System.out.println("Insérez un jour entre 1 et 31");
		} else {
			this.jour = jour;
		}
	}


	/**
	 * @return the mois
	 */
	public int getMois() {
		return mois;
	}


	/**
	 * @param mois the mois to set
	 */
	public void setMois(int mois) {
		if(mois <= 0 || mois >= 12) {
			System.out.println("Insérez un mois entre 1 et 12");
		} else {
			this.mois = mois;
		}		
	}

	/**
	 * mets sous forme de texte les attributs de notre objet
	 */
	@Override
	public String toString() {
		return "Date : " + jour + "/" + mois + "/" + annee;
	}


	/**
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}


	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		if(annee <= 1850 || annee > 2020) {
			System.out.println("Insérez une année valide");
		} else {
			this.annee = annee;
		}		
	}
	
	/**
	 * Constructeur sans paramètres
	 */
	public Date() {
		this.jour = 0;
		this.mois = 0;
		this.annee = 0;
	}
	
	/**
	 * Constructeur avec paramètre
	 * @param jour		jour encodé
	 * @param mois		mois encodé
	 * @param annee		mois encodée
	 */
	public Date(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	/**
	 * instancie un nouvel objet date dont les attribut seront définient via les paramètre.
	 * Affiche l'objet en console. 
	 * @param args[0]	définit le jour 
	 * @param args[1]	définit le mois
	 * @param args[2]	définit l'année
	 */
	public static void main(String[] args) {
		Date dateEtu = new Date();
		dateEtu.setJour(Integer.parseInt(args[0]));
		dateEtu.setMois(Integer.parseInt(args[1]));
		dateEtu.setAnnee(Integer.parseInt(args[2]));
		System.out.println(dateEtu);
	}
}
