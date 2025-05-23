package com.the_moment.hello_app.global.time;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.TimeZone;

@Slf4j
@Configuration
public class TimeZoneConfig {

    @PostConstruct
    public void timeZoneConfig() {
        try {
            System.setProperty("user.timezone", "Asia/Seoul");
            TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
            log.info("Default timezone set to Asia/Seoul: {}", LocalDateTime.now());
        } catch (Exception e) {
            log.warn("Failed to set default timezone: ", e);
        }
    }
}