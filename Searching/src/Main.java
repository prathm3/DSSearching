
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {-1,2,5,89,99,100,144};
		int index = Search.BinarySearch(arr, 0, arr.length-1, 144);
		if(index == -1) {
			System.out.println("NOt found");
		}else {
			System.out.println(index+1);
		}
	}

}
