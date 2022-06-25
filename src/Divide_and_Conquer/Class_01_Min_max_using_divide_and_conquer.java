package Divide_and_Conquer;
import java.lang.Math;

public class Class_01_Min_max_using_divide_and_conquer {
	static class Pair{
		int min;
		int max;
	}
	
	static Pair getMinMax(int[] arr, int low, int high) {
		Pair minmax = new Pair();
		
		//If there is only one element in array
		if(low == high) {
			minmax.min = arr[low];
			minmax.max = arr[low];
			return minmax;
		}
		
		//if there are two elements in array
		if(low == high - 1) {
			if(arr[low] > arr[high]) {
				minmax.max = arr[low];
				minmax.min = arr[high];
			}else {
				minmax.max = arr[high];
				minmax.min = arr[low];
			}
			
			return minmax;
		}
		
		//If there are more than two elements in array
		
		int mid = (low + high) / 2;
		Pair mml = new Pair();
		Pair mmr = new Pair();
		
		mml = getMinMax(arr, low, mid);
		mmr = getMinMax(arr, mid + 1, high);
		
		if(mml.max > mmr.max) {
			minmax.max = mml.max;
		}else {
			minmax.max = mmr.max;
		}
		
		if(mml.min < mmr.min) {
			minmax.min = mml.min;
		}else {
			minmax.min = mmr.min;
		}
		
		return minmax;
	}
	
	public static void main(String[] args) {
		int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, 0, arr_size-1);
        System.out.println("Min: " + minmax.min);
        System.out.println("Max: " + minmax.max);
	}	
}
