package douglas.dipe.adapters.in.config;

import douglas.dipe.adapters.out.repository.RoleRepository;
import douglas.dipe.adapters.out.repository.SchoolPersonRepository;
import douglas.dipe.domain.model.Role;
import douglas.dipe.domain.model.SchoolPerson;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Configuration
public class CoordinatorConfig implements CommandLineRunner {

    private RoleRepository roleRepository;
    private SchoolPersonRepository schoolPersonRepository;
    private BCryptPasswordEncoder passwordEncoder;

    public CoordinatorConfig(RoleRepository roleRepository,
                           SchoolPersonRepository schoolPersonRepository,
                           BCryptPasswordEncoder passwordEncoder) {
        this.roleRepository = roleRepository;
        this.schoolPersonRepository = schoolPersonRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        var role = roleRepository.findByName(Role.Values.COORDINATOR.name());

        var userCoordinator = schoolPersonRepository.findByUsername("admin");

        userCoordinator.ifPresentOrElse(
                user -> {
                    System.out.println("Pessoa escolar já existe.");
                },
                () -> {
                    var schoolPerson = new SchoolPerson();
                    schoolPerson.setUsername("admin");
                    schoolPerson.setPassword(passwordEncoder.encode("123"));
                    schoolPerson.setRoles(Set.of(role));
                    schoolPersonRepository.save(schoolPerson);
                }
        );
    }
}
