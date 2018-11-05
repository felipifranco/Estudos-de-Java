/**
 * Ex2
 */
public class Ex2 {
    static void inversor(int val){
        while(val > 0 ){
           System.out.print(val%10);
           val = val / 10;
        }
    }

    public static void main(String[] args) {
        inversor(123456);
    }
}