package com.adminclient.info;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class AppInfo implements InfoContributor {


    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("version","1.0.RELEASE");
        builder.withDetail("project","admin-order");
    }
}