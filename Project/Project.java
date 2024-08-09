/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author thyfa
 */
public class Project {
    private static int contadorId = 1;
    private int id;
    private String nombre;
    private List listatareas;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getContadorId() {
        return contadorId;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List getListatareas() {
        return listatareas;
    }

    public Project(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.listatareas = new ArrayList();
    }

    public Project() {
        this(0,"");
    }
    }
    
    
    
   
   