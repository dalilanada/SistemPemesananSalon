
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dalil
 */
public class Main {
    public static void main (String[]args){
        
        //class person
        System.out.println("====PERSON====");
        Person person = new Person ("P1", "Dalila", "1234", "dalila@gmai.com", "081234567891");
        person.displayInfo();
      
        //class admin
        System.out.println("\n====ADMIN====");
        Admin admin = new Admin ("P2", "Nada Admin", "admin123","nadaadmin@gmail.com", "113984765628", "A1" );
        admin.displayInfo();
        admin.GenerateReports();
        admin.ManageService();
        
        System.out.println("\n====CUSTOMER====");
        Customer customer = new Customer ("P3", "Carissa", "cust123", "Carissa@gmail.com", "09736514735", "C1");
        customer.displayInfo();
        customer.AddUser();
        customer.EditUser();
        customer.DeleteUser();
        
        System.out.println("\n====SERVICE MANAGEMENT====");
        ServiceManagement service = new ServiceManagement("S1", "Creambath", 120000);
        service.AddService();
        service.UpdateService();
        service.Cancel();
        service.DeleteService();
        
        System.out.println("\n====PAYMENT====");
        Payment payment = new Payment("PAY1", "ORD1", "2024-10-10", "Credit Card", 120000);
        payment.ProcessPayment();
        payment.GenerateReceipt();
        
        System.out.println("\n====ORDER====");
        Date orderDate = new Date();
        Order order = new Order ("ORD1", "C1", orderDate, 120000);
        order.CreateOrder();
        
        System.out.println("\n====LOGIN====");
        Login login = new Login ("Carissa", "Pass1234");
        System.out.println("Verifying Username (Carissa): " + login.VerifyPassword("Carissa"));
        System.out.println("Verifying Password (Pass1234): " + login.VerifyPassword("Pass1234"));
        System.out.println("Verifying Wrong Password (wrongpass)" + login.VerifyPassword("wrongoass"));
    }
}
