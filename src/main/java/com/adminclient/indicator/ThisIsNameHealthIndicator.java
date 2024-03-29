package com.adminclient.indicator;


import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class ThisIsNameHealthIndicator implements HealthIndicator {


    @Override
    public Health health() {
        int errorCode = check(); // perform some specific health check
        if (errorCode != 0) {
            return Health.down().
                    withDetail("msg","error service").
                    withDetail("code",500).
                    build();
        }
        return Health.up().build();
    }

    private int check() {
        return 0;
    }
}