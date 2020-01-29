package com.dt.futurix.userDashboard.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

@JsonInclude
@Data
@Accessors(chain=true)
public class UserData {
    private int userId;
    private UserPersonalData userPersonalData;
    private UserAnalyticsData userAnalyticsData;

}
