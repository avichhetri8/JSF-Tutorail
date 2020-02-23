/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author avi
 */
@ManagedBean(name="user")
@RequestScoped
public class User {
    
    String name;
    String password;
    ArrayList<String> check;

    public ArrayList<String> getCheck() {
        return check;
    }

    public void setCheck(ArrayList<String> check) {
        this.check = check;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String displayValue(){
        return "Your name is "+name;
    }
   
    /**
     * Creates a new instance of User
     */
    public User() {
    }
    
}
