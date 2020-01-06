package tp5;

public class Employe extends Personne {

	private int salaire;
	private String employeur;
	
	
	/**
	 * constructeur avec paramètre 
	 * @param nom				nom de l'employé
	 * @param prenom			prénom de l'employé
	 * @param registreNational	numéro de registre national de l'employé
	 * @param salaire			combien gagne la personne mensuellement
	 * @param employeur			nom de son employeur
	 */
	public Employe(String nom, String prenom, int registreNational, String employeur, int salaire) {
		super(nom, prenom, registreNational);
		this.salaire = salaire;
		this.employeur = employeur;
	}
		
	/**
	 * Renvoie sous forme de string notre classe Employe
	 */
	@Override
	public String toString() {
		return "Employé : \n" + super.toString() + "\n salaire= " + salaire + "\n employeur= " + employeur;
	}
	
	
	
}
