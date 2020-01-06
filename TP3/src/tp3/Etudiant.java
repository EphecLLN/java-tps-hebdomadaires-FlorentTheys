/**
 * 
 */
package tp3;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * @author Florent Theys
 *
 */
public class Etudiant {
	
	private Date birthDate;
	private String name;
	private String firstName;
	private int studentId;
	private double[] examScores;
	private static DecimalFormat deci = new DecimalFormat("0.00");
	
	/**
	 * Constructeur sans paramètre.
	 */
	public Etudiant() {
		this.birthDate = null;
		this.name = "";
		this.firstName = "";
		this.studentId = 0;
		this.examScores = null;
	}
	
	/**
	 * Constructeur avec paramètres.
	 * @param birthDate		date de naissance de l'étudiant
	 * @param name			nom de l'étudiant
	 * @param firstName		prénom de l'étudiant
	 * @param studentId		matricule de l'étudiant
	 * @param examScores	résultat de 5 examens de l'étudiant
	 */
	public Etudiant(Date birthDate, String name, String firstName, int studentId, double[] examScores) {
		super();
		this.birthDate = birthDate;
		this.name = name;
		this.firstName = firstName;
		this.studentId = studentId;
		this.examScores = examScores;
	}
	
	/**
	 * Mets sous forme de texte les atrributs de l'objet
	 */
	@Override
	public String toString() {
		return "Etudiant:\n nom= " + name + "\n prénom= " + firstName + "\n date de naissance= " + birthDate.toString() +  "\n matricule= " 
				+ studentId + "\n moyenne des résultats= " + deci.format(getAverage(examScores));
	}
	
	/**
	 * calcule la moyenne qu'aura l'étudiant sur base d'un tableau de points compris entre 0 et 20
	 * @param scores	tableau des points de l'étudiant
	 * @return la moyenne de l'étudiant
	 * @return -1 si une des cotes est mal encodé (supérieur à 20 ou négative
	 */
	public double getAverage(double[] scores) {
		double sum = 0;
		double avg = 0;
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] < 0 || scores[i] > 20) {
				return -1; 
			} else {
				sum += scores[i];
			}
		}
		avg = sum / scores.length;
		return avg;
	}
	
	public static void main(String args[]) {
		
	} 
	
}
