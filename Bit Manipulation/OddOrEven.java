//Check if Number is EVen or Odd.
class OddOrEven {
    public static void OddOrEven(int n) {
        int BitMask = 1; //This is used to check the least significant bit (LSB) of the integer n
        if ((n & BitMask) == 0) {// If the result is 0, the number is even; otherwise, it's odd. 
        //This works because even numbers have an LSB of 0, while odd numbers have an LSB of 1.
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }

    public static void main(String[] args) {
        OddOrEven(3);  // Output will be "Number is Odd"
        OddOrEven(4);  // Output will be "Number is Even"
    }
}
