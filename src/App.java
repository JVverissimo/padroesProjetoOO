import computadores.Computador;
import computadores.TIPO_COMPUTADOR;
import fabrica.IFabricaComputador;
import fabrica.fabricaAsus.fabricaAsus;
import fabrica.fabricaLG.fabricaLG;

public class App {
    public static void main(String[] args) throws Exception {
        IFabricaComputador fabricaAsus = new fabricaAsus();
        IFabricaComputador fabricaLG = new fabricaLG();

        Computador mesaAsus = fabricaAsus.criarComputador(TIPO_COMPUTADOR.MESA);
        Computador notebookAsus = fabricaAsus.criarComputador(TIPO_COMPUTADOR.NOTBOOK);

        Computador mesaLG = fabricaLG.criarComputador(TIPO_COMPUTADOR.MESA);
        Computador notebookLG = fabricaLG.criarComputador(TIPO_COMPUTADOR.NOTBOOK);

        System.out.println(mesaAsus.getNome() + " - R$ " + mesaAsus.getValor());
        System.out.println(notebookAsus.getNome() + " - R$ " + notebookAsus.getValor());
        System.out.println(mesaLG.getNome() + " - R$ " + mesaLG.getValor());
        System.out.println(notebookLG.getNome() + " - R$ " + notebookLG.getValor());
    }
}
