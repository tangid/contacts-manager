package com.fredericboisguerin.insa;

public class InvalidEmailException extends Exception {
    public InvalidEmailException(String mess)
    {
        super(mess);
    }
}
