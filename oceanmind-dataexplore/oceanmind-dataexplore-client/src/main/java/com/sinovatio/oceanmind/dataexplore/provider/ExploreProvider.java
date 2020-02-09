package com.sinovatio.oceanmind.dataexplore.provider;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "oceanmind-dataexplore")
public interface ExploreProvider {
}
