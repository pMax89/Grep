package max.grep;

import java.util.Scanner;

public class Main {
	private static String s;
	
	// точка входа в программу
	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		// начинаем перебор по строчкам
		while (c.hasNext()) {
			s = c.nextLine();
			for (String string : args) 
				if (string.compareToIgnoreCase(s) == 0) {
					System.out.println(string);					
			}
		}
		c.close();
	}
	
	
}
