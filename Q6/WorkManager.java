package Q6;

import java.util.ArrayList;
import java.util.List;

public class WorkManager {

	List<Worker> workers = new ArrayList<Worker>();
	List<WorkItem> workItems = new ArrayList<WorkItem>();

	public void addWorker(Worker w) {
		workers.add(w);
	}

	public void addWorkItem(WorkItem wi) {
		workItems.add(wi);
	}

	public void notify(WorkItem wi) {
		while (wi.getItemID() <= 4) {
			for (Worker w : workers) {
				WorkItem result = w.notify(wi);
				if (result != null) {
					System.out.println(w.getWorkerID() + ": Completed work on " + wi.ItemID);
					wi.ItemID += 1;
				}
			}
		}
	}
}
