package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.CountriesMedalTable;

public class Menu {
	CountriesMedalTable countriesMedalTable;
	public Menu() {
		countriesMedalTable = new CountriesMedalTable();
	}
	
	public void showMenu() {
		System.out.println("\nEnter the option that you want to do: ");
		System.out.println("[1] Add a new country and their medals\n"+
		                   "[2] Show list of medals for each country\n"+
		                   "[3] Exit app\n");
	}
	
	public int readOption(BufferedReader br) throws NumberFormatException, IOException {
		int option = Integer.parseInt(br.readLine());
		return option;
	}
	
	public void doOption(int option, BufferedReader br) throws IOException {
		switch (option) {
		case 1:
			System.out.println("--------------------------------------------------");
			System.out.println("                    ADD DATA");
			System.out.println("--------------------------------------------------");
			readData(br);
			break;

		case 2:
			System.out.println("***************************************************************************");
			System.out.println("                  Olympic Games Tokyo 2020 medal table");
			System.out.println("***************                                           *****************");
			System.out.println("**********                                                      ***********");
			System.out.println("*****                                                                 *****");
			showData();
			break;
			
		case 3:
			System.out.println("See you in Paris 2024! ;)");
			break;

		default:
			System.out.println("Wrong choice. Try again.");
			break;
		}
	}
	
	public void startProgram() throws IOException{
		int exit = 3;
		int option = 0;
		do {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			showMenu();
			option = readOption(br);
			doOption(option, br);
		}while(option != exit);
	}
	
	
	public void readData(BufferedReader br) throws IOException {
		System.out.println("Write the name of the country and the medals that the country obtained in the male and female category successively.\n.This information is separated by a semicolon (;). For example::");
		System.out.println("Colombia;17;8;19;5;26;31\n");
		String data = br.readLine();
		if (data != null) {
			String[] parts = data.split(";");
			String countryName = parts[0];
			int maleGoldMedals = Integer.parseInt(parts[1]);
			int maleSilverMedals = Integer.parseInt(parts[2]);
			int maleBronzeMedals = Integer.parseInt(parts[3]);
			int femaleGoldMedals = Integer.parseInt(parts[4]);
			int femaleSilverMedals = Integer.parseInt(parts[5]);
			int femaleBronzeMedals = Integer.parseInt(parts[6]);
			
			countriesMedalTable.addCountry(countryName, maleGoldMedals, maleSilverMedals, maleBronzeMedals,
					femaleGoldMedals, femaleSilverMedals, femaleBronzeMedals);
			countriesMedalTable.sortByCountryName();
			System.out.println("Data added successfully!");
		}
	}
	
	public void showData() {
		for(int i=0; i<countriesMedalTable.getCountries().size();i++) {
			System.out.println(countriesMedalTable.getCountries().get(i).toString());
		}
	}
	
}
