package com.sinovatio.oceanmind.dataasset.provider;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "oceanmind-dataasset")
public interface ResourceProvider {
}
