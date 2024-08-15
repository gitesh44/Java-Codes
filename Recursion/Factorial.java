class facto{
    int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n* fact(n-1);   
        }
    }
}
public class Factorial{
    public static void main(String[] args) {
        facto fac=new facto();
        int result=fac.fact(12);
        System.out.println("The factorial is : " + result);    
    }
}