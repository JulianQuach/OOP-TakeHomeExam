package Q6;

public class Worker {
	long WorkerID;

	public Worker(long WorkerID) {
		this.WorkerID = WorkerID;
	}
	
	public long getWorkerID() {
		return WorkerID;
	}

	public WorkItem notify(WorkItem wi) {
		if (wi.getItemID() != this.WorkerID) {
			return null;
		} else {
			System.out.println(
					"Worker " + WorkerID + " processed WorkItem " + wi.getItemID() + " message: " + wi.getMessage());
			return wi;
		}
	}
}
