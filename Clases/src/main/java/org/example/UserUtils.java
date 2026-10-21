package org.example;

import java.util.ArrayList;
import java.util.List;

public class UserUtils {

    //Función que te pasan una lista de usuarios y un nombre y devuelve el usuario con sus datos

    public static void FindUser(List<User> userList, String name){

    }


    //Función que recorre una lista y devuelve un usuario

   /* public static String printUserList(List<User> userList){

        if(userList == null)
            return "Lista vacía";

    }*/



    //Función que le paso una lista y me filtre por nombre || Usando contains

    public static List<User> filterByName(List<User> userList, String namePattern){

        List <User> result = new ArrayList<User>();

        if(userList == null)
            return result;
        if(namePattern == null)
            return result;

        for(int i = 0; i < userList.size(); i++){
            User u = userList.get(i);
            if (u.name.contains(namePattern))
                result.add(u);
        }
        return result;

    }

    //Función que me pasa una lista y elimina los que yo quiera quitar

    public static void removeUsers(List<User> users, String name){

    }
}