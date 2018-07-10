package thinkinjava;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
	public static int[] sort(int[] arr) {
		int num=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[j]<arr[i]) {
					num=arr[j];
					arr[j]=arr[i];
					arr[i]=num;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Random ran=new Random();
		int[] arr=new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=ran.nextInt(100);
		}
		System.out.println(Arrays.toString(sort(arr)));
	}
}
