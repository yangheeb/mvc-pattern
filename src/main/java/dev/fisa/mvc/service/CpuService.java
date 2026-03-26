package dev.fisa.mvc.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CpuService {

    public long asyncLogic() {
        long result = 0;

        for (int i = 0; i < 1_000_000_000; i++) {
            result += i;
        }
        return result;
    }
}