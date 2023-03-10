public class reverse_string {
    public static void main(String[] args) {
        reverse("","abcd");
    }
    static String reverse(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return "";
        } 
        char index = up.charAt(0);
        return  index+p +up.substring(1);
        
    }
    
}
