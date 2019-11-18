public class Bellringer {
	
	public int getIndexAmount(int[] arr) {
		return arr.length;
	}
	
	public int getArrayFactorial(int[] arr) {
		int product = 1;
		for(int i = 0; i < arr.length; i++) {
			product *= arr[i];
		}
		
		return product;
	}
	
	public void setAllToZero(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
	}
}
