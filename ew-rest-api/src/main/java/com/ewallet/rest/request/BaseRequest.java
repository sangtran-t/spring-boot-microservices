package com.ewallet.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Base Request")
public class BaseRequest {
    @ApiModelProperty(value = "Session Token", required = true, example = "SESSIONTOKEN")
    @JsonProperty
    private String sessionToken;

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }
}
