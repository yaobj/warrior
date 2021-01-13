package warrior.oom;

import java.util.ArrayList;
import java.util.List;

public class GCOverheadErrorDemo {

	public static void main(String[] args) throws Exception {

		int i= 0;
		List<String> list = new ArrayList<String >();
		try {
			while(true) {
				list.add(String.valueOf(i++).intern());
			}
		} catch (Exception e) {
			System.out.println(String.valueOf(i));
			e.printStackTrace();
			throw e;
		}
	}

}

