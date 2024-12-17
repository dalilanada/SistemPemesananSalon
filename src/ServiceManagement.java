/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dalil
 */
public class ServiceManagement {
    
    private String ID;
    private String ServiceName;
    private int Price;
    
    
    public ServiceManagement (String id, String serviceName, int price){
        this.ID = id;
        this.ServiceName = serviceName;
        this.Price = price;
    }
    
    public void Cancel(){
        System.out.println("Service Cancelled.");
    }
    
    public void AddService(){
        System.out.println("Service Added.");
    }
    
    public void UpdateService(){
        System.out.println("Service Updated.");
    }
    
    public void DeleteService(){
        System.out.println("Service deleted");
    }
}
