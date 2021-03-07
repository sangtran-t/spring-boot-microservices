package com.ewallet.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class SubscriberLoginRequest extends BaseRequest {
    @ApiModelProperty(value="Email", required=true, example="sangtran@gmail.com")
    @JsonProperty
    private String email;

    @ApiModelProperty(value="Password", required=true, example="1234")
    @JsonProperty
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
