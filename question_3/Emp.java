package question_3;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Emp {
	String name;
	int salary;

	public Emp(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

enum SortMethod {
	BYNAME, BYSALARY;
}

class EmployeeInfo {
	public List<Emp> Sort(List<Emp> emps, final SortMethod l) {
		if (l.equals(SortMethod.BYNAME)) {
			Comparator<Emp> employeeNameComparator = Comparator.comparing(Emp::getName, (s1, s2) -> {
				return s1.compareTo(s2);
			});
			Collections.sort(emps, employeeNameComparator);
		} else {
			Comparator<Emp> employeeSalComparator = Comparator.comparing(Emp::getSalary, (s1, s2) -> {
				return s1.compareTo(s2);
			});

			Collections.sort(emps, employeeSalComparator);
		}

		return emps;
	}

	public boolean isCharacterPresentInAllNames(Collection<Emp> entities, String character) {
		return entities.stream().filter(emp -> emp.getName().startsWith(character)).collect(Collectors.toList())
				.size() > 0;
	}
}

class Byname implements Comparator<Emp> {
	public int compare(Emp e1, Emp e2) {
		return e1.getName().compareTo(e2.getName());
	}
}

class Bysalary implements Comparator<Emp> {
	public int compare(Emp e1, Emp e2) {
		if (e1.getSalary() < e2.getSalary())
			return -1;
		if (e1.getSalary() > e2.getSalary())
			return 1;
		else
			return 0;
	}
}
