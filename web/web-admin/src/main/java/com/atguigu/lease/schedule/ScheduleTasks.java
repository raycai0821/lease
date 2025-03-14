package com.atguigu.lease.schedule;


import com.atguigu.lease.model.entity.LeaseAgreement;
import com.atguigu.lease.model.enums.LeaseStatus;
import com.atguigu.lease.web.admin.service.LeaseAgreementService;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduleTasks {

    @Autowired
    private LeaseAgreementService leaseAgreementService;




    @Scheduled(cron = "0 0 0 * * *")
    public void checkLeaseStatus(){

        LambdaUpdateWrapper<LeaseAgreement> lambdaUpdateWrapper = new LambdaUpdateWrapper();
        lambdaUpdateWrapper.le(LeaseAgreement::getLeaseEndDate, new Date());
        lambdaUpdateWrapper.in(LeaseAgreement::getStatus, LeaseStatus.SIGNED,LeaseStatus.WITHDRAWING);
        lambdaUpdateWrapper.set(LeaseAgreement::getStatus, LeaseStatus.EXPIRED);
        leaseAgreementService.update(lambdaUpdateWrapper);

    }
}
