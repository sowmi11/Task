import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;



class NullTestUnit {

	@Test
	void test()  {
		task obj=new task();
	assertEquals(6,obj.add(2,2));
	}
	
	@Test
	void test1()  {
		task obj=new task();
	assertEquals(2,obj.divide(2,2));
}
	@Test
	void test3()  {
		task obj=new task();
	assertEquals(1,obj.divide(2,2));
}
	
}
