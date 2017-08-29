package pkgch1;

import java.util.Scanner;

public class Qs1_4 {  
	

	public void printRet() {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		if (!input.isEmpty()) {
			System.out.println(input);

			input = input.replaceAll(" ", "%20");

			System.out.println("1: " + input);

		} else {
			System.out.println("No string.");
		}

	}
}
