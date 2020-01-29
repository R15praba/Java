package org.test;

import java.io.ObjectInputStream.GetField;

public class New {
public static void main(String[] args) {
String s = "Nisha";
String s1 = "Nisha";


System.out.println(System.identityHashCode(s));
System.out.println(System.identityHashCode(s1));
System.out.println(s);
System.out.println(s1);
System.out.println(1);

}
}