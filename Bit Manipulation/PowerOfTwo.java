//implementation of identifies whether a number is a power of two.
class PowerOfTwo{
    public static boolean isPowerOfTwo(int n) {
        return (n&(n-1))==0; //This is a classic bit manipulation trick to check if n is 
        // a power of two. For any power of two, its binary representation has exactly one 1 bit, 
        // and n - 1 will have all the bits after the 1 set to 1. Performing an & operation
        //  between n and n - 1 will yield 0 only for powers of two.
        
    }
    public static void main(String[] args) {
      System.out.println(isPowerOfTwo(8));  
    }
}