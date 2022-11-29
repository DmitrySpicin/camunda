package com.example.workflow.service;

import com.example.workflow.dto.TestDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.engine.variable.value.ObjectValue;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {
    private final RuntimeService runtimeService;

    public void startProcessByMessage(TestDto testDto) throws Exception {
        String text = testDto.getTest();
        runtimeService.createMessageCorrelation("create")
                .setVariable("test", text)
                .correlateWithResult();
    }
}
