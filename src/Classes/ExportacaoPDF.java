package Classes;

import Interfaces.FormatoExportacao;

public class ExportacaoPDF implements FormatoExportacao {
    @Override
    public String exportar(String conteudo) {
        return "[PDF] " + conteudo;
    }
}
