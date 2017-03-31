package SampleGroupID.ArtifactID;

import java.util.ArrayList;
import java.util.List;

public class SampleExample {
	private List<Integer> integers = null;

	   public SampleExample() {
	      integers = new ArrayList<Integer> ();
	   }

	   public void addInteger(int num) {
	      integers.add(num);
	   }

	   public int getSize() {
	      return integers.size();
	   }
}
