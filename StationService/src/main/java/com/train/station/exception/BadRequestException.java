package com.train.station.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

    private static final long serialVersionUID = 5289144417746598292L;

	public BadRequestException() {
        super();
    }

    public BadRequestException(String message) {
        super(message);
    }

}
