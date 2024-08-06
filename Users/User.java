/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

/**
 *
 * @author thyfa
 */
public class User {
   private String id;
   private String Name;
   private String mail;

    public String getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public User(String id, String Name, String mail) {
        this.id = id;
        this.Name = Name;
        this.mail = mail;
    }

    public User() {
        this("","","");
    }
   
   
}
