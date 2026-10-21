package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    static void main() {
        User u = new User();
        u.name = "Ana";
        u.setAge(25);
        //IO.println("Tiene " + u.getAge() + " años");

        User u2 = new User();
        u2.name = "Andres";
        u2.setAge(30);

        User u3 = new User();
        u3.name = "Juan";
        u3.setAge(24);

        List<User> l = new ArrayList<User>();
        l.add(u);
        l.add(u2);
        l.add(u3);




        //Llamada a la función que filtra por nombre
        /*List<User> resultados = UserUtils.filterByName(l, "An");
        String text = UserUtils.printUserList(resultados);
        IO.println(text);*/

        //Llamada a la función findUser
        User resultado = UserUtils.findUser(l, "juan");
        IO.println("EL usuario es: " +  resultado.name);


        }
    }
