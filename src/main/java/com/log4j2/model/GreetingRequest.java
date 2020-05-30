package com.log4j2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class GreetingRequest implements Serializable {

    private String message;
}
