import java.util.Arrays;

public class U5A3 {

	public static double[] ArraySortieren(double[] array) {
	
		int arrayLength = array.length;
		double[] newArray = new double[arrayLength];
		int a = 0;
		
			double max = array[0];
			for(int v=1; v<arrayLength; v++) {
				if(array[v]>max) {
					max = array[v];
				}
			}
		
		for(int i = 0; i<arrayLength; i++) {
			
			double min = array[0];
			
			for(int j=1; j<arrayLength; j++) {
				
				if(array[j]<min) {
					min = array[j];
					a = j;
				}
			}
			
			newArray[i] = min;
			array[a] = max + 1;
		}
		
		return newArray;
	}
	
	
	public static void main(String[] args) {
		
		double[] proba = {1,12,5,6,7.3,15,3,5,31,1};
		System.out.println(Arrays.toString(ArraySortieren(proba)));
	}
}
