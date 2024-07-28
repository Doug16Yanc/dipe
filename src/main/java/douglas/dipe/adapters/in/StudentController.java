package douglas.dipe.adapters.in;

import douglas.dipe.adapters.in.dto.StudentDTO;
import douglas.dipe.adapters.out.service.StudentService;
import douglas.dipe.domain.model.Student;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public ResponseEntity<String> createStudent(@RequestBody StudentDTO studentDTO) {
        var student = studentService.saveStudent(studentDTO);

        return ResponseEntity.status(HttpStatus.OK).body("Student " + student.getName() + ", registration " +
                student.getRegistration() + ", CPF : " + student.getCpf());
    }

    /*
    @GetMapping("/vehicles/{cpf}")
    public ResponseEntity<String> findStudentByCpf(@PathVariable("cpf") String cpf) {
        Optional<Student> studentFound = studentService.findByCPF(cpf);

        if (studentFound.isPresent()) {
            var student = studentFound.get();
            return ResponseEntity.status(HttpStatus.OK).body("Student " + student.getCpf() + " " +
                    "found successfully!");
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/vehicles/{registration}")
    public ResponseEntity<String> findStudentByCPF(@PathVariable("registration") Long registration) {
        Optional<Student> studentFound = studentService.findByRegistration(registration);

        if (studentFound.isPresent()) {
            var student = studentFound.get();
            return ResponseEntity.status(HttpStatus.OK).body("Student " + student.getRegistration() + " " +
                    "found successfully!");
        }
        else {
            return ResponseEntity.notFound().build();
        }
    } */
}
