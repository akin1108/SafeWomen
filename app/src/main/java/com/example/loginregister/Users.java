package com.example.loginregister;

public class Users {
    private String name, phone, email, eName, eContact, eRelation;

    public Users() {
    }

    public Users(String name, String phone, String email, String eName, String eContact, String eRelation) {
        this.name = name;
        this.phone = phone;
      //  this.password = password;
        this.email = email;
        this.eName = eName;
        this.eContact = eContact;
        this.eRelation = eRelation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteContact() {
        return eContact;
    }

    public void seteContact(String eContact) {
        this.eContact = eContact;
    }

    public String geteRelation() {
        return eRelation;
    }

    public void seteRelation(String eRelation) {
        this.eRelation = eRelation;
    }
}
