package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    static void main() {
        User u = new User();
        u.name = "Ana";
        User u2 = new User();
        u2.name = "Andres";
        User u3 = new User();
        u3.name = "Juan";

        List<User> l = new ArrayList<User>();
        l.add(u);
        l.add(u2);
        l.add(u3);

        List<User> resultados = UserUtils.filterByName(l, "An");
        IO.println(resultados);
        }
    }
