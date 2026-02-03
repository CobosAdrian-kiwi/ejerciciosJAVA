package com.herencia;

import com.herencia.hora.Hora;
import com.herencia.hora.Hora12;
import com.herencia.hora.periodo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    
//        Hora reloj = new Hora(12, 0);
//        
//        System.out.println(reloj.toString());
//        
//        reloj.setMinutos(59);;
//        
//        reloj.inc();
//        
//        System.out.println(reloj.toString());
//        
//        reloj.setMinutos(59);
//        reloj.setHora(23);
//        
//        reloj.inc();
//       
//        System.out.println(reloj.toString());
    	
    	Hora12 reloj = new Hora12(23, 59, periodo.AM);
    	
    	System.out.println(reloj.toString());
    	reloj.inc();
    	System.out.println(reloj.toString());
        
    }
}
