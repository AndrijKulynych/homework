package com.mateakademia.homework6.task12;

public class PerimetrException extends Exception {
    public PerimetrException () {
        super();
    }

    public PerimetrException (String message) {
        super(message);
    }

    public PerimetrException (String message, Throwable cause) {
        super(message, cause);
    }

    public PerimetrException (Throwable cause) {
        super(cause);
    }

    protected PerimetrException (String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
