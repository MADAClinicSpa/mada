package com.madaclinicspa.config;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfiguration {

    @Value("${mada.rest.template.connection.timeout}")
    private int restTemplateConnectTimeout;

    @Value("${mada.rest.template.connection.request.timeout}")
    private int restTemplateConnectRequestTimeout;

    @Value("${mada.rest.template.read.timeout}")
    private int restTemplateReadTimeout;

    @Bean
    public RestTemplate restTemplate() {
        HttpClient httpClient = HttpClientBuilder.create()
                .disableCookieManagement()
                .useSystemProperties()
                .build();
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setConnectTimeout(restTemplateConnectTimeout);
        requestFactory.setConnectionRequestTimeout(restTemplateConnectRequestTimeout);
        requestFactory.setReadTimeout(restTemplateReadTimeout);
        requestFactory.setHttpClient(httpClient);
        return new RestTemplate(requestFactory);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
