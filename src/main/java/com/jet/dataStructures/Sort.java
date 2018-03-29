package com.jet.dataStructures;

import java.util.Random;

/**
 * 排序
 *
 * @Author：Jet啟思
 * @Date:2018/3/29 21:38
 */
public class Sort {

	public static void main(String[] args) {
		bubbleSort(2);
	}

	/**
	 * 冒泡排序（查找第index个最大值）
	 * 相邻元素对比，通过交换它们的位置，把最大值顶在第一位，以此类推
	 *
	 * @param index
	 * @return
	 */
	private static int bubbleSort(int index) {
		int[] array = buildArray();
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
		System.out.println("第" + index + "大的值是：" + array[index - 1] + "");
		return array[index - 1];
	}

	/**
	 * 创建数组
	 *
	 * @return
	 */
	private static int[] buildArray() {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(50) + 1;
			System.out.println(array[i]);
		}
		return array;
	}

}
