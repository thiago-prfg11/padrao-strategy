package Classes;

import Interfaces.FormatoExportacao;

public class ExportacaoTXT implements FormatoExportacao {
    @Override
    public String exportar(String conteudo) {
        return "[TXT] " + conteudo;
    }
}
