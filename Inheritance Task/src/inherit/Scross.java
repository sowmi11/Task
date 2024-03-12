package inherit;

public class Scross extends Car{
	private int seats;
	 private int airbags;
	 private String model;
	 private String color;

	 public int getSeats() {
	     return seats;
	 }

	 public void setSeats(int noOfSeats) {
		seats =noOfSeats;
	 }

	 public int getAirbags() {
	     return airbags;
	 }

	 public void setAirbags(int noOfAirbags) {
		airbags= noOfAirbags;
	 }

	 public String getModel() {
	     return model;
	 }

	 public void setModel(String modelName) {
		model= modelName;
	 }

	 public String getColor() {
	     return color;
	 }

	 public void setColor(String carColor) {
		color= carColor ;
	 }
	 public void maintenance() {
		 System.out.println("Maruthi scross under maintenance");
	 }

}
