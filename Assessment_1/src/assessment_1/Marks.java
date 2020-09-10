package assessment_1;

import java.util.*;

public class Marks {

	private int roll_no;
	private int marks;

	public Marks(int roll_no, int marks) {
		this.roll_no = roll_no;
		this.marks = marks;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Marks> list = new ArrayList<Marks>();
		for (int i = 0; i < 5; i++) {
			int roll_no = scan.nextInt();
			int marks = scan.nextInt();
			list.add(new Marks(roll_no, marks));
		}
		
		for (Marks m : list)
			System.out.println(m.roll_no + " " + m.marks);

	}
}
