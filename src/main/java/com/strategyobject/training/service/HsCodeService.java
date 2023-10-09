package com.strategyobject.training.service;

import com.strategyobject.training.model.HsCode;
import com.strategyobject.training.model.Page;
import com.strategyobject.training.restclient.SoTraderClient;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class HsCodeService {

    SoTraderClient soTraderClient;

    public Page<HsCode> findAll(String token, Pageable pageable) {
        log.info("Fetching hs codes");
        return soTraderClient.fetchHsCodes(token, pageable.getPageNumber(), pageable.getPageSize());
    }
}
