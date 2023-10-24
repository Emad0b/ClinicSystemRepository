package finalAssignment_DesingPatterns2;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuFactory MF = new MenuFactory();
		Scanner sc=new Scanner(System.in);
		boolean stop=false;
		String input;
		do {
		Menu menu;
			try {
				System.out.println("enter job description(doctor,nurse,reciptionist) or Exit System(exit):");
                input=sc.next();
				if (input.equals("exit")) {
                    stop = true;
                    break;
                }else {
				menu = MF.getMenu(input);
				menu.menu(sc);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block	
				System.err.println(e.getMessage());
			}
		}while(stop!=true);
		System.err.println("System Existed");

	}

}
