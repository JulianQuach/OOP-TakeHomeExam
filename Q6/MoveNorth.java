package Q6;

public class MoveNorth implements CommandInterface{
	
	@Override
	public void execute() {
		Player.getInstance().moveNorth();
		System.out.println("Player move to the North");
		System.out.println("New Coordinates: " + Player.getInstance().xCoord + " " + Player.getInstance().yCoord);
	}

	@Override
	public boolean undo() {
		Player.getInstance().moveSouth();
		System.out.println("Player undo moving to the North");
		System.out.println("New Coordinates: " + Player.getInstance().xCoord + " " + Player.getInstance().yCoord);
		return false;
	}

}
