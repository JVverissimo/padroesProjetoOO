package fabrica;

import computadores.Computador;
import computadores.TIPO_COMPUTADOR;

public interface IFabricaComputador {
    public Computador criarComputador(TIPO_COMPUTADOR tipo);
}
