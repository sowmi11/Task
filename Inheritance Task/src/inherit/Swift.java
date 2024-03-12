package inherit;

public class Swift extends Car {
	 private int seats;
	 private int airbags;
	 private String model;
	 private String color;


	 public int getSeats() {
	     return seats;
	 }

	 public void setSeats(int noOfSeats,int noOfAirbags,String modelName,String carColor) {
		seats =noOfSeats;
		airbags= noOfAirbags;
		model= modelName;
		color= carColor ;
	 }

	 public int getAirbags() {
	     return airbags;
	 }

	/* public void setAirbags(int noOfAirbags) {
		airbags= noOfAirbags;
	 }*/

	 public String getModel() {
	     return model;
	 }

	/* public void setModel(String modelName) {
		model= modelName;
	 }*/

	 public String getColor() {
	     return color;
	 }

	/* public void setColor(String carColor) {
		color= carColor ;
	 }*/

}
