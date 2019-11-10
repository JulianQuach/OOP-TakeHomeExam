package Q6;

import java.util.Random;

public class CommanPattern {

	public static void main(String[] args) {
		Player p = Player.getInstance();
		CommandInvoker ci = new CommandInvoker();
		Random rGenerator = new Random();
		System.out.println("Start moving");
		System.out.println("New Coordinates: " + p.xCoord + " " + p.yCoord);
		for (int i = 0; i < 50; i++) {
			int number = rGenerator.nextInt(5);
			if (number == 1) {
				ci.addMove(new MoveNorth());
			}
			if (number == 2) {
				ci.addMove(new MoveEast());
			}
			if (number == 3) {
				ci.addMove(new MoveSouth());
			}
			if (number == 4) {
				ci.addMove(new MoveWest());
			}
		}
		ci.execute();
		System.out.println("\n\n\nStart Undoing");
		ci.undo();
		System.out.println("\n\n\nPlayer's Coordinates: " + p.xCoord + " " + p.yCoord);
	}

}
