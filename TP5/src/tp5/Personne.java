package tp5;


public class Personne {

	protected String name;
	protected String firstName;
	protected int nationalRegister;
	
	/**
	 * Constructeur sans paramètres
	 */
	public Personne() {
		this.name = "";
		this.firstName = "";	
		this.nationalRegister = 0;
	}
	
	/**
	 * Constructeur avec paramètres
	 * @param1 name			nom de la personne
	 * @param2 firstName	prénom de la personne	
	 */
	public Personne(String name, String firstName, int nationalRegister) {
		this.name = name;
		this.firstName = firstName;
		this.nationalRegister = nationalRegister;
	}

	public Personne(Personne pers) {
		
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nationalRegister;
		return result;
	}

	/**
	 * Vérifié s'il s'agit de la même personne en fonction de son numéro de registre national
	 * @param obj		la personne à comparer
	 * @return boolean	true s'il s'agit de la même personne ou false si ce n'est pas la même personne
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
		if (nationalRegister != other.nationalRegister)
			return false;
		return true;
	}

	/**
	 * compare le nom de deux étudiants s'il on le même nom compare le prénom aussi
	 * @param other	la personne avec qui faire la comparaison
	 * @return int 	0 Si les objets sont les même, 1 Si l'objet courant est plus grand ou -1Si l'objet courant est plus petit
	 */
	public int compareString(Personne other) {
		int resultName = this.name.compareTo(other.name);
		int resultFirstName = this.firstName.compareTo(other.firstName);
		if(equals(other)) {
			return 0;
		} else if(resultName > 0) { 
			return 1;			
		} else if(resultName == 0) {
			if(resultFirstName > 0) {
				return 1;
			} else {
				return -1;
			}									
		} else {
			return -1;
		}		
	}

	/**
	 * Renvoie sous forme de string notre class
	 */
	@Override
	public String toString() {
		return "Personne: \n nom= " + name + "\n prénom= " + firstName + "\n Registre national = " + nationalRegister;
	}

	public static void main(String [] args) {
		Personne pers = new Personne("Jules", "Dupont", 123234);
		Personne emp = new Employe("Jules", "Dupont", 123234, "EPHEC", 1500);
		Personne ind = new Independant("Jules", "Dupont", 123234, "BE0123456789");
		System.out.println(pers);
		System.out.println(emp);
		System.out.println(ind);
		}
}
