package com.fisc.contribuable.service;

public class UsernameAlreadyUsedException extends RuntimeException {

    public UsernameAlreadyUsedException() {
        super("Login name already used!");
    }

}
