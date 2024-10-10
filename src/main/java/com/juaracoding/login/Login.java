package com.juaracoding.login;

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

    // forgotPassword()
    //check username, newPassword, confirmPassword
    public String forgotPassword(String username, String password, String newPassword, String confirmPassword){
        if (username.equals("admin")) {
            if (newPassword.equals(confirmPassword)) {
                return "Password berhasil diubah";
            } else {
                return "Username tidak terdaftar";
            }

        } else {
            return "Username tidak terdaftar";
        }
    }
}
