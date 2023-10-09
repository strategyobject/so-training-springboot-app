package com.strategyobject.training.service;

import com.strategyobject.training.model.LoginDto;
import com.strategyobject.training.restclient.SoTraderClient;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthService {
    SoTraderClient soTraderClient;

    public ResponseEntity<Object> authenticate(LoginDto loginDto) {
        return soTraderClient.authenticate(loginDto);
    }
}
