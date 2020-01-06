/**
 * 
 */
package tp1;

/**
 * @author he201661
 *
 */
public class IP {
	int a;
	int b;
	int c;
	int d;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IP ipv4 = new IP();
		ipv4.a = Integer.parseInt(args[0]);
		ipv4.b = Integer.parseInt(args[1]);
		ipv4.c = Integer.parseInt(args[2]);
		ipv4.d = Integer.parseInt(args[3]);
		System.out.println(ipv4.a + "." + ipv4.b + "." + ipv4.c + "." + ipv4.d);
	}

}
