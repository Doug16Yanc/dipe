package douglas.dipe.domain.exception;

public class SchoolPersonNotFoundException extends RuntimeException{

    public SchoolPersonNotFoundException(Long id) {
        super("%d não encontrado.".formatted(id));
    }
}
