package mx.sostech.app;

import queue.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue<String> names = new Queue<>(String.class, 5);
        try {
            names.enqueue("Joselito");
            names.enqueue("Ana");
            names.enqueue("Ricar2");
            names.enqueue("Aaron");
            names.enqueue("Milton");
            //names.deQueue();
           // names.enqueue("EvilIn");
            System.out.println(names.front());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
