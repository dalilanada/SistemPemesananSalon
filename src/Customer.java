/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dalil
 */
public class Customer extends Person {
    
    private String CustomerID;
    
    public Customer(String id, String name, String password, String email, String phone, String customerID){
        super (id, name, password, email, phone);
        this.CustomerID = customerID;
    }
    
    public String getCustomerID(){
        return CustomerID;
    }
    
    public void AddUser(){
        System.out.println("Customer "+getName()+ "added succesfully.");
    }
    
    public void DeleteUser(){
        System.out.println("Customer"+ getName()+ "deleted.");
    }
    
    public void EditUser(){
        System.out.println("Customer "+ getName()+"details updated.");
    }
    
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Customer ID: "+ CustomerID);
    }
}
