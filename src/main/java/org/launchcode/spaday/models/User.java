package org.launchcode.spaday.models;

import javax.validation.constraints.*;

public class User {

    @NotBlank(message = "Username is required!")
    @Size(min = 5, max = 15)
    private String username;

    @Email(message = "Must be a proper Email!")
    private String email;

    @NotBlank(message = "Password is required!")
    @Size(min = 6, message = "Password must be 6 characters or longer!")
    private String password;

    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
