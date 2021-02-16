package com.rsc.srm.fs.basic.myarray;

public class MyMUltiDimArray {

	public static void main(String[] args) {
		int[][] myMatrix = {
				{2,6,7},
				{1,6,2},
				{5,6,9},
				{6,9,13},
		}; 
		
		//System.out.println(myMatrix.length);
		int[] subarray = myMatrix[0];
		
		int[][] myMatrix2 = myMatrix.clone();
		
		
		System.out.println(myMatrix2==myMatrix);
		
		System.out.println(myMatrix[0] == myMatrix2[0]);
		
		//System.out.println(subarray.length);
		
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
			  //System.out.println(i + "," + j);
				System.out.print(myMatrix[i][j] + " ");	
			}
	        System.out.println();
		}

	}

}
