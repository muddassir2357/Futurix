package com.dt.futurix.userDashboard.dao;

import com.dt.futurix.userDashboard.model.EpisodePlayed;
import com.dt.futurix.userDashboard.model.HoursWatched;
import com.dt.futurix.userDashboard.model.UserAnalyticsData;
import com.dt.futurix.userDashboard.model.UserPersonalData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataRepositoryService {

    @Autowired
    UserDataRepository userDataRepository;

    public UserPersonalData getUserPersonalData(int userId) {
        UserDataTable userDataTable = userDataRepository.findByUserId(userId);
        UserPersonalData userPersonalData = extractUserPersonalData(userDataTable);
        return userPersonalData;
    }


    public UserAnalyticsData getUserAnalyticsData(int userId) {
        UserDataTable userDataTable = userDataRepository.findByUserId(userId);
        UserAnalyticsData userAnalyticsData = extractUserAnalyticslData(userDataTable);
        return userAnalyticsData;
    }

    private UserAnalyticsData extractUserAnalyticslData(UserDataTable userDataTable) {
        if (userDataTable == null)
            return new UserAnalyticsData();
        UserAnalyticsData userAnalyticsData = new UserAnalyticsData().setEpisodePlayed(new EpisodePlayed().setPerday(userDataTable.getEpisode_Watched_perday())
                .setPermonth(userDataTable.getEpisode_Watched_permonth()).setPerweek(userDataTable.getEpisode_Watched_perweek())
                .setTotal(userDataTable.getEpisode_watched_total())).setHoursWatched(new HoursWatched().setTotal(userDataTable.getHours_watched_total())
                .setPerday(userDataTable.getHours_Watched_perday()).setPermonth(userDataTable.getHours_Watched_permonth()).setPerweek(userDataTable.getHours_Watched_perweek()));

        return userAnalyticsData;
    }


    private UserPersonalData extractUserPersonalData(UserDataTable userDataTable) {
        if (userDataTable == null)
            return new UserPersonalData();
        UserPersonalData userPersonalData = new UserPersonalData().setEmailId(userDataTable.getEmail_id())
                .setName(userDataTable.getName()).setRegisteredNumber(userDataTable.getRegistered_number());
        return userPersonalData;
    }
}
