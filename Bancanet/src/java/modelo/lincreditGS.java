
package modelo;


public class lincreditGS {
    
    private String codlinea;
    private String nomlinea;
    private String montlinea;
    
    public lincreditGS(){
    
    }

    public lincreditGS(String codlinea, String nomlinea, String montlinea) {
        this.codlinea = codlinea;
        this.nomlinea = nomlinea;
        this.montlinea = montlinea;
    }

    public String getCodlinea() {
        return codlinea;
    }

    public void setCodlinea(String codlinea) {
        this.codlinea = codlinea;
    }

    public String getNomlinea() {
        return nomlinea;
    }

    public void setNomlinea(String nomlinea) {
        this.nomlinea = nomlinea;
    }

    public String getMontlinea() {
        return montlinea;
    }

    public void setMontlinea(String montlinea) {
        this.montlinea = montlinea;
    }
    
    
    
}
