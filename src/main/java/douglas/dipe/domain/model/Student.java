package douglas.dipe.domain.model;

import java.util.Date;

public class Student {
    private Long id;
    private Long registration;
    private String cpf;
    private String name;
    private Date birthday;
    private Address address;

    public Student(Long id, Long registration, String cpf, String name, Date birthday, Address address) {
        this.id = id;
        this.registration = registration;
        this.cpf = cpf;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRegistration() {
        return registration;
    }

    public void setRegistration(Long registration) {
        this.registration = registration;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
