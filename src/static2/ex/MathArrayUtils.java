package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {

	private int[] arrays;

	private MathArrayUtils(int[] arrays) {
		this.arrays = arrays;
	}

	public static int sum(int[] values) {
		int sum = 0;
		for (int arr : values) {
			sum += arr;
		}
		return sum;
	}

	public static double average(int[] values) {
		return (double)sum(values) / values.length;
	}

	public static int min(int[] values) {
		int minValue = values[0];
			for (int value: values) {
				if(value < minValue) {
					minValue = value;
				}
			}
			return minValue;
	}
	public static int max(int[] values) {
		int maxValue = values[0];
		for (int value: values) {
			if(value > maxValue) {
				maxValue = value;
			}
		}
		return maxValue;
		}
}

