package exception;
import domain.Response;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class CommonControllerAdvice {


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Response<String> handleException(Exception exception) {
        return new Response<String>(ErrorCode.UNKNOW_ERROR, "unkonw error");
    }

}
