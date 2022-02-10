package Tasks;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {

    /*
    QUESTION
    Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies.
    For this challenge, the test is not case-sensitive. For example, the anagrams of
    CAT are CAT, ACT, tac, TCA, aTC, and CtA.

    Function Description

    Complete the isAnagram function in the editor.

    isAnagram has the following parameters:


    string a: the first string
    string b: the second string

    Returns

    boolean: If  and  are case-insensitive anagrams, return true.  Otherwise, return false.

                        PSEUDOCODE
            1. Change the arguments to lowercase to aid comparism
            2. The next is to convert the strings into an array



     */

    public static void main(String[] args) {

        System.out.println(isAnagram("tdfgh", "htcfg"));

    }

    public static boolean isAnagram(String string1, String string2){
        String string1LowerCase = string1.toLowerCase(Locale.ROOT);
        String string2LowerCase = string2.toLowerCase(Locale.ROOT);

        String [] string1Array = string1LowerCase.split("");
        String [] string2Array = string2LowerCase.split("");

        Arrays.sort(string1Array);
        Arrays.sort(string2Array);


//        System.out.println(Arrays.toString(string1Array));

        if (Arrays.deepEquals(string1Array, string2Array)){
            return true;
        }else{
            return false;
        }
    }
}
