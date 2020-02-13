package Clase19;

public class prueba {
	
	public static void main (String  [] args) {
		
		int opcion = 1;
		int opcion2=3;
		switch (opcion) {
		case 1:
			System.out.println("s1-c1");
			switch (opcion2) {
			
			case 1:
				System.out.println("s2-c1");
				break;
			case 2:
				System.out.println("s2-c2");
				break;
			case 3:
				System.out.println("s2-c3");
				break;

			default:
				break;
			}
			break;
		case 2:
			System.out.println("s1-c2");
			
			break;
			case 3:
				System.out.println("s1-c3");
			
			break;
			case 4:
				System.out.println("s1-c4");
				break;
			

		default:
			break;
		}
	}
}
