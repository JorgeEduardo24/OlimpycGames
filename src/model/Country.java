package model;

public class Country implements Comparable<Country>{
	
	private String countryName;
	private int maleGoldMedals;
	private int maleSilverMedals;
	private int maleBronzeMedals;
	private int femaleGoldMedals;
	private int femaleSilverMedals;
	private int femaleBronzeMedals;


	public Country(String countryName, int maleGoldMedals, int maleSilverMedals, int maleBronzeMedals,
			int femaleGoldMedals, int femaleSilverMedals, int femaleBronzeMedals) {
		this.countryName = countryName;
		this.maleGoldMedals = maleGoldMedals;
		this.maleSilverMedals = maleSilverMedals;
		this.maleBronzeMedals = maleBronzeMedals;
		this.femaleGoldMedals = femaleGoldMedals;
		this.femaleSilverMedals = femaleSilverMedals;
		this.femaleBronzeMedals = femaleBronzeMedals;

	}


	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getMaleGoldMedals() {
		return maleGoldMedals;
	}

	public void setMaleGoldMedals(int maleGoldMedals) {
		this.maleGoldMedals = maleGoldMedals;
	}

	public int getMaleSilverMedals() {
		return maleSilverMedals;
	}

	public void setMaleSilverMedals(int maleSilverMedals) {
		this.maleSilverMedals = maleSilverMedals;
	}

	public int getMaleBronzeMedals() {
		return maleBronzeMedals;
	}

	public void setMaleBronzeMedals(int maleBronzeMedals) {
		this.maleBronzeMedals = maleBronzeMedals;
	}

	public int getFemaleGoldMedals() {
		return femaleGoldMedals;
	}

	public void setFemaleGoldMedals(int femaleGoldMedals) {
		this.femaleGoldMedals = femaleGoldMedals;
	}

	public int getFemaleSilverMedals() {
		return femaleSilverMedals;
	}

	public void setFemaleSilverMedals(int femaleSilverMedals) {
		this.femaleSilverMedals = femaleSilverMedals;
	}

	public int getFemaleBronzeMedals() {
		return femaleBronzeMedals;
	}

	public void setFemaleBronzeMedals(int femaleBronzeMedals) {
		this.femaleBronzeMedals = femaleBronzeMedals;
	}
	
	@Override
	public int compareTo(Country o) {
		return this.countryName.compareTo(o.getCountryName());
		
	}
	
	@Override
	public String toString() {
		return "Country: "+getCountryName()+"\n"+
				getMaleGoldMedals()+";"+ getMaleSilverMedals()+";"+getMaleBronzeMedals()+";"+getFemaleGoldMedals()+";"+getFemaleSilverMedals()+";"+getFemaleBronzeMedals();
	}
	
}
