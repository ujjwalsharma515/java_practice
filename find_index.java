public class find_index {
    
    public static void main(String[] args) {
        int[]arr = { 13,4,5,8,35,38};
        System.out.println(check(arr,5,0));
    }
    static int check(int []arr,int target,int index){
       // if(index == arr.length-1 && arr[index]==target)
       if(index==arr.length-1)
       {
            return -1;

        }
        if(arr[index]==target){
          return index;
       }
        
       
    else{
       return check(arr,target,index+1);
    }
}
}


