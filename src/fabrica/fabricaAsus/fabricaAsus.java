package fabrica.fabricaAsus;


import computadores.Computador;
import computadores.TIPO_COMPUTADOR;
import fabrica.IFabricaComputador;

public class fabricaAsus implements IFabricaComputador {

    public Computador criarComputador(TIPO_COMPUTADOR tipo) {
        Computador computador = null;
        switch (tipo) {
            case MESA: computador = new MesaAsus(); break;
            case NOTBOOK: computador = new NotbookAsus(); break;
            default: break;
        }
        return computador;
    }
}
