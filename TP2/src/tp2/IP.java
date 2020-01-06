/**
 * 
 */
package tp2;

/**
 * @author Florent Theys
 *
 */
public class IP {
	private int a;
	private int b;
	private int c;
	private int d;
	
	/**
	 * mets sous forme de texte les attributs de notre objet
	 */
	@Override
	public String toString() {
		return "IP: "  + a + "." + b + "." + c + "." + d;
	}

	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		if(a > 255 || a < 0) {
			System.out.println("l'octet \"a\" doit être compris entre 0 et 255");
		} else {
			this.a = a;
		}
	}

	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		if(b > 255 || b < 0) {
			System.out.println("l'octet \"b\" doit être compris entre 0 et 255");
		} else {
			this.b = b;
		}
	}

	/**
	 * @return the c
	 */
	public int getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(int c) {
		if(c > 255 || c < 0) {
			System.out.println("l'octet \"c\" doit être compris entre 0 et 255");
		} else {
			this.c = c;
		}
	}

	/**
	 * @return the d
	 */
	public int getD() {
		return d;
	}

	/**
	 * @param d the d to set
	 */
	public void setD(int d) {
		if(d > 255 || d < 0) {
			System.out.println("l'octet \"d\" doit être compris entre 0 et 255");
		} else {
			this.d = d;
		}
	}

	/**
	 * Constucteur sans paramètre
	 */
	public IP() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
		this.d = 0;
	}
	
	/**
	 * Constructeur avec param
	 * @param a		octet de poids le plus fort
	 * @param b		octet de poids le 2ème plus fort
	 * @param c		octet de poids le 2ème plus faible
	 * @param d		octet de poids le plus faible
	 */
	public IP(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	/**
	 * Instancie un nouvel objet IP.
	 * définit ses 4 octet à l'aide des paramètre.
	 * Affiche l'adresse ip.
	 * @param args[0]	octet de poids le plus fort
	 * @param args[1]	octet de poids le 2ème plus fort
	 * @param args[2]	octet de poids le 2ème plus faible
	 * @param args[3]	octet de poids le plus faible
	 */
	public static void main(String[] args) {
		IP ipv4 = new IP();
		ipv4.setA(Integer.parseInt(args[0]));
		ipv4.setB(Integer.parseInt(args[1]));
		ipv4.setC(Integer.parseInt(args[2]));
		ipv4.setD(Integer.parseInt(args[3]));
		System.out.println(ipv4);
	}

}
