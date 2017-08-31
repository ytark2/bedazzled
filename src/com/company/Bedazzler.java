package com.company;

public class Bedazzler {

    public static void main(String[] args) {
        System.out.println(bedazzzle("This is my string"));
        // write your code here
    }


        public static String bedazzzle(String inputStr){
            String outputStr="";

            for (int i = 0; i <i nputStr.length() ; i++) {
                //put a * in front of every character
                outputStr+="*";


                char currentChar = inputStr.charAt(i);
                //if the character is a space, double it
                if (currentChar==' ') {
                    outputStr += " ";
                }else{
                    // otherwise, just copy the character
                    outputStr+=currentChar;
                }

            }
            outputStr+="*";
            return outputStr;


        }

}
