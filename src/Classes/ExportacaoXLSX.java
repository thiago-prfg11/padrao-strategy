package Classes;

import Interfaces.FormatoExportacao;

public class ExportacaoXLSX implements FormatoExportacao {
    @Override
    public String exportar(String conteudo) {
        return "[XLSX] " + conteudo;
    }
}
