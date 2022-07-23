package Object_Oriented_Practice;
import java.util.*;


class Result{
	int rollNo;
	int marks;
	
	Result(int rollNo, int marks){
		this.rollNo = rollNo;
		this.marks = marks;
	}
}

class CompareResult implements Comparator<Result>{
	@Override
	public int compare(Result o1, Result o2) {
		if(o1.marks > o2.marks) {
			return -1;
		}
		
		return 1;
	}
}

public class Class_07_comparator_learning {
	public static void main(String[] args) {
		ArrayList<Result> arr = new ArrayList<>();
		arr.add(new Result(1, 98));
		arr.add(new Result(3, 87));
		arr.add(new Result(4,81));
		arr.add(new Result(5, 100));
		
		Comparator<Result> compare = new CompareResult();
		Collections.sort(arr, compare);
		
		for(Result obj: arr) {
			System.out.println(obj.rollNo + " " + obj.marks);
		}
		
	}
}
