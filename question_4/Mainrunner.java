package question_4;

import java.util.ArrayList;
import java.util.List;

public class Mainrunner {
	public static void main(String[] args) {
		ArraylistMethods obj = new ArraylistMethods();
		List<Integer> nlist = obj.makeArrayList(5);
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(10);
		numbers.add(1);
		numbers.add(6);
		numbers.add(10);
		System.out.println("Actual:");
		for (int j = 0; j < numbers.size(); j++) {
			System.out.print(numbers.get(j)+" ");
		}
		List<Integer> revlist = obj.reverseListArray(numbers);
		System.out.println("\nREVERSE:");
		for (int j = 0; j < revlist.size(); j++) {
			System.out.print(revlist.get(j)+" ");
		}
         
		System.out.println("\nREPLACE: ");
		for (int num : obj.changeList(numbers, 10, 8)) {
			System.out.print(num+" ");
		}
	}
}
