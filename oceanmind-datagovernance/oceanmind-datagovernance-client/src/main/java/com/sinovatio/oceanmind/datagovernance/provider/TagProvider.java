package com.sinovatio.oceanmind.datagovernance.provider;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "oceanmind-datagovernance")
public interface TagProvider {
}
