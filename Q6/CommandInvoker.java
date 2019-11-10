package Q6;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
	private List<CommandInterface> ciList = new ArrayList<CommandInterface>();

	public void addMove(CommandInterface ci) {
		ciList.add(ci);
	}

	public void execute() {
		for (CommandInterface ci : ciList) {
			ci.execute();
		}
	}

	public void undo() {
		for (int i = ciList.size() - 1; i >= 0; i--) {
			ciList.get(i).undo();
		}
	}
}
