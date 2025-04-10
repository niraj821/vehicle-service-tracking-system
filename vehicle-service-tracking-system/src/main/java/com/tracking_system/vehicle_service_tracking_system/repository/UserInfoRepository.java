package com.tracking_system.vehicle_service_tracking_system.repository;

import com.tracking_system.vehicle_service_tracking_system.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {

}
