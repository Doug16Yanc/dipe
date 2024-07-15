package douglas.dipe.adapters.out.service;

import douglas.dipe.adapters.in.dto.StudentDTO;
import douglas.dipe.adapters.out.repository.StudentRepository;
import douglas.dipe.domain.exception.EntityAlreadyExistsException;
import douglas.dipe.domain.model.Student;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(StudentDTO studentDTO) throws EntityAlreadyExistsException {
        var existent = studentRepository.findByCPF(studentDTO.cpf());

        if (existent.isPresent()) {
            throw new EntityAlreadyExistsException("Student data already exists. Checking the possibility of update, please!");
        }
        return studentRepository.save(studentDTO.doStudent());
    }
    public Optional<Student> findByRegistration(StudentDTO studentDTO){
        return studentRepository.findByRegistration(studentDTO.registration());
    }
    public Optional<Student> findByCPF(StudentDTO studentDTO){
        return studentRepository.findByCPF(studentDTO.cpf());
    }
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

    public Student updateStudent(Student student) {
        return null;
    }

    public void delete(Student student) {
        studentRepository.delete(student);
    }
}
