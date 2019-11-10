package Q6;

public class MoveSouth implements CommandInterface{

	@Override
	public void execute() {
		Player.getInstance().moveSouth();
		System.out.println("Player move to the South");
		System.out.println("New Coordinates: " + Player.getInstance().xCoord + " " + Player.getInstance().yCoord);
	}

	@Override
	public boolean undo() {
		Player.getInstance().moveNorth();
		System.out.println("Player undo moving to the South");
		System.out.println("New Coordinates: " + Player.getInstance().xCoord + " " + Player.getInstance().yCoord);
		return false;
	}

}
