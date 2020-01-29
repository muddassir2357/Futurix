package com.dt.futurix.userDashboard.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Access;

@Data
@Accessors(chain=true)
public class UserAnalyticsData {
    private HoursWatched hoursWatched;
    private EpisodePlayed episodePlayed;

}
