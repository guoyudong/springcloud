package com.sinovatio.oceanmind.datasource.provider;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "oceanmind-datafactory")
public interface FlowProvider {
}
