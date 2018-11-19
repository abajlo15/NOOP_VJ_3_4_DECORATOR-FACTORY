package Zadatak1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		String ui;
		Application app;
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite DARK za dark temu ili SDAR za solar dark themu ili LVD za light visual temu: \n");
		ui = sc.nextLine();

		if (ui.equals("DARK")) {
			app = new Application(new DarkThemeFactory());
			
		} else if (ui.equals("SDAR")) {
			app = new Application(new SolarizedDarkThemeFactory());
		
		}else if (ui.equals("LVD")) {
			app = new Application(new LightVisualThemeFactory());
		
		}

	}

}
