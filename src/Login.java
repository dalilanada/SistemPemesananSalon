/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dalil
 */
public class Login {
    
    private String Username;
    private String Password;
    
    public Login (String username, String password){
        this.Username = username;
        this.Password = password;
    }
    
    public boolean VerifyPassword (String inputPassword){
        return this.Password.equals(inputPassword);
    }
    
    public boolean VerifyUsername (String inputUsername){
        return this.Username.equals(inputUsername);
    }
}
