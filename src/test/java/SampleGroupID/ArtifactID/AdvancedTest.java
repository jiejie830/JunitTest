package SampleGroupID.ArtifactID;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AdvancedTest extends TestCase{
	
	   public void test() {
	      SampleExample ex1 = new SampleExample();
	      ex1.addInteger(100);
	      ex1.addInteger(100);

	      SampleExample ex2 = new SampleExample();

	      ex2.addInteger(100);
	      ex2.addInteger(1000);

	      assertEquals(ex1.getSize(), ex2.getSize());
	      System.out.println("AdvancedTest AppTest");
	   }
}
