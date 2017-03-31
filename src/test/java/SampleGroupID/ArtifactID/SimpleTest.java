package SampleGroupID.ArtifactID;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class SimpleTest extends TestCase{
	
	   public void test() {
	      SampleExample example = new SampleExample();
	      example.addInteger(10);
	      example.addInteger(100);
	      assertEquals(example.getSize(), 2);
	      System.out.println("SimpleTest AppTest");
	   }
}
