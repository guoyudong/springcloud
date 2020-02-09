package com.sinovatio.oceanmind.datasource.provider;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "oceanmind-datasource")
public interface ConnectProvider {
}
