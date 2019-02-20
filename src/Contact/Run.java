package Contact;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Run {

	static Repertory d= new Repertory();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continu = false;
		
		System.out.println("Créer une personne :");
				
		do {
			System.out.println("Saisissez un prénom");
			String firstN = sc.nextLine();
		
			System.out.println("Saisissez un nom");
			String lastN = sc.nextLine();
	
			System.out.println("Saisissez un email");
			String mail = sc.nextLine();
	
			System.out.println("Saisissez une date de naissance");
			String birthD = sc.nextLine();
			LocalDate.parse(birthD, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			Person p = new Person (firstN, lastN, mail, birthD);
			d.Contact(p);
					
			System.out.println("Voulez-vous recommencé (oui/non) ?");
			String repUser = sc.nextLine();
			
			if (repUser.equalsIgnoreCase("oui")) {
				continu = true;
			}else if (repUser.equalsIgnoreCase("non")){
				continu = false;
			}
		} while (continu);
			sc.close();
			d.PersoList();
		}
	}