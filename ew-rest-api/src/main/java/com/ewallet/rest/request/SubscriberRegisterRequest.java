package com.ewallet.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Register")
public class SubscriberRegisterRequest extends BaseRequest {
    @ApiModelProperty(value = "First Name", required = true, example = "Sang")
    @JsonProperty
    private String firstname;

    @ApiModelProperty(value = "Middle Name", required = true, example = "Thanh")
    @JsonProperty
    private String middlename;

    @ApiModelProperty(value = "Last Name", required = true, example = "Tran")
    @JsonProperty
    private String lastname;

    @ApiModelProperty(value = "Phone Number", required = true, example = "0368174616")
    @JsonProperty
    private String phone;

    @ApiModelProperty(value = "Email Address", required = true, example = "sangtran@gmail.com")
    @JsonProperty
    private String email;

    @ApiModelProperty(value = "Current Address", required = true, example = "Binh Dinh")
    @JsonProperty
    private String address;

    @ApiModelProperty(value = "Company", required = false, example = "TMA Solution")
    @JsonProperty
    private String company;

    @ApiModelProperty(value = "Password", required = true, example = "1234")
    @JsonProperty
    private String password;

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
}
