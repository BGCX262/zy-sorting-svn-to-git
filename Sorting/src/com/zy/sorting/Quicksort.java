package com.zy.sorting;

public class Quicksort {
	private int array[];
	private int arraySize;
	public Quicksort() {
		arraySize = 0;
	}
	public Quicksort(int[] a) {
		array = a;
		arraySize = array.length;
	}
	
	public void printArray() {
		int len = array.length;
		for(int i=0; i<len; i++) {
			System.out.print(array[i]+"\t");
		}
	}
	
}
