package douglas.dipe.domain.exception;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(Long matricula) {
        super("Estudante de %d não encontrado.".formatted(matricula));
    }
}
