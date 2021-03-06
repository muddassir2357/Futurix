package com.dt.futurix.userDashboard.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class EpisodePlayed {
    private int total;
    private int permonth;
    private int perweek;
    private int perday;
}
