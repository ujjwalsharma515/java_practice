public class count_zeros {
    public static void main(String[] args) {
       
    
        System.out.println(count(4495050));
        
        
    }
    static int count(int n){
  
        return zeros(n,0 );

    }
     private static int zeros(int n,int count){
        if(n==0){
            return count;
        }
       
        int r = n%10;
        if(r==0){
            return zeros(n/10,count+1);
        }
       return zeros(n/10,count);
       
         


    }
}
