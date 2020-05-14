package com.project.template.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "api/v1/endpoint")
@RestController
public class Controller {

    /*Example:
    @Autowired
    protected SomeService someService;

    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Response> doThing(@RequestBody @Valid CreationRequest creationRequest) {

        Response userResponse = userService.methodThatDealsWith(creationRequest);

        return ResponseEntity
                .status(201)
                .body(Response);
    }*/
}
