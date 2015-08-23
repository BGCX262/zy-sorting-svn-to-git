package com.zy.sorting;

public class SortArray {
	private int[] data;
	private int length;
	private RandomHelper random;
	private SortAlgorithm sortAlg;
	
	public SortArray(int length) {
		this.length = length;
		data = new int[length];
	}
	
	public SortArray(int length, SortAlgorithm sortAlg) {
		this.length = length;
		this.sortAlg = sortAlg;
	}
	
	public void initData() {
		for(int i=0; i<length; i++) {
			data[i] = i+1;
		}
	}
	
	public void dataRandomize() {
		random.RandomizeArray(data);
	}
	
	public void setSortAlg(SortAlgorithm sortAlg) {
		this.sortAlg = sortAlg;
	}
	
	public void performSort() {
		sortAlg.sort(data);
	}
	
	public int getLength() {
		return length;
	}
	
	public void printData() {
		for(int i=0; i<length; i++) {
			System.out.print(data[i]+"\t");
		}
	}
}
