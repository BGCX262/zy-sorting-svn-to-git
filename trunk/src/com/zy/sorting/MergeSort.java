package com.zy.sorting;

public class MergeSort implements SortAlgorithm{

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		mergeSort(a, 0, a.length-1);
	}

	private void mergeSort(int[] a, int i, int length) {
		// TODO Auto-generated method stub
		if(i<length) {
			int m = (i+length)/2;
			mergeSort(a, i, m);
			mergeSort(a, m+1, length);
			merge(a, i, m, length);
		}
	}

	//merge a[begin,...,mid] and a[mid+1,...,end];
	private void merge(int[] a, int begin, int mid, int end) {
		// TODO Auto-generated method stub
		int lenlow = mid - begin + 1;
		int lenhigh = end - mid;
		int[] arrlow = new int[lenlow];
		int[] arrhigh = new int[lenhigh];
		
		int j=0, k=0;
		for(j=0; j<lenlow; j++) {
			arrlow[j] = a[begin+j];
		}
		for(k=0; k<lenhigh; k++) {
			arrhigh[k] = a[k+mid+1];
		}
		
		j = 0; k = 0; 
		int i = 0;
		while(j<lenlow&&k<lenhigh) {
			if(arrlow[j]<=arrhigh[k]) {
				a[begin+i] = arrlow[j];
				i++;
				j++;
			} else {
				a[begin+i] = arrhigh[k];
				i++;
				k++;
			}
		}
		if(j>=lenlow&&k<lenhigh) {
			while(k<lenhigh) {
				a[begin+i] = arrhigh[k];
				i++;
				k++;
			}
		} else if(j<lenlow&&k>=lenhigh) {
			while(j<lenlow) {
				a[begin+i] = arrlow[j];
				i++;
				j++;
			}
		}
		
	}

}
