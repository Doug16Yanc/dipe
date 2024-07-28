package douglas.dipe.adapters.out.repository;

import douglas.dipe.domain.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends MongoRepository<Role, Long> {
    Role findByName(String name);
}