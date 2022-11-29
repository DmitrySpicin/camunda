package com.example.workflow.controller;

import com.example.workflow.dto.TestDto;
import com.example.workflow.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("getInfo")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @SneakyThrows
    @PostMapping
    public void getParams(@RequestBody TestDto testDto) {
        testService.startProcessByMessage(testDto);
    }
}
