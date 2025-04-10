package com.tracking_system.vehicle_service_tracking_system.controller;
import com.tracking_system.vehicle_service_tracking_system.entity.UserInfo;
import com.tracking_system.vehicle_service_tracking_system.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UserInfoController {
    @Autowired
        private UserInfoService userInfoService;

        // Save operation
        @PostMapping("/user")
        public UserInfo saveUserinfo(@RequestBody UserInfo userInfo) {
            return userInfoService.saveUserInfo(userInfo);
        }

        // Read operation
        @GetMapping("/users")
        public List<UserInfo> fetchUserInfoList() {
            return userInfoService.fetchUserInfoList();
        }

        // Update operation
       @PutMapping("/user/{id}")
        public UserInfo updateUserinfo(@RequestBody UserInfo userInfo, @PathVariable("id") Long userId) {
            return userInfoService.updateUserInfo(userInfo, userId);
        }

        // Delete operation
        @DeleteMapping("/user/{id}")
        public String deleteUserInfoById(@PathVariable("id")Long userid) {
            userInfoService.deleteUserInfoById(userid);
            return "Deleted Successfully";
        }
}

