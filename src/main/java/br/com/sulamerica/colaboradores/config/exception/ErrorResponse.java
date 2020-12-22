package br.com.sulamerica.colaboradores.config.exception;

public class ErrorResponse {

    private String mensagem;
    private String data;

    public ErrorResponse(String mensagem, String data) {
        this.mensagem = mensagem;
        this.data = data;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
