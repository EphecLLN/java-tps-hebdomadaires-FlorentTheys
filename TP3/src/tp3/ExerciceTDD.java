/**
 * 
 */
package tp3;

/**
 * @author Florent Theys
 *
 */
public class ExerciceTDD {
	
	/**
	* Cette méthode vérifie si un nombre est pair
	* @param a : un nombre entier quelconque
	* @return true : si le nombre est pair
	* @return false : si le nombre est impair
	*/
	public boolean isEven(int a){
		if (a % 2 == 0){
		return true;
		}
		else{
		return false;
		}
	}
	
	/**
	* calcule le périmètre d'un carrée en multipliant son coté fois 4
	* @param n : un nombre positif correspond à la longueur du coté du carrée
	* @return un nombre étant le résultat de la multiplication de n par 4
	*/
	public double getSquarePerimeter(double n) {
		if(n >= 0) {
			return n * 4;
		} else {
			return -1;
		}
	}
	
	/**
	* Vérifie si un caractère fait partie de la chaine de caractères données.
	* @param str : chaine de caractère à vérifier
	* @param chr: caractère dont il faut vérifier la présence
	* @return true si le caractère se trouve dans la chaine de caractère
	* @return false si le caractère ne se trouve pas dans la chaine de caractère
	*/
	public boolean checkCharInString(String str, CharSequence chr) {
		if (str.contains(chr)) {
			return true;
		} else {
			return false;
		}
	}

}
