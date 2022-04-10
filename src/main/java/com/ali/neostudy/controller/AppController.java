package com.ali.neostudy.controller;

import com.ali.neostudy.dto.CalcDto;
import com.ali.neostudy.entity.CalcEntity;
import com.ali.neostudy.service.AppService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AppController {

    private final AppService service;

    @PostMapping("add")
    ResponseEntity<CalcDto> addition(@RequestBody CalcEntity entity) {
        return ResponseEntity.ok(service.addition(entity));
    }

    @PostMapping("subtract")
    ResponseEntity<CalcDto> subtraction(@RequestBody CalcEntity entity) {
        return ResponseEntity.ok(service.subtraction(entity));
    }

    @PostMapping("multi")
    ResponseEntity<CalcDto> multiplication(@RequestBody CalcEntity entity) {
        return ResponseEntity.ok(service.multiplication(entity));
    }

    @PostMapping("divide")
    ResponseEntity<CalcDto> division(@RequestBody CalcEntity entity) {
        return ResponseEntity.ok(service.division(entity));
    }
}
