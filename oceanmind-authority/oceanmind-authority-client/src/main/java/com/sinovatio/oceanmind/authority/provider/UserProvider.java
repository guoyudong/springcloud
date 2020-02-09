package com.sinovatio.oceanmind.authority.provider;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="oceanmind-authority")
public interface UserProvider {
}
