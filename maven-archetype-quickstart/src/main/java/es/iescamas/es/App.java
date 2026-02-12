package es.iescamas.es;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        ListaArray lista = new ListaArray();
//        
//        lista.addFinal(1);
//        lista.addFinal(2);
//        System.out.println(lista.size());
//        lista.addFinal(3);
//        lista.addFinal(4);
//        System.out.println(lista.get(2));
//        lista.remove(2);
//        System.out.println(lista.size());
//        lista.indexOf(4);
//        lista.addFinal(5);
//        lista.addFinal(6);
//        System.out.println(lista.toString());
    	
    	ColaArray cola = new ColaArray();
    	cola.enqueue(1);
    	cola.enqueue(2);
    	cola.enqueue(3);
    	System.out.println(cola.toString());
    	System.out.println(cola.first());
    	cola.dequeue();
    	System.out.println(cola.toString());
    	
    	
    }
}
