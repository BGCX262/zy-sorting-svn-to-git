package com.zy.sorting;

import java.util.Random;

public class RandomHelper {
	public static void RandomizeArray(int arr[]){
		int tempData, tempIndex;
		int len = arr.length;
		for(int i=0; i<len; i++)
		{
			tempIndex = RandomBetween(i, len-1);
			tempData = arr[i];
			arr[i] = arr[tempIndex];
			arr[tempIndex] = tempData;
		}
	}
	public static int RandomBetween(int start, int end)
	{
		Random random = new Random();
		return random.nextInt(end-start+1) + start;
	}
}
