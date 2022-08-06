import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter age of a person in between 0 and 100");
		int age = scan.nextInt();

		if (0 <= age && age <= 20) {
			kidCode(age);

		} else if (20 < age && age <= 60) {
			parentCode();
		} else if (60 < age && age <= 100) {
			elderlyCode(age);

		}
		scan.close();

	}

	public static void kidCode(int age) {

		System.out.println("Please enter the kid's name,last name and gender as Female or Male");
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.next();
		String surname = sc1.next();
		String gender = sc1.next();
		String hesCode = hesCodeGenerator();
		Kid kid = new Kid(name, surname, age, hesCode, gender);
		System.out.println(
				kid.name + " " + kid.lastName + " is a " + kid.gender + " Kid and his/her HES Code: " + kid.HESCode);
		sc1.close();
	}

	public static void parentCode() {
		System.out.println("Please tell us how many kids the parent has");
		Scanner sc3 = new Scanner(System.in);
		int numOfKid = sc3.nextInt();
		int son = 0;
		int daughter = 0;
		System.out.println(
				"Please enter name, last name and gender information of the parents for " + numOfKid + " kids");
		Parent parent = new Parent();
		parent.setHESCode(hesCodeGenerator());
		for (int i = 0; i < numOfKid; i++) {
			System.out.println("Ender kid name, last name, age and gender for " + (i + 1) + "th kid");
			Kid kid = new Kid();
			parent.kids[i] = kid;
			parent.kids[i].name = sc3.next();
			parent.kids[i].lastName = sc3.next();
			parent.kids[i].age = sc3.nextInt();
			parent.kids[i].gender = sc3.next();

			String gen = parent.kids[i].gender.toLowerCase();
			if (gen.equals("female"))
				daughter++;
			if (gen.equals("male"))
				son++;
		}
		System.out.println("Parent's has HES code: " + parent.HESCode);
		System.out.println("The parent has " + daughter + " daughters and " + son + " sons");
		sc3.close();
	}

	public static void elderlyCode(int age) {
		System.out.println("Please enter the elderly person's name,last name");
		Scanner sc2 = new Scanner(System.in);
		String name = sc2.next();
		String surname = sc2.next();
		String hesCode = hesCodeGenerator();
		Elderly elderly = new Elderly(name, surname, age, hesCode);
		System.out.println("The person's HES code: " + elderly.HESCode);
		if (60 <= elderly.age && elderly.age < 65) {
			System.out.println("S(he) is NOT old enough to get vaccine");
		} else {
			System.out.println("S(he) is old enough to get vaccine");
		}
		sc2.close();
	}

	public static String hesCodeGenerator() {
		final String Num = "0123456789";
		final String Apht = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		SecureRandom random = new SecureRandom();
		StringBuilder hesCode = new StringBuilder(16);

		hesCode.append(Apht.charAt(random.nextInt(Apht.length())));
		hesCode.append(Num.charAt(random.nextInt(Num.length())));
		hesCode.append(Apht.charAt(random.nextInt(Apht.length())));
		hesCode.append(Num.charAt(random.nextInt(Num.length())));
		hesCode.append(' ');
		hesCode.append('-');
		hesCode.append(' ');
		for (int i = 0; i < 4; i++)
			hesCode.append(Num.charAt(random.nextInt(Num.length())));

		hesCode.append(' ');
		hesCode.append('-');
		hesCode.append(' ');
		for (int i = 0; i < 2; i++)
			hesCode.append(Num.charAt(random.nextInt(Num.length())));

		return hesCode.toString();
	}

}
