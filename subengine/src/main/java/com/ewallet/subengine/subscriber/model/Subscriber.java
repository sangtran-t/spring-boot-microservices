package com.ewallet.subengine.subscriber.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String fistName;

    @Column
    private String middleName;

    @Column
    private String lastName;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private String address;

    @Column
    private String company;

    @Column
    private String password;

    public Subscriber() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscriber that = (Subscriber) o;
        return id == that.id && Objects.equals(fistName, that.fistName) && Objects.equals(middleName, that.middleName) && Objects.equals(lastName, that.lastName) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email) && Objects.equals(address, that.address) && Objects.equals(company, that.company) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fistName, middleName, lastName, phone, email, address, company, password);
    }

    public Subscriber(int id, String fistName, String middleName, String lastName, String phone, String email, String address, String password) {
        this.id = id;
        this.fistName = fistName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.password = password;
    }

    public Subscriber(int id, String fistName, String middleName, String lastName, String phone, String email, String address, String company, String password) {
        this.id = id;
        this.fistName = fistName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.company = company;
        this.password = password;
    }
}
