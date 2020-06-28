package com.tasks;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("qa")
@RequestMapping("/qa")
public class QaController {

    @GetMapping()
    public String tasks() {
        return "Hello, World from QA";
    }
}
