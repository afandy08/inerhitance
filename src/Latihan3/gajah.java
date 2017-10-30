/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author Kardi
 */
public class gajah extends hewan {
    public static void testClassMethod()
    {
        System.out.println("the class method in hewan...");
    }
    
    public void testInstanceMethod()
    {
        System.out.println("the instance method in gajah..");
    }
    public static void main (String[] args)
    {
        gajah mygajah = new gajah();
        hewan myhewan = mygajah;
        hewan.testClassMethod();
        myhewan.testInstanceMethod();
    }
}
