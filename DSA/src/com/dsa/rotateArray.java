package com.dsa;

public class rotateArray {
	public void rotate(int[] nums, int k) {
	      k = k%nums.length;
	      reverse(nums,0,nums.length-1);
	      reverse(nums,0,k-1);
	      reverse(nums,k,nums.length-1);
	    }
	    public void reverse(int[] arr, int x, int y){
	        while(x<y){
	            int temp = arr[x];
	            arr[x] = arr[y];
	            arr[y] = temp;
	            x++;
	            y--;
	        }
	    
	}
}


