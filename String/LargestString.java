// This Java program is designed to find the "largest" string in an array of strings, based on
//  lexicographical (alphabetical) order. 

public class LargestString{
    public static void main(String[] args) {
        String Fruits[]={"apple","Mango","Pineapple","Banana"};
        String Largest=Fruits[0];
        for (int i = 1; i < Fruits.length; i++) {
            if (Largest.compareTo(Fruits[i])<0){
                Largest=Fruits[i];
            }
        }
        System.out.println("The largest string (lexicographically) is: " + Largest);
    }
}