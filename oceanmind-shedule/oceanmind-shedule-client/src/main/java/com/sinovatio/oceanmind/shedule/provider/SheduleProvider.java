package com.sinovatio.oceanmind.shedule.provider;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "oceanmind-shedule")
public interface SheduleProvider {
}
