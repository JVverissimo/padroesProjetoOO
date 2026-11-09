package fabrica.fabricaAsus;

import computadores.Computador;
import computadores.TIPO_COMPUTADOR;
import fabrica.IFabricaComputador;

public class fabricaAsus implements IFabricaComputador{

    public Computador criarComptutador(TIPO_COMPUTADOR){
        Computador computador;
        switch (TIPO_COMPUTADOR){
            case MESA: computador = nem MesaAsus(); break;
            case NOTBOOK : computador = new NotbookAsus(); break;
        }
    }  
}