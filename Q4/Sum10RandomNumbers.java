package Q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sum10RandomNumbers {

	int total = 0;
	List<Integer> list;
	Random rGenerator;

	public int getTotal() {
		return total;
	}

	public void generateAllNumber() {
		rGenerator = new Random();
		for (int i = 0; i < 10; i++) {
			int number = rGenerator.nextInt(100);
			addNumberToList(number);
			total += number;
		}
	}

	public void addNumberToList(int i) {
		if (list == null) {
			list = new ArrayList<Integer>();
		}
		list.add(i);
	}
	
	public String toString() {
		String ret = "Generated numbers: ";
		for (int i = 0; i < list.size(); i++) {
			ret += list.get(i) + " ";
		}
		ret += "\nTotal: " + total;
		return ret;
	}

	public static void main(String[] args) {
		Sum10RandomNumbers sum = new Sum10RandomNumbers();
		sum.generateAllNumber();
		System.out.println(sum.toString());
	}

}