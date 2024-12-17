/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dalil
 */
public class Payment {
    
    private String ID;
    private String OrderID;
    private String Date;
    private String Payment;
    private double Amount;
    
    public Payment (String id, String orderID, String date, String payment, double amount){
        this.ID = id;
        this.OrderID = orderID;
        this.Date = date;
        this.Payment = payment;
        this.Amount = amount;
    }
    
    public void ProcessPayment(){
        System.out.println("Payment Processed for Order ID: " + this.OrderID);
    }
    
    public void GenerateReceipt(){
        System.out.println("Receipt generated for Amount: " + this.Amount);
    }
}
