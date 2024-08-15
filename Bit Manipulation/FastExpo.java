public class FastExpo {
    public static int FastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;  // Square the base
            n = n >> 1; // Divide the exponent by 2
        }
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(FastExpo(3, 5)); 
    }
}
