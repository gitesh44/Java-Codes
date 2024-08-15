// //Count how many times lowercase vowels 
// occurred in a String entered by the user.

import java.util.*;
class VowelCount{
public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the String you want: ");
    String str=sc.nextLine();
    int count=0;

    for (int i = 0; i <str.length(); i++) {
        char ch=str.charAt(i);
        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
            count ++;
        }
        
    }
    System.out.println("THE COUNT OF VOWELS ARE:  " + count);
}
}