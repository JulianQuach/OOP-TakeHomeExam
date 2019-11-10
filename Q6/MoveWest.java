package Q6;

public class MoveWest implements CommandInterface {

	@Override
	public void execute() {
		Player.getInstance().moveWest();
		System.out.println("Player move to the West");
		System.out.println("New Coordinates: " + Player.getInstance().xCoord + " " + Player.getInstance().yCoord);
	}

	@Override
	public boolean undo() {
		Player.getInstance().moveEast();
		System.out.println("Player undo moving to the West");
		System.out.println("New Coordinates: " + Player.getInstance().xCoord + " " + Player.getInstance().yCoord);
		return false;
	}

}
