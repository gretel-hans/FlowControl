package FlowControls;

import java.util.Scanner;

public class MainProject {

	public static void main(String[] args) {

		if (stringaPariDispari("Ciaoo")) {
			System.out.println("La stringa inserita è Pari!");
		} else {
			System.out.println("La stringa inserita è Dispari!");
		}
		;

		System.out.println("------------");

		if (annoBisestile(2024)) {
			System.out.println("L'anno inserito è Bisestile!");
		} else {
			System.out.println("L'anno inserito non è Bisestile!");
		}
		;

		System.out.println("------------");

		stampaNumero();

		System.out.println("------------");

		contoRovescio();

		System.out.println("------------");

		dividiStringa();

	}

	public static boolean stringaPariDispari(String stringa) {
		if (stringa.length() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean annoBisestile(int anno) {
		if (anno % 4 == 0) {
			return true;
		} else if (anno % 100 == 0 && anno % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void stampaNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci un numero tra 0 e 3: ");
		int numero = sc.nextInt();
		switch (numero) {
			case 0:
				System.out.println("Hai inserito il n. ZERO");
				break;
			case 1:
				System.out.println("Hai inserito il n. UNO");
				break;
			case 2:
				System.out.println("Hai inserito il n. DUE");
				break;
			case 3:
				System.out.println("Hai inserito il n. TRE");
				break;
			default:
				System.out.println("ERRORE hai inserito un numero Errato");

		}
	}

	public static void contoRovescio() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci un numero ");
		int n = sc.nextInt();
		for (int i = n; i >= 0; i--) {
			System.out.println(i);
		}
	}

	public static void dividiStringa() {
		boolean trovato=false;
		String parolaComplessiva="";
		do {
			Scanner sc= new Scanner(System.in);
			System.out.print("Inserisci una parola: ");
			String parola=sc.nextLine();
			for(int i=0;i<parola.length();i++){
				if(parola.charAt(i)=='q'){
					//parolaComplessiva+=parola.charAt(i);
					
				}else{
					parolaComplessiva+=parola.charAt(i) + " - ";
				}
				if (parola.charAt(i)=='q'){
					System.out.println("Parola complessiva: "+ parolaComplessiva);
					 trovato=true;
					break;
				}
			}
		}while(!trovato);
	}
}
