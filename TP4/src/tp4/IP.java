/**
 * 
 */
package tp4;

import java.util.Scanner;

import sun.java2d.loops.ScaledBlit;

/**
 * @author Florent Theys
 *
 */
public class IP {
	private int a;
	private int b;
	private int c;
	private int d;
	private static Scanner sc = new Scanner(System.in);
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
	 * @return the sc
	 */
	public Scanner getSc() {
		return sc;
	}

	/**
	 * @param sc the sc to set
	 */
	public void setSc(Scanner sc) {
		this.sc = sc;
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
	 * constructeur avec param sous format "x.x.x.x"
	 * @param str	adresse ip sous format "x.x.x.x"
	 */
	public IP(String str) {
		this.a = Integer.parseInt(str.split("\\.")[0]);
		this.b = Integer.parseInt(str.split("\\.")[1]);
		this.c = Integer.parseInt(str.split("\\.")[2]);
		this.d = Integer.parseInt(str.split("\\.")[3]);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		result = prime * result + c;
		result = prime * result + d;
		return result;
	}
	/**
	 * Vérifie si deux objets IP sont les même
	 * @param obj		adresse ip à comparé
	 * @return true		l'adresse ip est la même
	 * @return false 	l'adresse ip est différente
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IP other = (IP) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		if (c != other.c)
			return false;
		if (d != other.d)
			return false;
		return true;
	}

	/**
	 * Compare 2 adresse ip 
	 * param adr	adresse ip à comparer
	 * @return 0	adresses ip identique
	 * @return 1	l'adresse ip comparé est plus petite
	 * @return -1	l'adresse ip comparé est plus grande
	 */
	public int compareTo(IP adr) {
		if(this.a > adr.a) {
			return 1;
		}
		else if(this.a < adr.a) {
			return -1;
		}

		if(this.b > adr.b) {
			return 1;
		}
		else if(this.b < adr.b) {
			return -1;
		}

		if(this.c > adr.c) {
			return 1;
		}
		else if(this.c < adr.c) {
			return -1;
		}

		if(this.d > adr.d) {
			return 1;
		}
		if(this.d < adr.d) {
			return -1;
		}
		return 0;
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
		System.out.println("Entrez une adresse ip(format x.x.x.x)");
		IP adr = new IP(sc.next());
		System.out.println(adr.toString());
	}

}
