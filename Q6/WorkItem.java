package Q6;

public class WorkItem {
	long ItemID;
	String Message;
	
	public WorkItem(long ItemID, String Message) {
		this.ItemID = ItemID;
		this.Message = Message;
	}

	public long getItemID() {
		return ItemID;
	}

	public String getMessage() {
		return Message;
	}
}
