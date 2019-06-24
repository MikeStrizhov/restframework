package com.mgs.restframework.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.logging.LogManager;

@Component
public class RestService {

    protected Logger log = LoggerFactory.getLogger(this.getClass());
    ResponseEntity<String> responce;

    public void executeGetByUrl(String url) {
        RestTemplate restTemplate = new RestTemplate();
        responce = restTemplate.getForEntity(url, String.class);
    }

    public boolean isResponceCode200Ok() {
        if (responce == null){
            return false;
        }
        boolean result = responce.getStatusCode() ==  HttpStatus.OK;
        return result;
    }
}
