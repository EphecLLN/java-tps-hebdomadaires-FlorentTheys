/**
 *
 */
package tp4;

import java.util.Scanner;

/**
 * @author Florent Theys
 *
 */
public class Date {

	private static Scanner sc = new Scanner(System.in);
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
	 * Constructeur avec format "DD/MM/YYYY"
	 * @param str	date sous format "DD/MM/YYYY"
	 */
	public Date(String str) {
		String[] tbStr = str.split("/");
		this.jour = Integer.parseInt(tbStr[0]);
		this.mois = Integer.parseInt(tbStr[1]);
		this.annee = Integer.parseInt(tbStr[2]);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + annee;
		result = prime * result + jour;
		result = prime * result + mois;
		return result;
	}

	/**
	 * Compare si il s'agit de la même date
	 * @param obj		date à comparer
	 * @return true		il s'agit de la même date
	 * @return false	ce n'est pas la même date
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (annee != other.annee)
			return false;
		if (jour != other.jour)
			return false;
		if (mois != other.mois)
			return false;
		return true;
	}
	
	/**
	 * compare deux dates entre elles
	 * @param dt	date à comparer
	 * @return 0	Si il s'agit de la même date
	 * @return 1	Si la date comparé est plus vielle
	 * @return -1	Si la date comparé est plus récente
	 */
	public int compareTo(Date dt) {
		if(this.equals(dt)) {
			return 0;
		} else if(this.annee == dt.annee) {
			if(this.mois == dt.mois) {
				if(this.jour > dt.jour) {
					return 1;
				} else {
					return -1;
				}
			} else if(this.mois > dt.mois) {
				return 1;
			} else {
				return -1;
			}
		} else if(this.annee > dt.annee){
			return 1;
		} else { 
			return -1;
		}
	}


	/**
	 * instancie un nouvel objet date dont les attribut seront définient via les paramètre.
	 * Affiche l'objet en console. 
	 * @param args[0]	définit le jour 
	 * @param args[1]	définit le mois
	 * @param args[2]	définit l'année
	 */
	public static void main(String[] args) {
		System.out.println("Entrez votre date de naissance(format DD/MM/YYYY):");
		Date bd = new Date(sc.next());
		System.out.println(bd.toString());
	}
}
