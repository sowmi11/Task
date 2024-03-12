package inherit;


public class Car {
	private int yearOfMake;
	private String engineNumber;
	private String type;
public Car() {
	
}
public Car(String str)	{
	System.out.println("Incoming string is:"+str);
}

 public int getYearOfMake() {
     return yearOfMake;
 }

 public void setYearOfMake(int year) {
   yearOfMake =  year;
 }

 public String getEngineNumber() {
     return engineNumber;
 }

 public void setEngineNumber(String engineNo) {
   engineNumber=  engineNo ;
 }

 public String getType() {
     return type;
 }

 public void setType(String carType) {
    type = carType;
 }
 public void maintenance() {
	 System.out.println("Car under maintenanance");
 }
 
}

