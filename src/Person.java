/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dalil
 */
public class Person {
    // Attributes 
    private String Id;
    private String Name;
    private String Password;
    private String Email;
    private String Phone;
    
    
    //Constructor
    public Person (String id, String name, String password, String email, String phone){
        this.Id = id;
        this.Name = name;
        this.Password = password;
        this.Email = email;
        this.Phone = phone;
    }
    
    public String getId(){
        return Id;
    }
    
    public void setId(String id){
        this.Id = id;
    }
    
    public String getName(){
        return Name;
    }
    
    public void setName (String name){
        this.Name = name;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public void setPassword (String password){
        this.Password = password;
    }
    
    public String getEmail (){
        return Email;
    }
    
    public void setEmail (String email){
        this.Email = email;
    }
    
    public String getPhone(){
        return Phone; 
    }
    
    public void setPhone(String phone){
        this.Phone = phone;
    }
    
    public void displayInfo(){
        System.out.println("ID: " + Id);
        System.out.println("Name: " + Name);
        System.out.println("Email: " + Email);
        System.out.println("Phone: " + Phone);
        System.out.println("Password: "+ Password);
    }
}
