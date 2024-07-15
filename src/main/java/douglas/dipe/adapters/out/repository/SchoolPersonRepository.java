package douglas.dipe.adapters.out.repository;

import douglas.dipe.domain.model.SchoolPerson;
import douglas.dipe.domain.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SchoolPersonRepository extends MongoRepository<SchoolPerson, Long> {
    Optional<Student> findByCPF(String CPF);
}
