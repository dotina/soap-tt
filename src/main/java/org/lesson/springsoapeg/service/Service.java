package org.lesson.springsoapeg.service;

import org.lesson.springsoapeg.model.Add;
import org.lesson.springsoapeg.model.AddResponse;
import org.lesson.springsoapeg.model.AppResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ws.client.core.WebServiceTemplate;

@org.springframework.stereotype.Service
public class Service {
    private final WebServiceTemplate webServiceTemplate;

    @Autowired
    public Service(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public ResponseEntity<AppResponse> getAddResult(int intA, int intB) {
        AddResponse response = add(intA,intB);
        return ResponseEntity.ok(new AppResponse(response.getAddResult()));
    }

    private AddResponse add(int intA, int intB) {
        return (AddResponse) webServiceTemplate.marshalSendAndReceive(new Add(intA,intB));
    }
}
