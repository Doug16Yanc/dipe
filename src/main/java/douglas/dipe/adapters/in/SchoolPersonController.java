package douglas.dipe.adapters.in;

import douglas.dipe.adapters.in.dto.SchoolPersonDTO;
import douglas.dipe.adapters.in.dto.StudentDTO;
import douglas.dipe.adapters.out.service.SchoolPersonService;
import douglas.dipe.adapters.out.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolPersonController {
    private SchoolPersonService schoolPersonService;

    @Autowired
    public SchoolPersonController(SchoolPersonService schoolPersonService) {
        this.schoolPersonService = schoolPersonService;
    }

    @PostMapping("/schoolPersons")
    public ResponseEntity<String> createSchoolPerson(@RequestBody SchoolPersonDTO schoolPersonDTO) {
        var person = schoolPersonService.saveSchoolPerson(schoolPersonDTO);

        return ResponseEntity.status(HttpStatus.OK).body("School person : " + person.getName() + ", CPF: " +
                person.getCpf());
    }
}
