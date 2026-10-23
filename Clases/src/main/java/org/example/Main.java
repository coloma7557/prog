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

        //UsersManage um = new UsersManage();
        //um.usersList.add();


        //Llamada a la función que filtra por nombre
        /*List<User> resultados = UserUtils.filterByName(l, "An");
        String text = UserUtils.printUserList(resultados);
        IO.println(text);*/

        //Llamada a la función findUser
        //User resultado = UserUtils.findUser(l, "juan");
        //IO.println("EL usuario es: " +  resultado.name);

        //Llamada a la función removeUsers

        /*
        IO.println(l);
         */
        UserUtils.removeUsers(l, "Juan");
        String text = UserUtils.printUserList(l);
        IO.println(text);
    } //User u1 = new User("Juan", 1, 32, M);
      //UsersManager.addUser(u1);
}