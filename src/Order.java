
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dalil
 */
public class Order {
    
    private String Id;
    private String CustomerID;
    private Date Date;
    private double Price;
    
    public Order(String id, String customerID, Date date, double price){
        this.Id = id;
        this.CustomerID = customerID;
        this.Date = date;
        this. Price = price;
    }
    
    public void CreateOrder(){
        System.out.println("Order created succesfully.");
    }
    
}
