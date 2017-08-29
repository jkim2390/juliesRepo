package pkgch1;

public class Qs1_6 {

	public int[][] rotate() {  

		int[][] arr = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int temp;
		int[][] newtemp = new int[4][4];
		int cnt = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				temp = arr[i][j];
				// System.out.println(temp);

				newtemp[j][cnt] = temp;
				System.out.println("ret: " + j + "/" + cnt + "   " + newtemp[j][cnt]);
			}
			cnt--;
			if (cnt < 0) {
				break;
			}

		}
		
		//print new arr
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(newtemp[i][j]);
			}
		}

		return newtemp;

	}
	
	

}
