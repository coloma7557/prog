package org.example;

import java.util.ArrayList;
import java.util.List;

public class UsersManager {
    private List<User> userList;

    //Inicializamos la clase creando la lista de usuarios vacía
    public UsersManager(){
        this.userList = new ArrayList<>();

    }
    //Añadir el usuario a nuestra lista creada arriba
    public void addUser(User user){
        //User u = new User(user.name, user.id, user.age, user.gender);
        this.userList.add(user);

    }

    //Función IndexOf para buscar el usuario y darte el número exacto de éste
    public int indexOfUser(User user){


    }


    public boolean containsUser(){

    }

    public void removeUser(User user){


    }
}
//public int indexOfUser(User user)
//public boolean containsUser(User user){
//return indexOfUSer(user)>=0;}

//public void removeUser(User user){
//int index = indexOfUser(user);
//if(index < 0)
//return
//this.usersList.remove(index);}}

