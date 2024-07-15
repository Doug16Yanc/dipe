package douglas.dipe.domain.model;

import douglas.dipe.domain.enums.TypeSchoolPerson;

public class SchoolPerson {
    private Long id;
    private String cpf;
    private String name;
    private String telephone;
    private String email;
    private TypeSchoolPerson typeSchoolPerson;


    public SchoolPerson(Long id, String name, String cpf, String telephone, String email, TypeSchoolPerson typeSchoolPerson) {
        this.id = id;
        this.cpf = cpf;
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.typeSchoolPerson = typeSchoolPerson;
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

    public TypeSchoolPerson getTypeSchoolPerson() {
        return typeSchoolPerson;
    }

    public void setTypeSchoolPerson(TypeSchoolPerson typeSchoolPerson) {
        this.typeSchoolPerson = typeSchoolPerson;
    }
}
