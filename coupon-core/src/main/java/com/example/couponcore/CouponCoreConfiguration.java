package com.example.couponcore;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@EnableJpaAuditing
@ComponentScan
@EnableAutoConfiguration
public class CouponCoreConfiguration {
}
