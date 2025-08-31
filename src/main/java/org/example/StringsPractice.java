package org.example;

public class StringsPractice {

    public static void main(String[] args) {
     String s="Welcome";
     s.length();
     s.toUpperCase();
     System.out.println(s.length());
     System.out.println("Welcome".length());
     System.out.println(s.toUpperCase());

     String s1="Welcome ";
     String s2="to Java ";
     String s3= "Automation" ;
        System.out.println(s1+s2);
        System.out.println(s1+s2+s3);
     s1.concat(s2);
     s1.concat(s2).concat(s3);
     System.out.println(s1.concat(s2));
     System.out.println(s1.concat(s2).concat(s3)) ;
     System.out.println(s1.concat(s2+s3));
     System.out.println(("Welcome" + "to Java"));
     System.out.println("Welcome" .concat("to Java"));

     String S ="   Selenium   ";
     System.out.println("Before Triming :" +S.length() );

     S.trim();
     System.out.println("After Triming :" +S.trim().length());
    }
}
