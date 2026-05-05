package Classes;

import Interfaces.FormatoExportacao;

public class Relatorio {

    private FormatoExportacao formato;
    private String conteudo;

    public Relatorio(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setFormato(FormatoExportacao formato) {
        this.formato = formato;
    }

    public String exportar() {
        return formato.exportar(conteudo);
    }
}
