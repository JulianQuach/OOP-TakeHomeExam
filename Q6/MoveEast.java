package Q6;

public class MoveEast implements CommandInterface {
	
	@Override
	public void execute() {
		Player.getInstance().moveEast();
		System.out.println("Player move to the East");
		System.out.println("New Coordinates: " + Player.getInstance().xCoord + " " + Player.getInstance().yCoord);
	}

	@Override
	public boolean undo() {
		Player.getInstance().moveWest();
		System.out.println("Player undo moving to the East");
		System.out.println("New Coordinates: " + Player.getInstance().xCoord + " " + Player.getInstance().yCoord);
		return false;
	}

}
