package com.jet;

import java.util.Random;

import static sun.net.ftp.FtpReplyCode.find;

public class MyClass {

	public static int[] array = new int[10];

	public static void main(String[] args) {

		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(50) + 1;
		}

		find(2);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "");
		}
	}

	private static int BubbleSort(int index) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(array[index - 1] + "");
		return array[index - 1];
	}


}
