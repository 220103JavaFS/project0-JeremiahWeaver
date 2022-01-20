package com.pzfc.models;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UserDTO<toChapter1> {

    public String username;
    public String password;

    MessageDigest md;

    {
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

}


