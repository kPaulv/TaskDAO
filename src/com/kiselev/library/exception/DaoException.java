package com.kiselev.library.exception;

public class DaoException extends Exception{
    public DaoException() {
        super();
    }

    public DaoException(String msg) {
        super(msg);
    }

    public DaoException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public DaoException(Throwable cause) {
        super(cause);
    }

}
