package com.sinovatio.oceanmind.datastandard.provider;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "oceanmind-datastandard")
public interface StandardProvider {
}
