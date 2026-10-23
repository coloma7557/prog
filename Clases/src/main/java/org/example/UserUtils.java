package org.example;

import java.util.ArrayList;
import java.util.List;

public class UserUtils {

    //Función que te pasan una lista de usuarios y un nombre y devuelve el usuario con sus datos

    public static User findUser(List<User> userList, String name){

        if(userList == null || name == null)
            return null;

        for(int i = 0; i < userList.size(); i++){
            String userName = userList.get(i).name;

            if(userName.equalsIgnoreCase(name)) {
                User user = userList.get(i);
                return user;
            }
        }
        return null;
    }


    //Función que recorre una lista y devuelve un usuario

   public static String printUserList(List<User> userList){

        String result = "";
        if(userList == null)
            return null;

       for(int i = 0; i < userList.size(); i++){
           String name = userList.get(i).name;
           result = result + " " + name;
        }
        return result.trim();
    }

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
        if(users == null)
            return;
        if(name == null)
            return;

        for(int i = 0; i < users.size(); i++){
            User u = users.get(i);
            if(name.equalsIgnoreCase(u.name)) {
                users.remove(u);
                return;
            }
        }
        return;
    }

    //Función que me pasan una lista y la ordena por edad de menor a mayor. Doble For

    public static void sortByAge(List<User> users){
        if(users == null)
            return;

        for(int i = 0; i < users.size() -1 ; i++){


        }
    }
}