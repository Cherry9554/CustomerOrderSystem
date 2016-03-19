package Entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruiyan
 */
public class Customer {
    private String id;
    private String email;
    private String phone;
    private int credit;

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void setCredit(int credit) {
        this.credit = credit;
    }

    //add bonus to customer's credit if the customer shares on facebook
    public void addCredit (int bonus) {
        credit += bonus;
    }
    
    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
    
    public int getCredit() {
        return credit;
    } 
}