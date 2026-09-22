package com.edu.egapp.config;

import com.edu.egapp.application.core.usecase.GetTasksUseCase;
import com.edu.egapp.application.ports.in.StartProcessInputPort;
import com.edu.egapp.application.ports.out.GetUrlDocumentServiceOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GetTaskConfig {

    @Bean
    public StartProcessInputPort startProcessInputPort(
            GetUrlDocumentServiceOutputPort getUrlDocumentServiceOutputPort) {
        return new GetTasksUseCase(getUrlDocumentServiceOutputPort);
    }
}
