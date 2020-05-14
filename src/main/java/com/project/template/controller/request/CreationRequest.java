package com.project.template.controller.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreationRequest {

    /*Example:
    private long field1;

    private String field2;

    private String field3;

    @JsonCreator
    public CreationRequest(
            @JsonProperty("field1") long field1,
            @JsonProperty("field2") String field2,
            @JsonProperty("field3") String field3) {

        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    } */
}
