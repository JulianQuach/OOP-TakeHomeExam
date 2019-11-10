package Q5;

import java.util.ArrayList;
import java.util.List;

public class ExamQ3Interface {

	public static void main(String[] args) {
		List<SpaceShip> sps = new ArrayList<SpaceShip>();
		sps.add(new StarWarsShips());
		sps.add(new StarTrekShips());
		sps.add(new OtherSciFiSpaceShips());
		for (SpaceShip sp : sps) {
			System.out.println(sp.getTonnage());
			System.out.println(sp.getName());
			System.out.println(sp.getFranchise());
		}
	}

}
