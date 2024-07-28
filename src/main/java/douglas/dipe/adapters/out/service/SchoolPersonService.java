package douglas.dipe.adapters.out.service;

import douglas.dipe.adapters.in.dto.SchoolPersonDTO;
import douglas.dipe.adapters.out.repository.SchoolPersonRepository;
import douglas.dipe.domain.exception.EntityAlreadyExistsException;
import douglas.dipe.domain.model.SchoolPerson;
import douglas.dipe.domain.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolPersonService {
    private final SchoolPersonRepository schoolPersonRepository;

    public SchoolPersonService(SchoolPersonRepository schoolPersonRepository) {
        this.schoolPersonRepository = schoolPersonRepository;
    }

    public SchoolPerson saveSchoolPerson(SchoolPersonDTO schoolPersonDTO) {
        var existent = schoolPersonRepository.findByCpf(schoolPersonDTO.cpf());

        if (existent.isPresent()) {
            new EntityAlreadyExistsException("School person data already exists. Checking the possibility of update, please!");
        }
        return schoolPersonRepository.save(schoolPersonDTO.doSchoolPerson());
    }
    public Optional<Student> findByCPF(SchoolPersonDTO schoolPersonDTO){
        return schoolPersonRepository.findByCpf(schoolPersonDTO.cpf());
    }
    public List<SchoolPerson> findAll() {
        return (List<SchoolPerson>) schoolPersonRepository.findAll();
    }

    public Student updateStudent(Student student) {
        return null;
    }

    public void delete(SchoolPerson schoolPerson) {
        schoolPersonRepository.delete(schoolPerson);
    }
}
