
package es.amosrosado.gastomilitarcsv;


public class GastoMilitar {
    
    private String nombrePais;
    private String codigo;
    private int año;
    private int gasto;
    
    public GastoMilitar() {
        
    }   
    
    public GastoMilitar(String GastoMilitar) {
        
    }
    
    public GastoMilitar(String nombrePais, int año) {
        this.nombrePais = nombrePais;
        this.año = año;
    }
    
    public String getNombrePais() {
        return nombrePais;
    }
    
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public int getAño() {
        return año;
    }
    
    public void setAño(int año) {
        this.año = año;
    }
    
    public int getGasto() {
        return gasto;
    }
    
    public void setGasto(int gasto) {
        this.gasto = gasto;
    }
    
    @Override
    public String toString() {
        String r = "";
        r += "Nombre: " + nombrePais + "\n";
        r += "Codigo: " + codigo + "\n";
        r += "Año: " + año + "\n";
        r += "Gasto Total: " + gasto + "\n";
        return r;
    }
}
