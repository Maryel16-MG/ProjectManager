/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasks;

import Users.User;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Task {
    private int id;
    private String description;
    private User User;
    private ArrayList listComment;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return User;
    }

    public ArrayList getListComment() {
        return listComment;
    }  

    public void setDescription(String description) {
        this.description = description;
    }

    public void setListComment(ArrayList listComment) {
        this.listComment = listComment;
    }

    public Task(int id, String description, User user) {
        this.id = id;
        this.description = description;
        this.User = user;
        this.listComment = new ArrayList();
    }

    public Task() {
        this(0,"",new User());
    }
 
}

    

