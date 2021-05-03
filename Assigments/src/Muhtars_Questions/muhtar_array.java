package Muhtars_Questions;

import java.util.Arrays;

public class muhtar_array {

	public static void main(String[] args) {

		/*
		 * Tasks: 1. write a program that can merge two arrays of integer and retuns the
		 * third array arr1 ={1,2,3} arr2 = {4,5,6,7}
		 * 
		 * output: arr3 = {1,2,3,4,5,6,7}
		 * 
		 * 
		 * 2. move all zeros to the end of array
		 * 
		 * array = {1,0,2,0,3,0,0,4,5,6,7}
		 * 
		 * output: {1,2,3,4,5,6,7,0,0,0,0}
		 * 
		 * DO NOT USE sort
		 */

		// -------- 1 -----------
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6, 7 };
		int[] arr3 = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			arr3[i + arr1.length] = arr2[i];
		}

		System.out.println(Arrays.toString(arr3));

		// ------------2 ----------
//		int[] array = { 1, 0, 2, 0, 3, 0, 0, 4, 5, 6, 7 };
//		int min = array[0];
//		int[] newArray = new int[array.length];
//
//		for (int i = 0; i < array.length; i++) { // 1, 0, 2, 0, 3, 0, 0, 4, 5, 6, 7 
//			for(int j = 0; j<array.length; i++) {// 1, 0, 2, 0, 3, 0, 0, 4, 5, 6, 7 
//				if(array[i] < array[j]) {
//					
//				}
//			}
//
//		}
//		
//		  
//		  System.out.println(Arrays.toString(array));

	}

}
