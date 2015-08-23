package com.zy.sorting;

public class SortMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortArray sort = new SortArray(20);
		sort.initData();
		sort.printData();
		System.out.println();
		sort.dataRandomize();
		sort.printData();
		sort.setSortAlg(new MergeSort());
		sort.performSort();
		System.out.println();
		sort.printData();
	}
}
