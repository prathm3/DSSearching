
public class Search {
	
	//sequential Search simple for loop exit when found;
	
	public static int BinarySearch(int[] brr, int l, int r, int num) {
		int index = -1;
		if(l<=r) {
			int mid = (l+r)/2;
			if(brr[mid]==num) {
				index = mid;
			}else {
				if(brr[mid]>num) {
					index = BinarySearch(brr, l,mid-1,num);
				}else {
					index = BinarySearch(brr, mid+1, r, num);
				}
			}
		}
		return index;
	}

}
