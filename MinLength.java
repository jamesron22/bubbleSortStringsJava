
package minlength;

import java.util.Scanner;

/**
 *
 * @author Ronald Coleman
 * October 2019
 */
public class MinLength {

    public static void main(String[] args) {
         String word[] = new String[] {"orange", "tea", "apple", "cheese", "milk", "no"};
         String temp;
         boolean fixed = false;
        
         while (fixed == false)
         {
             fixed = true;
        for (int i = 0; i < word.length - 1; i++)
       
            if (word[i].length() > word[i + 1].length())     
                //if orange is longer than tea
            {
                temp = word[i + 1];
                //temp = tea
                word[i + 1] = word[i];
                //Moves orange to the place of [1] in the array
                word[i] = temp;
                //Sets tea to the place of [0] in the Array
                fixed = false;
            }
        
        }
         for (int i = 0; i < word.length; i ++)
         {
             System.out.println(word[i]);
         }
    }
}
         
        
