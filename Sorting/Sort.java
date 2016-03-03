public class Sort{
	public static void main(String[] args){
		int[] arr = {6,5,4,3,2,1};
		int[] arr1 = {1,3,5,0,0,0};
		int[] arr2 = {2,4,6};
		mergesort(arr);
		for(int i = 0; i < arr.length;i++){
			System.out.print(arr[i]+"\t");
		} 
		mergeSpecial(arr1,arr2,2,2);
		for(int i =0 ; i <arr1.length;i++){
			System.out.print(arr1[i]+"\t");
		}
	}
	public static void mergesort(int[] arr){
		int[] helper = new int[arr.length];
		mergesort(arr,helper,0,arr.length-1);
	}
	public static void mergesort(int[] arr, int[] helper, int low, int high){
		if(low<high){
			int mid = (low+high)/2;
			mergesort(arr,helper,low,mid);
			mergesort(arr,helper,mid+1,high);
			merge(arr,helper,low,mid,high);
		}
	}
	
	public static void merge(int[] arr, int[] helper, int low, int middle, int high){
		for(int i = low; i <= high ; i++){
			helper[i]=arr[i];
		}
		int helperLeft=low;
		int helperRight=middle+1;
		int current = low;
	
		while(helperLeft<=middle && helperRight<=high){
			if(helper[helperLeft]<=helper[helperRight]){
				arr[current] = helper[helperLeft];
				helperLeft++;
			}else{
				arr[current]=helper[helperRight];
				helperRight++;
			}
			current++;
		}
		int remaining = middle - helperLeft;
		for(int i =0 ; i <=remaining;i++){
			arr[current+i] = helper[helperLeft+i];
		}
	}
	public static void mergeSpecial(int[] a, int[] b, int aLast, int bLast){
		int lastIndex=a.length-1;
		while(lastIndex>=0){
			if(aLast>=0&&bLast>=0){
				if(a[aLast]>b[bLast]){
					a[lastIndex]=a[aLast];
					lastIndex--;
					aLast--;
				}else if(a[aLast]<b[bLast]){
					a[lastIndex]=b[bLast];
					lastIndex--;
					bLast--;
				}else{
					a[lastIndex]=a[aLast];
					lastIndex--;
					aLast--;
				}
			}else if(aLast<0){
				a[lastIndex]=b[bLast];
				lastIndex--;
				bLast--;
			}else{
				lastIndex=-1;
			}
		}
	}
}
