package inherittest;
import inherit.BirdAbstract;
import inherit.ParrotMod;
import inherit.Duck;
import inherit.Car;
import inherit.Swift;
import inherit.Scross;
import inherit.Xuv;
import java.util.Scanner;
public class InheritTestRunner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Car car=new Car();
		 Scross scross=new Scross();
		
		 Swift swift=new Swift();
		 Xuv xuv=new Xuv();
	   	int choice;
	    do {
	    	 System.out.println("The entered number should be between 1 to 6");
	         System.out.println("Enter the problem to be shown:");
	         choice = sc.nextInt();
	         sc.nextLine();
	        
	        
	 switch (choice) {
	 case 1:
		System.out.println("Enter number of seats:");
		int seats=sc.nextInt();
		System.out.println("Enter number of airbags:");
        int airBags=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter model of car:");
		String model=sc.nextLine();
		System.out.println("Enter color of car:");
		String color=sc.nextLine();
		swift.setSeats(seats,airBags,model,color);
		//swift.setAirbags(airBags);
		//swift.setModel(model);
		//swift.setColor(color);
		System.out.println("The number of seats in swift car is :"+swift.getSeats());
		System.out.println("The number of airbags in swift car is :"+swift.getAirbags());
		System.out.println("The model of swift is :"+swift.getModel());
		System.out.println("The color of swift is:"+swift.getColor());
		break;
	 case 2:
		 System.out.println("Enter number of seats:");
		 int seat=sc.nextInt();
	     System.out.println("Enter number of airbags:");
	     int airBag=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter model of car:");
		 String models=sc.nextLine();
		 System.out.println("Enter color of car:");
		 String colors=sc.nextLine();
		 System.out.println("Enter the year of make :");
		 int yearOfMake=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter the engine number :");
		 String engineNumber=sc.nextLine();
		 System.out.println("Enter the type of car like sedan,Hatchbag,Suv:");
		 String type=sc.nextLine();
		 scross.setSeats(seat);
		 scross.setAirbags(airBag);
		 scross.setColor(colors);
		 scross.setModel(models);
		 scross.setYearOfMake(yearOfMake);
		 scross.setEngineNumber(engineNumber);
		 scross.setType(type);
	     System.out.println("The number of seats in scross car is :"+scross.getSeats());
		 System.out.println("The number of airbags in scross car is :"+scross.getAirbags());
		 System.out.println("The model of scross is :"+scross.getModel());
		 System.out.println("The color of scross is:"+scross.getColor());
		 System.out.println("Year of make for scross:"+scross.getYearOfMake());
		 System.out.println("Engine number for scross is:"+scross.getEngineNumber());
		 System.out.println("Type of scross is :"+scross.getType());
		 break;
	 case 3 :
		 displayCarInfo(swift);
		 displayCarInfo(scross);
		 displayCarInfo(xuv);
		 break;
	 case 4:
		 Car swiftObj=new Swift();
		 displaySwiftInfo(swift);
		 //displaySwiftInfo(swiftObj);
		 displaySwiftInfo((Swift) swiftObj);// casting
		// displaySwiftInfo(scross); compilation error,because it acceps the swift objcet only
		 
		 break;
	 case 5:
		
		 Car ScrossObj=new Scross();
		 scross.maintenance();
		 ScrossObj.maintenance();
		 car.maintenance();
		 swift.maintenance();
	 case 6:
		 Xuv xuv1=new Xuv();
		// Xuv myxuv=new Xuv("string"); Give compilation error because there is no constructor with argument present in xuv
		break; 
	 case 7:
		// BirdAbstract bird=new BirdAbstract();we cannot instantiate abstract class
		ParrotMod parrot=new ParrotMod(); 
		parrot.fly();
		parrot.speak();
		break;
	 case 8:
		 Duck duck=new Duck();
		 duck.fly();
		 duck.speak();
		 
	}
}while (choice<=10 || choice>=1);
	    sc.close();
	}

	public static void displayCarInfo(Car car) {
		System.out.println("This is display car info method");
		System.out.println("Engine number is "+car.getEngineNumber());
		System.out.println("Year of make is"+car.getYearOfMake());
		System.out.println("Type is:"+car.getType());
		 if(car instanceof Swift) {
			 System.out.println("Hatch");
		 }
			 else if(car instanceof Xuv) {
				 System.out.println("SUV");
		 }
			 else if(car instanceof Scross) {
				 System.out.println("Sedan");
			 }
		 
	}
	public static void displaySwiftInfo(Swift swift) {
		System.out.println("This is display swift info method");
		System.out.println(swift.getAirbags());
		//System.out.println(swiftObj.getAirbags());
		//System.out.println(scross.getAirbags());
		
	}
		
	}
