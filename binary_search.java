public class binary_search {
    static int search(int[]arr,int target,int s, int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if (target == arr[m]){
            return m;
        }
        if(target >arr[m]){
            return search (arr,target,m+1,e);
        }
        return search (arr, target,s,m-1);
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,9};
        int target = 3;
        System.out.println(search(arr, target, 0,arr.length-1));
    }
}
