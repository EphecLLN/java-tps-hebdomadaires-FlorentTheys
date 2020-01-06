/**
 * 
 */
package tp2;

/**
 * @author Florent Theys
 */
public class Etudiant {
	private String nom;
	private String prenom;
	private int matricule;
	private Date dateDeNaissance;
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * @return the matricule
	 */
	public int getMatricule() {
		return matricule;
	}
	
	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	
	/**
	 * @return the dateDeNaissance
	 */
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	
	/**
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	
	/**
	 * Constructeur sans param
	 */
	public Etudiant() {
		this.nom = "";
		this.prenom = "";
		this.matricule = 0;
		this.dateDeNaissance = null;
	}
	
	/**
	 * mets sous forme de texte les attributs de notre objet
	 */
	@Override
	public String toString() {
		return "Etudiant: \n nom= " + nom + "\n prenom= " + prenom + "\n matricule= " + matricule + "\n dateDeNaissance= "
				+ dateDeNaissance;
	}

	/**
	 * constructeur avec param
	 * @param nom				Le nom de l'étudiant			
	 * @param prenom			Le prénom de l'étudiant
	 * @param matricule			Le matricule de l'étudiant
	 * @param dateDeNaissance	La date de naissance de l'étudiant
	 */
	public Etudiant(String nom, String prenom, int matricule, Date dateDeNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.dateDeNaissance = dateDeNaissance;
	}
	
	/**
	 * Initialise un nouvel objet Etudiant.
	 * Définit ses attributs via les paramètre
	 * Affiche l'objet étudiant en console
	 * @param args[0]	définit le nom de l'étudiant
	 * @param args[1]	définit le prénom de l'étudiant
	 * @param args[2]	définit le matricule de l'étudiant
	 * @param args[3]	définit le jour de naissance de l'étudiant
	 * @param args[4]	définit le mois de naissance de l'étudiant
	 * @param args[5]	définit l'année de naissance de l'étudiant
	 * 	 */
	public static void main(String[] args) {
		Etudiant etu1 = new Etudiant();
		etu1.setNom(args[0]);
		etu1.setPrenom(args[1]);
		etu1.setMatricule(Integer.parseInt(args[2]));;
		etu1.dateDeNaissance = new Date();
		etu1.dateDeNaissance.setJour(Integer.parseInt(args[3]));
		etu1.dateDeNaissance.setMois(Integer.parseInt(args[4]));;
		etu1.dateDeNaissance.setAnnee(Integer.parseInt(args[5]));;
		System.out.println(etu1);

	}
}
