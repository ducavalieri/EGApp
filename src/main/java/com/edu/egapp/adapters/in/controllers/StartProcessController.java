package com.edu.egapp.adapters.in.controllers;

import com.edu.egapp.application.ports.in.StartProcessInputPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartProcessController {

    final private StartProcessInputPort startProcessInputPort;

    public StartProcessController(StartProcessInputPort startProcessInputPort) {
        this.startProcessInputPort = startProcessInputPort;
    }

    @GetMapping("/start")
    public String startProcess() throws Exception {
        startProcessInputPort.execute();
        return "Process started";
    }
}
