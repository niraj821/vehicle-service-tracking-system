package com.tracking_system.vehicle_service_tracking_system.service;

import com.tracking_system.vehicle_service_tracking_system.entity.UserInfo;

import java.util.List;

public interface UserInfoService {

    UserInfo saveuserInfo(UserInfo userInfo);

    //read
    List<UserInfo> fetchUserInfoList();


    //update
    UserInfo updateUserInfo(UserInfo userInfo, Long userId);

    //delete
    void deleteUserInfoById(Long userId);

    UserInfo saveUserInfo(UserInfo userInfo);
}
