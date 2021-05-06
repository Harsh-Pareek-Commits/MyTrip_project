package question_4;

import java.util.ArrayList;
import java.util.List;

public class ArraylistMethods {
	public List<Integer> makeArrayList(int n) {
		List<Integer> mylist = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			mylist.add(i, 0);
		}
		return mylist;
	}

	public List<Integer> reverseListArray(List<Integer> l) {
		int j = l.size() - 1;
		int i = 0;
		while (i < j) {

			int temp = l.get(i);
			int temp2 = l.get(j);
			l.remove(i);
			l.add(i,temp2);
			l.remove(j);
			l.add(j, temp);
			j--;
			i++;

		}
		return l;
	}

	public List<Integer> changeList(List<Integer> l, int m, int n) {
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) == m) {
				l.remove(i);
				l.add(i, n);
			}
		}
		return l;
	}

}
