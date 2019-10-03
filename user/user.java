/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author lab 201
 */
public class user extends customer implements address {
    private int userId;
     String line1;
    String city;
    String country;
    private int id;
 private String password;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
        public int getId() {
               return id;
        }

    @Override
    public void setId(int id){
        this.id = id;
    }
    public static void main(String[] args) {
         user obj=new user();
       obj.Address="Dhaka";
        obj.city="Dhaka";
        obj.country="Bangladesh";
        obj.setUserId(163432559);
        obj.setName("Sajedul Islam");
        obj.setPassword("12345");
        obj.setId(1);
        
        System.out.println("Userid is   :  " +obj.getUserId());
        System.out.println("ID is       :  " +obj.getName());
        System.out.println("Password is :  " +obj.getPassword());
        System.out.println("Address is  :  " +obj.Address);
        System.out.println("City is     :  " +obj.city);
        System.out.println("Country is  :  " +obj.country);
    }
}
