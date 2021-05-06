package question_3;

import java.util.ArrayList;
import java.util.List;

public class Mainrunner {
	public static void main(String[] args) {
		List<Emp> e = new ArrayList<Emp>();
		Emp e1 = new Emp("Harsh", 5000);
		e.add(e1);
		Emp e2 = new Emp("Xyz", 2000);
		e.add(e2);
		Emp e3 = new Emp("Abc", 4000);
		e.add(e3);
		Emp e4 = new Emp("Abc", 6000);
		e.add(e4);
		SortMethod f = SortMethod.BYNAME;
		EmployeeInfo ei = new EmployeeInfo();
		ei.Sort(e, SortMethod.BYSALARY);
		if (ei.isCharacterPresentInAllNames(e, "F")) {
			System.out.println("Yup");
		}
		for (Emp employee : e)
			System.out.println(employee.getSalary() + " " + employee.getName() + " ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		ei.Sort(e, SortMethod.BYNAME);

		for (Emp employee : e)
			System.out.println(employee.getSalary() + " " + employee.getName() + " ");
	}
}
