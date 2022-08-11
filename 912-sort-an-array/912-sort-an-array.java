class Solution {
    public static void merge(int arr[],int l,int mid, int h){
        int n1 = mid -l +1;
        int n2 = h - mid;
        int a1[] = new int[n1];
        int a2[] = new int[n2];
        
        for(int i=0;i<n1;i++){
            a1[i] = arr[i+l];
        }
        for(int i=0;i<n2;i++){
            a2[i] = arr[i+mid+1];
        }
        int i=0,j=0,k=l;
        while(i < n1 && j < n2){
            if(a1[i] <= a2[j]){
                arr[k] = a1[i];i++;k++;
            }
            else{
                arr[k] = a2[j];j++;k++;
            }
        }
        while(i<n1){
            arr[k] = a1[i];
            i++;k++;
        }
        while(j<n2){
            arr[k] = a2[j];
            k++;j++;
        }
    }
    
    public static void mergeSort(int arr[],int l,int h){
        if(l<h){
            int mid = l + (h-l) /2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,h);
            merge(arr,l,mid,h);
        }
        return;
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}