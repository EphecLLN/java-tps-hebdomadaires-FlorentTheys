package tp4;

public class Personne {

	private String name;
	private String firstName;
	
	/**
	 * Constructeur sans paramètres
	 */
	public Personne() {
		this.name = "";
		this.firstName = "";		
	}
	
	/**
	 * Constructeur avec paramètres
	 * @param1 name			nom de la personne
	 * @param2 firstName	prénom de la personne	
	 */
	public Personne(String name, String firstName) {
		this.name = name;
		this.firstName = firstName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/**
	 * vérifie si les deux objets sont les mêmes
	 * @param obj		personne à vérifier
	 * @return true		si même personne
	 * @return false	si personne différente
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
		
	/**
	 * compare le nom de deux étudiants s'il on le même nom compare le prénom aussi
	 * @param other	la personne avec qui faire la comparaison
	 * @return 0 		Si les objets sont les même
	 * @return positif 	Si l'objet courant est plus grand
	 * @return négatif	Si l'objet courant est plus petit
	 */
	public int compareString(Personne other) {
		int resultName = this.name.compareTo(other.name);
		int resultFirstName = this.firstName.compareTo(other.firstName);
		if(resultName != 0) {
			return resultName;
		}
		else if(resultFirstName != 0) {
			return resultFirstName;
		}
		return 0;
	}

}
