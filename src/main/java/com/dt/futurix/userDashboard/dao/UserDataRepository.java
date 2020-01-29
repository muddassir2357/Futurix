package com.dt.futurix.userDashboard.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserDataRepository extends JpaRepository<UserDataTable,Integer> {

    UserDataTable findByUserId(int userId);
}
