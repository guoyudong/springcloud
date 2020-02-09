package com.sinovatio.oceanmind.authority;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="oceanmind-authority")
public interface UserProvider {
}
