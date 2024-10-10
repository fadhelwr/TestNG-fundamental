package com.juaracoding;

public class Login  {
    public String loginUser(String username, String password) {
            if (username.equals("admin") && password.equals("123456")){
                return "Login berhasil";
            } else {
                return "Invalid login";
            }
    }

    //showlogo
    public boolean showLogo(String path){
        return path.equals("C:\\Picture\\image.png");
    }
}
