package com.dt.futurix.userDashboard.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@JsonInclude
@Accessors(chain=true)
public class UserPersonalData {

    private String name;
    private String registeredNumber;
    private String emailId;
}
