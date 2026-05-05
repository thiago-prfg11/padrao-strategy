package Teste;

import Classes.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RelatorioTest {

    private Relatorio relatorio;

    @BeforeEach
    void setUp() {
        relatorio = new Relatorio("Vendas do mês de abril");
    }

    @Test
    void deveExportarEmPDF() {
        relatorio.setFormato(new ExportacaoPDF());
        assertEquals("[PDF] Vendas do mês de abril", relatorio.exportar());
    }

    @Test
    void deveExportarEmCSV() {
        relatorio.setFormato(new ExportacaoCSV());
        assertEquals("[CSV] Vendas do mês de abril", relatorio.exportar());
    }

    @Test
    void deveExportarEmXLS() {
        relatorio.setFormato(new ExportacaoXLS());
        assertEquals("[XLS] Vendas do mês de abril", relatorio.exportar());
    }

    @Test
    void deveExportarEmXLSX() {
        relatorio.setFormato(new ExportacaoXLSX());
        assertEquals("[XLSX] Vendas do mês de abril", relatorio.exportar());
    }

    @Test
    void deveExportarEmTXT() {
        relatorio.setFormato(new ExportacaoTXT());
        assertEquals("[TXT] Vendas do mês de abril", relatorio.exportar());
    }

    @Test
    void deveTrocarFormatoEmTempoDeExecucao() {
        relatorio.setFormato(new ExportacaoPDF());
        assertEquals("[PDF] Vendas do mês de abril", relatorio.exportar());

        relatorio.setFormato(new ExportacaoXLSX());
        assertEquals("[XLSX] Vendas do mês de abril", relatorio.exportar());

        relatorio.setFormato(new ExportacaoTXT());
        assertEquals("[TXT] Vendas do mês de abril", relatorio.exportar());
    }
}
