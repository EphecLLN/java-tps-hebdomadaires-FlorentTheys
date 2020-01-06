/**
 * 
 */
package tp1;

/**
 * @author he201661
 *
 */
public class Etudiant {
	private String nom;
	private String prenom;
	private int matricule;
	Date dateDeNaissance;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Etudiant etu1 = new Etudiant();
		etu1.nom = args[0];
		etu1.prenom = args[1];
		etu1.matricule = Integer.parseInt(args[2]);
		etu1.dateDeNaissance = new Date();
		etu1.dateDeNaissance.jour = Integer.parseInt(args[3]);
		etu1.dateDeNaissance.mois = Integer.parseInt(args[4]);
		etu1.dateDeNaissance.annee = Integer.parseInt(args[5]);
		System.out.println(etu1.nom + " " + etu1.prenom + " " 
				+ etu1.matricule + " " + etu1.dateDeNaissance.jour 
				+ "/" + etu1.dateDeNaissance.mois + "/" 
				+ etu1.dateDeNaissance.annee);

	}
}
