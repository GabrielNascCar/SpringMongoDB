package org.gabriel.workshopmongo.services.exception;

public class ObjectNotFoundExecption extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ObjectNotFoundExecption(String message) {
        super(message);
    }

}
