package com.dt.futurix.userDashboard.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="userdata" )
@Data
public class UserDataTable {

    @Id
    @Column
    private int userId;
    @Column
    private String name;
    @Column
    private String registered_number;
    @Column
    private String email_id;
    @Column
    private int episode_watched_total;
    @Column
    private int episode_Watched_permonth;
    @Column
    private int episode_Watched_perweek;
    @Column
    private int episode_Watched_perday;
    @Column
    private int hours_watched_total;
    @Column
    private int hours_Watched_permonth;
    @Column
    private int hours_Watched_perweek;
    @Column
    private int hours_Watched_perday;

}
