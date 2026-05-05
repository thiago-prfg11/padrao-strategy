package Classes;

import Interfaces.FormatoExportacao;

public class ExportacaoCSV implements FormatoExportacao {
    @Override
    public String exportar(String conteudo) {
        return "[CSV] " + conteudo;
    }
}
