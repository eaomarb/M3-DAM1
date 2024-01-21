//11. Escriu un programa que demani dia, mes i any, i digui si la data és correcta. 
//S'ha de tenir en compte els dies de cada mes i si l'any és de traspàs.

import java.util.*;

public class A2_11 {
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);

		System.out.println("Dia: ");
		int dia = teclat.nextInt();

		System.out.println("Mes: ");
		int mes = teclat.nextInt();

		System.out.println("Any: ");
		int any = teclat.nextInt();

		if (mes == 1) { // Gener
			if (dia <= 31) {
				if (dia >= 1) {
					if (any > 0) {
						System.out.println("La data és correcta.");
					}
				}
			} else {
				System.out.println("La data no és correcta.");
			}
		}
		if (mes == 2) { // Febrer
			if (any % 4 == 0) {
				if (any % 100 != 0) {
					if (any % 400 == 0) {
						if (dia <= 29) {
							if (dia >= 1) {
								if (any > 0) {
									System.out.println("La data és correcta.");
								}
							}
						}
					}
				}
			} else if (dia <= 28) {
				if (any < 0) {
					if (dia >= 1) {
						System.out.println("La data és correcta.");
					}
				}
			} else {
				System.out.println("La data no és correcta.");
			}
		}

		if (mes == 3) { // Març
			if (dia <= 31) {
				if (dia >= 1) {
					if (any > 0) {
						System.out.println("La data és correcta.");
					}
				}
			} else {
				System.out.println("La data no és correcta.");
			}
		}

		if (mes == 4) { // Abril
			if (dia <= 30) {
				if (dia >= 1) {
					if (any > 0) {
						System.out.println("La data és correcta.");
					}
				}
			} else {
				System.out.println("La data no és correcta.");
			}
		}

		if (mes == 5) { // Maig
			if (dia <= 31) {
				if (dia >= 1) {
					if (any > 0) {
						System.out.println("La data és correcta.");
					}
				}
			} else {
				System.out.println("La data no és correcta.");
			}
		}

		if (mes == 6) { // Juny
			if (dia <= 30) {
				if (dia >= 1) {
					if (any > 0) {
						System.out.println("La data és correcta.");
					}
				}
			} else {
				System.out.println("La data no és correcta.");
			}
		}

		if (mes == 7) { // Juliol
			if (dia <= 31) {
				if (dia >= 1) {
					if (any > 0) {
						System.out.println("La data és correcta.");
					}
				}
			} else {
				System.out.println("La data no és correcta.");
			}
		}

		if (mes == 8) { // Agost
			if (dia <= 31) {
				if (dia >= 1) {
					if (any > 0) {
						System.out.println("La data és correcta.");
					}
				}
			} else {
				System.out.println("La data no és correcta.");
			}
		}

		if (mes == 9) { // Setembre
			if (dia <= 30) {
				if (dia >= 1) {
					if (any > 0) {
						System.out.println("La data és correcta.");
					}
				}
			} else {
				System.out.println("La data no és correcta.");
			}
		}

		if (mes == 10) { // Octubre
			if (dia <= 31) {
				if (dia >= 1) {
					if (any > 0) {
						System.out.println("La data és correcta.");
					}
				}
			} else {
				System.out.println("La data no és correcta.");
			}
		}

		if (mes == 11) { // Novembre
			if (dia <= 30) {
				if (dia >= 1) {
					if (any > 0) {
						System.out.println("La data és correcta.");
					}
				}
			} else {
				System.out.println("La data no és correcta.");
			}
		}

		if (mes == 12) { // Desembre
			if (dia <= 31) {
				if (dia >= 1) {
					if (any > 0) {
						System.out.println("La data és correcta.");
					}
				}
			} else {
				System.out.println("La data no és correcta.");
			}
		}
	}
}
