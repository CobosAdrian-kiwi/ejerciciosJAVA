package com.bombilla;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bombilla b = new Bombilla();
        Bombilla bom = new Bombilla();
        
        System.out.println(b.Estado());
        
        b.Interruptor();
        bom.Interruptor();
        
        System.out.println(b.Estado());
        
        b.INTERRUPTOR_GLOBAL();
        System.out.println("----------------------");
        
        System.out.println(b.Estado());
        System.out.println(bom.Estado());
        
        bom.Interruptor();

        b.INTERRUPTOR_GLOBAL();
        System.out.println("----------------------");
        
        System.out.println(b.Estado());
        System.out.println(bom.Estado());
    }
}
