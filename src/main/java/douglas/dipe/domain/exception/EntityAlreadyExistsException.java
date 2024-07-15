package douglas.dipe.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class EntityAlreadyExistsException extends Throwable {

    public EntityAlreadyExistsException(String s) {
    }

    public ProblemDetail toProblemDetail() {
        var detail = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        detail.setTitle("Student data already exists. Checking the possibility of update, please!");

        return detail;
    }
}
