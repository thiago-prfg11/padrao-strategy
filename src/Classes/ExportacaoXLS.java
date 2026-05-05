package Classes;

import Interfaces.FormatoExportacao;

public class ExportacaoXLS implements FormatoExportacao {
    @Override
    public String exportar(String conteudo) {
        return "[XLS] " + conteudo;
    }
}
