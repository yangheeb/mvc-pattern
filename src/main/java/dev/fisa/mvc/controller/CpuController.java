package dev.fisa.mvc.controller;

import dev.fisa.mvc.service.CpuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class CpuController {

    private final CpuService cpuService;


    @GetMapping("/calc")
    public long calculate() {
        long result = cpuService.asyncLogic();
        return result;
    }

}