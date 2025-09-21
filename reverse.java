public class reverse {
    public static void main(String[] args) {
        int a = 1234;
        int c,n = 0;
        while(a!=0){
            c=a%10;
            n=n*10+c;
            a=a/10;
        }
        System.out.println(n);
    }

    
}