package com.sinovatio.oceanmind.datafactory.provider;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "oceanmind-datafactory")
public interface FlowProvider {
}
