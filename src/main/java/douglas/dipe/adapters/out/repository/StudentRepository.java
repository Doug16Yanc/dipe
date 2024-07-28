package douglas.dipe.adapters.out.repository;

import douglas.dipe.domain.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends MongoRepository <Student, Long> {
    Optional<Student> findByCpf(String cpf);
    Optional<Student> findByRegistration(Long registration);
}
