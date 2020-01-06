package bibliotheque;

import java.util.Arrays;

public class Livre {
	
	protected String auteur;
	protected String titre;
	protected int annee;
	protected String[] pages = new String[100];

	/**
	 * Constructeur avec paramètre
	 * @param auteur	auteur du livre
	 * @param titre		titre du livre
	 * @param annee		année d'édition du livre
	 */
	public Livre(String auteur, String titre, int annee) {
		this.setAuteur(auteur);
		this.setTitre(titre);
		this.setAnnee(annee);		
	}
	
	/**
	  * Constructeur avec paramètre
	 * @param auteur	auteur du livre
	 * @param titre		titre du livre
	 * @param annee		année d'édition du livre$
	 * @param pages		pages du livre
	 */
	public Livre(String auteur, String titre, int annee, String[] page) {
		this.setAuteur(auteur);
		this.setTitre(titre);
		this.setAnnee(annee);		
		this.setPages(page);
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
		if(auteur == "") {
			this.auteur = "Auteur inconnu";
		}
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
		if(titre == "") {
			this.auteur = "Titre inconnu";
		}
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
		this.annee = annee;
	}
	
	/**
	 * @return the pages
	 */
	public String[] getPages() {
		return pages;
	}
	
	/**
	 * @param pages the pages to set
	 */
	public void setPages(String[] pages) {
		this.pages = pages;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + annee;
		result = prime * result + ((auteur == null) ? 0 : auteur.hashCode());
		result = prime * result + Arrays.hashCode(pages);
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
		return result;
	}

	/**
	 * Vérifie s'il s'agit d'un même livre
	 * @param obj		le livre à comparer
	 * @return boolean	true s'il s'agit du même livre ou false si c'est un livre différent
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
		if (annee != other.annee)
			return false;
		if (auteur == null) {
			if (other.auteur != null)
				return false;
		} else if (!auteur.equals(other.auteur))
			return false;
		if (!Arrays.equals(pages, other.pages))
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}
	
	/**
	 * Renvoie sous forme de String: le titre, l'auteur et l'année d'édition du livre
	 */
	@Override
	public String toString() {
		return "Livre:\n titre= " + titre + "\n ateur= " + auteur + ", annee d'édition= " + annee;
	}

	/**
	 * renvoie la page sélectionné
	 * @param i	numéro de la page à renvoyer
	 * @return	la page en fonction du numéro de page
	 */
	public String getPage(int i) {
		if(this.pages[i] == null) {
			return null;
		} else {
			return this.pages[i];
		}
	}
	
	/**
	 * Remplace la page choisit
	 * @param i	numéro de la page à remplacer
	 * @param p	texte à inserer dans la mpage
	 * @return	l'ancienne page
	 */
	public String setPage(int i, String p) {
		String anciennePage = this.pages[i];
		this.pages[i] = p;
		return anciennePage;
	}
	
	/**
	 * Retourne la première page du livre
	 * @return	1er page du livre
	 */
	public String getFirstPage() {
		return this.pages[0];
	}
	
	public String getExtrait() {
		return this.pages[0];
	}
}
