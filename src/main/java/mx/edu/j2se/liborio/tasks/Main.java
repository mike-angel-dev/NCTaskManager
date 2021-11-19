package mx.edu.j2se.liborio.tasks;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Task irFiesta = new Task("ir a mi cumpleaños", 8);
        irFiesta.getTime();
        irFiesta.setActive(true);
        System.out.println(irFiesta);

        Task estudiar = new Task("leer", 5, 7, 2);
        estudiar.setActive(true);
        System.out.println(estudiar);

        Task correr = new Task("correr", 4, 11, 2);
        System.out.println(correr.nextTimeAfter(3));
        System.out.println(correr.nextTimeAfter(4));
        System.out.println(correr.nextTimeAfter(5));
        System.out.println(correr.nextTimeAfter(10));
        System.out.println(correr.nextTimeAfter(11));
        System.out.println(correr.nextTimeAfter(12));
        System.out.println(correr);

        System.out.println("*****--------tasklist---------------------***");
        ArrayTaskList taskList = new ArrayTaskList(3);
        taskList.add(irFiesta);
        taskList.add(correr);
        taskList.add(estudiar);
        System.out.println(Arrays.toString(taskList.incoming(5,9)));
        System.out.println(taskList.remove(estudiar));
        taskList.printTask();
    }

}
