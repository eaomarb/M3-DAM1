//Programa que llegeixi el nom i el sou de 20 empleats/des i mostri el nom i el sou
// de l'empleat/da que més guanya.
public class A8_6 {
	public static void main(String[] args) {
		String empleats[] = { "Anna", "Joan", "Pere", "Sandra", "Montserrat", "Omar", "Rosa" };
		double sous[] = { 1300, 1500, 1000, 2110.5, 1956.85, 3200.5, 1050 };

		double souMaxim = 0;
		String empleat = "";

		for (int i = 0; i < empleats.length; i++) {
			if (sous[i] > souMaxim) {
				souMaxim = sous[i];
				empleat = empleats[i];

			}

		}
		System.out.println(empleat + souMaxim);
	}
}
