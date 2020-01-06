package tp5;

public class Independant extends Personne{
	
	private String numTVA;

	/**
	 * Constructeur avec paramètres
	 * @param nom				nom de l'employé
	 * @param prenom			prénom de l'employé
	 * @param registreNational	numéro de registre national de l'employé
	 * @param TVA				numéro de TVA de l'indépendant
	 */
	public Independant(String nom, String prenom, int registreNational, String TVA) {
		super(nom, prenom, registreNational);
		this.numTVA = TVA;		
	}
	/**
	 * Renvoie notre classe sous forme de string
	 */
	@Override
	public String toString() {
		return "Indépendant: \n" + super.toString() + "\n  numéro de TVA= " + numTVA;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numTVA == null) ? 0 : numTVA.hashCode());
		return result;
	}

	/**
	 * Vérifie sur base du numéro de TVA si ce sont les mêmes personnes
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Independant other = (Independant) obj;
		if (numTVA == null) {
			if (other.numTVA != null)
				return false;
		} else if (!numTVA.equals(other.numTVA))
			return false;
		return true;
	}
	
	
}
