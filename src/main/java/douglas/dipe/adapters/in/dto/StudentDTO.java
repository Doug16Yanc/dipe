package douglas.dipe.adapters.in.dto;

import douglas.dipe.domain.model.Address;
import douglas.dipe.domain.model.Student;

import java.util.Date;

public record StudentDTO(
        Long id,
        Long registration,
        String cpf,
        String name,
        Date birthday,
        Address address) {
    public Student doStudent() {
        return new Student(
                id,
                registration,
                cpf,
                name,
                birthday,
                address
        );
    }
}
