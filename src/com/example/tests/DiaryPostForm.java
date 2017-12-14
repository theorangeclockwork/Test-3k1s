package com.example.tests;

public class DiaryPostForm {
	
	public String name;	
	public String proteins;
	public String fat;
	public String carbohydrates;
	public String kkal;
    public String weight;
    
	public DiaryPostForm(String name, String proteins, String fat, String carbohydrates, String kkal, String weight) {
		super();
		this.name = name;
		this.proteins = proteins;
		this.fat = fat;
		this.carbohydrates = carbohydrates;
		this.kkal = kkal;
		this.weight = weight;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProteins() {
		return proteins;
	}
	public void setProteins(String proteins) {
		this.proteins = proteins;
	}
	public String getFat() {
		return fat;
	}
	public void setFat(String fat) {
		this.fat = fat;
	}
	public String getCarbohydrates() {
		return carbohydrates;
	}
	public void setCarbohydrates(String carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	public String getKkal() {
		return kkal;
	}
	public void setKkal(String kkal) {
		this.kkal = kkal;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

	

}
