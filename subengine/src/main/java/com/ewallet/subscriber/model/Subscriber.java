package com.ewallet.subscriber.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @NotNull
    private String firstname;

    @Column
    @NotNull
    private String middlename;

    @Column
    @NotNull
    private String lastname;

    @Column
    @NotNull
    private String phone;

    @Column
    @NotNull
    private String email;

    @Column
    @NotNull
    private String address;

    @Column
    private String company;

    @Column
    @NotNull
    private String password;

    public Subscriber() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
        return id == that.id && Objects.equals(firstname, that.firstname) && Objects.equals(middlename, that.middlename) && Objects.equals(lastname, that.lastname) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email) && Objects.equals(address, that.address) && Objects.equals(company, that.company) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, middlename, lastname, phone, email, address, company, password);
    }

    public Subscriber(Long id, String firstName, String middleName, String lastName, String phone, String email, String address, String password) {
        this.id = id;
        this.firstname = firstName;
        this.middlename = middleName;
        this.lastname = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.password = password;
    }

    public Subscriber(Long id, String firstName, String middleName, String lastName, String phone, String email, String address, String company, String password) {
        this.id = id;
        this.firstname = firstName;
        this.middlename = middleName;
        this.lastname = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.company = company;
        this.password = password;
    }
}
