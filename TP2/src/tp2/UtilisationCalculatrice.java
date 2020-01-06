package tp2;

/**
 * @author Florent Theys
 *
 */
public class UtilisationCalculatrice {
	
	/**
	 * Teste de l'encapsulation.
	 * @param args aucun paramètre attendu
	 */
	public static void main(String[] args) {
		Calculatrice myCalc = new Calculatrice();
		myCalc.setValeurCourante(12);
		System.out.println(myCalc.getValeurCourante());
	}

}
