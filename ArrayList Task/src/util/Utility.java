package util;
import java.util.List;
import custom.CustomException;
	public class Utility{
	      public static void nullChecker(Object obj) throws CustomException
	     {
	     if(obj==null ){
	     throw new CustomException("Input is null.Provide some values to th input");
	     }
	     }
	     
	       public static void indexChecker(int index,int length)  throws CustomException
	     {
	     if (index < 0 || length<= index) 
	    	    {
	    	     
	    		throw new  CustomException("The index is either negative number or index is greater than length of the input.Give correct index");
	    	    }
	     }
	      
	    	public static <E> int findSize(List<E> input ) throws CustomException{
	     		nullChecker(input);
	       		return input.size();
	       		}
	     }
	     
	     
	       
