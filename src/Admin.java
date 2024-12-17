/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dalil
 */

public class Admin extends Person{
    private String AdminID;
    
    //Constructor
    public Admin (String id, String name, String password, String email, String phone,String adminID){
        super(id, name, password, email, phone); // memanggil parent constructor
        this.AdminID = adminID;
    }
    
    public String getAdminID(){
        return AdminID;
    }
    
    public void setAdminID(String adminID){
        this.AdminID = adminID;
    }
    
    public void GenerateReports(){
        System.out.println("Admin " + getName() + "is generating reports...");
    }
    
    public void ManageService (){
        System.out.println("Admin" +getName()+ "is managing services...");
    }
    
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Admin ID:" + AdminID);
    }
}