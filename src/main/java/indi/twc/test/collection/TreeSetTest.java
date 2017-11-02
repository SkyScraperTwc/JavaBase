package indi.twc.test.collection;

import lombok.*;

import java.util.TreeSet;

/**
 * 有序Set
 */
public class TreeSetTest{

	public static void main(String args[]){
		TreeSet<AA> treeSet = new TreeSet<AA>();
		AA a1 = new AA(1);
		AA a2 = new AA(2);
		AA a3 = new AA(3);
		AA a4 = new AA(4);

		treeSet.add(a1);
		treeSet.add(a2);
		treeSet.add(a3);
		treeSet.add(a4);

		System.out.println(treeSet);
		for (AA obj : treeSet) {
			System.out.println(obj.getNum());
		}
	}
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class AA implements Comparable<AA> {

	private int num;

	@Override
	public int compareTo(AA o) {
		AA aa = o;
		if (this.num < aa.getNum()) {
			return -1;
		} else {
			return 1;
		}
	}
}