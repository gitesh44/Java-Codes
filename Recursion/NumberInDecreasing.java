
// print numbers in decreasing order using recursion
public class NumberInDecreasing{

    public static void printdec(int n){
        if(n==1){ //// Base case: if n is 1, print 1 and return to stop recursion
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        // Recursive call with n-1
        // This will continue until n reaches 1 .
        printdec(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printdec(n);
    }
        
    }