package org.lesson.springsoapeg.controller;

import jakarta.validation.Valid;
import org.lesson.springsoapeg.model.AppResponse;
import org.lesson.springsoapeg.model.RequestBody;
import org.lesson.springsoapeg.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class Controller {
    private final Service appService;

    @Autowired
    public Controller(Service appService) {
        this.appService = appService;
    }

    @PostMapping("/add")
    public ResponseEntity<AppResponse> addPost(@Valid @org.springframework.web.bind.annotation.RequestBody RequestBody requestBody) {
        return appService.getAddResult(requestBody.getIntA(), requestBody.getIntB());
    }
}
