package douglas.dipe.adapters.in.dto;

import douglas.dipe.domain.enums.TypeSchoolPerson;
import douglas.dipe.domain.model.SchoolPerson;

public record SchoolPersonDTO(
        Long id,
        String cpf,
        String name,
        String telephone,
        String email,
        TypeSchoolPerson typeSchoolPerson
) {
    public SchoolPerson doSchoolPerson() {
        return new SchoolPerson(
                id,
                cpf,
                name,
                telephone,
                email,
                typeSchoolPerson
        );
    }
}