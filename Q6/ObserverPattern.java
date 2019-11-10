package Q6;

public class ObserverPattern {

	public static void main(String[] args) {
		WorkManager wm = new WorkManager();
		
		wm.addWorker(new Worker(1));
		wm.addWorker(new Worker(2));
		wm.addWorker(new Worker(3));
		wm.addWorker(new Worker(4));
		
		WorkItem wi1 = new WorkItem(1, "First WorkItem");
		wm.notify(wi1);
		WorkItem wi2 = new WorkItem(3, "Second WorkItem");
		wm.notify(wi2);
		WorkItem wi3 = new WorkItem(5, "Third WorkItem");
		wm.notify(wi3);
	}

}
