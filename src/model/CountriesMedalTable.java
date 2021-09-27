package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountriesMedalTable {
	
	private List<Country> countries;

	public CountriesMedalTable() {
		countries = new ArrayList<Country>();
	}
	
	public void addCountry(String countryName, int maleGoldMedals, int maleSilverMedals, int maleBronzeMedals,
			int femaleGoldMedals, int femaleSilverMedals, int femaleBronzeMedals) {
		countries.add(new Country(countryName, maleGoldMedals, maleSilverMedals, maleBronzeMedals, femaleGoldMedals,
				femaleSilverMedals, femaleBronzeMedals));
	}
	
	public List<Country> getCountries(){
		return this.countries;
	}
	
	public void sortByCountryName() {
		Collections.sort(countries);
	}
	
	
	public void sortByMaleGoldMedals() {
		int j;
		Country aux;
		for(int i=1; i<countries.size();i++) {
			aux = countries.get(i);
			j = i-1;
			while( (j>=0) && (aux.getMaleGoldMedals() < countries.get(j).getMaleGoldMedals()) ) {
				countries.set(j+1, countries.get(j));
				j--;
			}
			countries.set(j+1, aux);
		}
	}
	
	
}
