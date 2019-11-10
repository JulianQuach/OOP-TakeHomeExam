package Q6;

public class Player {
	int xCoord = 0;
	int yCoord = 0;
	
	private static Player instance = new Player();
	
	public static Player getInstance() {
		return instance;
	}

	public void moveEast() {
		xCoord += 1;
	}

	public void moveNorth() {
		yCoord += 1;
	}

	public void moveWest() {
		xCoord -= 1;
	}

	public void moveSouth() {
		yCoord -= 1;
	}
}
