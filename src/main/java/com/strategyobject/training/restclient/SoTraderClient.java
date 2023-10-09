package com.strategyobject.training.restclient;

import com.strategyobject.training.model.HsCode;
import com.strategyobject.training.model.LoginDto;
import com.strategyobject.training.model.Page;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(
        name = "soTrader",
        url = "${soTrader.ribbon.listOfServers:}")
public interface SoTraderClient {
    @RequestMapping(value = "/references/hsCodes", method = RequestMethod.GET, produces = {"application/json"})
    Page<HsCode> fetchHsCodes(@RequestHeader(value = "Authorization", required = true) String authorizationHeader,
                              @RequestParam Integer page, @RequestParam Integer size);

    @RequestMapping(value = "/auth/token", method = RequestMethod.POST, produces = {"application/json"})
    @Headers("Content-Type: application/json")
    ResponseEntity<Object> authenticate(@RequestBody LoginDto loginDto);
}
