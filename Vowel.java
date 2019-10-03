
package vowel;

import java.util.Scanner;


public class Vowel {

    
    public static void main(String[] args) {
        // TODO code application logic here
        char character;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of character:");
     character = sc.next().charAt(0);
       
       switch (character){
           case 'a':
               System.out.println("The character is vowel");
               break;
           case 'e':
               System.out.println("The character is vowel");
               break;
           case 'i':
               System.out.println("The Character is vowel");
               break;
           case 'o':
               System.out.println("The Character is vowel");
               break;
           case 'u':
               System.out.println("The Character is vowel");
               break;
           default:
               System.out.println("The character is constant");
       
       
       
       
       
       
       }
    }
    
}
