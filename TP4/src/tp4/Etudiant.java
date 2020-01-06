/**
 * 
 */
package tp4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import jdk.internal.org.jline.utils.InputStreamReader;

/**
 * @author Florent Theys
 */
public class Etudiant {
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static int nbEtudiants = 0;
	private String nom;
	private String prenom;
	private int matricule;
	private LocalDate dateDeNaissance;
	
	
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
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	
	/**
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	
	/**
	 * Constructeur sans param
	 */
	public Etudiant() {
		this.nom = "";
		this.prenom = "";
		this.matricule = nbEtudiants + 1;
		incrementerNbEtudiants();
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
	 * @param dateDeNaissance	La date de naissance de l'étudiant
	 */
	public Etudiant(String nom, String prenom, String dateDeNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = nbEtudiants + 1;
		incrementerNbEtudiants();
		this.dateDeNaissance = LocalDate.parse(dateDeNaissance, format);
	}
	
	/*
	 * incremente le nombre d'étudiants.
	 */
	public void incrementerNbEtudiants() {
		nbEtudiants++;
	}
	
	/**
	 * renvoie le nombre d'étudiant créé depuis le début
	 * @return	le nombre d'étudiant créé depuis le début.
	 */
	public int getNbEtudiants() {
		return nbEtudiants;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricule;
		return result;
	}

	/**
	 * Compare si les 2 étudiants sont les même sur bases de leur matricules
	 * @param obj		l'étudiant à mettre en comparaison
	 * @return boolean	true Si ils ont le même matricule, false si ce sont des matricules différents
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Etudiant other = (Etudiant) obj;
		if (matricule != other.matricule)
			return false;
		return true;
	}

	/**
	 * Compare deux étudiant sur base de leur matricule
	 * @param etu	étudiant à comparer
	 * @return int	0 Si il s'agit du même étudiant, 1 Si l'étudiant à comparer à un plus petit matricrule, 
	 * -1 Si létudiant à comparer à un plus grand matricule
	 */
	public int compareTo(Etudiant etu) {
		if (this.equals(etu)) {
			return 0;
		} else if(this.matricule < etu.matricule) {
			return -1;
		} else {
			return 1;
		}
	}
	
	public int age() {
		LocalDate aujhui = LocalDate.now();
		Period p = Period.between(this.dateDeNaissance, aujhui);
		return p.getYears();
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
	 */
/**	 public static void main(String[] args) {
		 try {
			 InputStream ips = new FileInputStream("C:/Users/Flo/Documents/Ephec/2ème/Java/TP4/Etudiant.txt");
			 BufferedReader reader = new BufferedReader(new InputStreamReader(ips));
			 String line;
			 while((line = reader.readLine()) != null) {
				 
				 
			 }
		 }

	}**/
	public static void main(String[] args) {
		Etudiant etu1 = new Etudiant("Theys", "Florent", "17/02/1992");
		System.out.println(etu1.toString());
	}
} 
