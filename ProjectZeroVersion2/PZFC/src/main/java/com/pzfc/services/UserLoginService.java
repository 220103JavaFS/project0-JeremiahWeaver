package com.pzfc.services;

public class UserLoginService {

    public boolean login(String username, String password){
        if(username.equals("RookieCollector")&&password.equals("703yd@rb10")){
            return true;
        }else{
            return false;
        }
    }
}
