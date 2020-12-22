package br.com.sulamerica.colaboradores.config.exception;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ErrorResponseList {

    @JsonProperty("errorList")
    private List<ErrorResponse> erros;

    public  ErrorResponseList(List<ErrorResponse> erros) {
        this.erros = erros;
    }

    public List<ErrorResponse> getErros() {
        return erros;
    }

    public void setErros(List<ErrorResponse> erros) {
        this.erros = erros;
    }
}
