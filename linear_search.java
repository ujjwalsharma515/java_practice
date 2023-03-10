public class linear_search {
    public static void main(String[] args) {
        int[]arr = { 13,4,5,8,35,38};
        System.out.println(check(arr,38,0));
    }
    static boolean check(int []arr,int target,int index){
       // if(index == arr.length-1 && arr[index]==target)
       if(index==arr.length)
       {
            return false;
        }
      //  if(index == arr.length-1 && arr[index]!=target){
          //  return false;
      //  }
        
       
    
    return arr[index]==target || check(arr,target,index+1);
    }
}
