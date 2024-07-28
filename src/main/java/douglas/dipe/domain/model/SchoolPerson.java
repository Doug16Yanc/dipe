package douglas.dipe.domain.model;

import douglas.dipe.adapters.in.dto.LoginRequest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.*;

public class SchoolPerson {
    private Long id;
    private String cpf;
    private String name;
    private String telephone;
    private String email;
    private String username;
    private String password;
    private Set<Role> roles;

    public SchoolPerson() {

    }

    public SchoolPerson(Long id, String name, String cpf, String telephone, String email, String username, String password, Set<Role> roles) {
        this.id = id;
        this.cpf = cpf;
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
    public boolean isLoginCorrect(LoginRequest loginRequest, PasswordEncoder passwordEncoder) {
        return passwordEncoder.matches(loginRequest.password(), this.password);
    }
}
