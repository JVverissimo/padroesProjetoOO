package fabrica.fabricaLG;

import computadores.Computador;
import computadores.TIPO_COMPUTADOR;
import fabrica.IFabricaComputador;

public class fabricaLG implements IFabricaComputador {

    public Computador criarComputador(TIPO_COMPUTADOR tipo) {
        Computador computador = null;
        switch (tipo) {
            case MESA: computador = new MesaLG(); break;
            case NOTBOOK: computador = new NotbookLG(); break;
            default: break;
        }
        return computador;
    }
}
