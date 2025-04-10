package com.tracking_system.vehicle_service_tracking_system.service;

import com.tracking_system.vehicle_service_tracking_system.entity.UserInfo;
import com.tracking_system.vehicle_service_tracking_system.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public abstract class UserInfoServiceImpl implements UserInfoService{
    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo saveUserInfo(UserInfo userInfo) {
        return userInfoRepository.save(userInfo);
    }

    @Override
    public List<UserInfo> fetchUserInfoList() {

        return (List<UserInfo>) userInfoRepository.findAll();
    }

    @Override
    public UserInfo updateUserInfo(UserInfo userInfo, Long userId) {

        UserInfo vsts = userInfoRepository.findById(userId).get();


        if (Objects.nonNull(userInfo.getUserName()) && !"".equalsIgnoreCase(userInfo.getUserName())) {
            vsts.setUserName(userInfo.getUserName());
        }

        return userInfoRepository.save(vsts);
    }

    @Override
    public void deleteUserInfoById(Long userId) {

        userInfoRepository.deleteById(userId);
    }
}
