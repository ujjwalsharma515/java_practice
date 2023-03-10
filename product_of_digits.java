public class product_of_digits {
    public static void main(String[] args) {
        System.out.println(product(2222222));
        
    }
    
static int product(int n){
    if(n==0){
        return 1;
    }
    return n%10 * product(n/10);
}

    
}
                                          