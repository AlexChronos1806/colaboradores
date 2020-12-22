package br.com.sulamerica.colaboradores.config.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class RestExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(RestExceptionHandler.class);

    @ExceptionHandler(ColaboradorException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponseList habdleColaboradorException(ColaboradorException exception) {
        log.error(exception.getMessage(), exception);
        return buildErroResponseList(exception.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponseList handleException(Exception exception) {
        log.error(exception.getMessage(), exception);
        return buildErroResponseList(exception.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ErrorResponseList handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        List<ErrorResponse> errorResponseList = exception.getBindingResult().getFieldErrors().stream()
                .map(fieldError -> buildErroResponse(fieldError.getDefaultMessage()))
                .collect(Collectors.toList());

        return new ErrorResponseList(errorResponseList);
    }

    private ErrorResponseList buildErroResponseList(String exceptionMessage) {
        return new ErrorResponseList(Arrays.asList(buildErroResponse(exceptionMessage)));
    }

    private ErrorResponse buildErroResponse(String exceptionMessage) {
        return new ErrorResponse(exceptionMessage, LocalDateTime.now().toString());
    }
}
