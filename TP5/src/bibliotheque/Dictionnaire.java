package bibliotheque;

import java.util.Arrays;

public class Dictionnaire extends Livre {

	private String langue;
	private String[][] dictPages = new String[100][10];
	

	public Dictionnaire(String auteur, String titre, int annee, String langue, String[][] definition) {
		super(auteur, titre, annee);
		this.langue = langue;
		this.dictPages = definition;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.deepHashCode(dictPages);
		result = prime * result + ((langue == null) ? 0 : langue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Dictionnaire))
			return false;
		Dictionnaire other = (Dictionnaire) obj;
		if (!Arrays.deepEquals(dictPages, other.dictPages))
			return false;
		if (langue == null) {
			if (other.langue != null)
				return false;
		} else if (!langue.equals(other.langue))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dictionnaire: \n langue= " + langue + "\n page= " + Arrays.toString(dictPages) + "\n auteur= " + auteur
				+ "\n titre= " + titre + "\n année d'édition= " + annee ;
	}
	
	public String getPage(int i) {
		String result = "";
		if(this.dictPages[i] == null) {
			return null;
		} else {
			for (int j = 0; j <  dictPages[i].length; j++) {
				result += dictPages[i][j] + "\n";
				}
			return result;	
			}
		}
	
	//Set page n'a plus de sens
	
	public String SetDefinition(int i, int j, String p) {
		String anciennePage = this.dictPages[i][j];
		this.dictPages[i][j] = p;
		return anciennePage;
	}
	
	public String getFirstPage() {
		String result = "";
		if(this.dictPages[0] == null) {
			return null;
		} else {
			for (int j = 0; j <  dictPages[0].length; j++) {
				result += dictPages[0][j] + "\n";
				}
			return result;	
			}
	}
	
	public String getExtrait() {
		return this.dictPages[0][0];
	}
	
	public String getDefinition(int i, int j) {
		return this.dictPages[i][j];
	}
}
