package com.strategyobject.training.controller;

import com.strategyobject.training.model.HsCode;
import com.strategyobject.training.model.Page;
import com.strategyobject.training.service.HsCodeService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hscodes")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class HsCodeController {

    HsCodeService hsCodeService;
    @GetMapping
    public ResponseEntity<Page<HsCode>> findAll(@RequestHeader(name="Authorization") String token,
                                                Pageable pageable) {
        return ResponseEntity.ok(hsCodeService.findAll(token, pageable));
    }
}
