
package es.amosrosado.gastomilitarcsv;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Gastos {
    
    
    private ArrayList<GastoMilitar> listaGastos = new ArrayList();
    
    public ArrayList<GastoMilitar> GetListaGastos() {
        return listaGastos;
    }
    @XmlElement(name = "gasto")
    public void setListaGastos (ArrayList<GastoMilitar> listaGastos) {
        this.listaGastos = listaGastos;
    }
}
