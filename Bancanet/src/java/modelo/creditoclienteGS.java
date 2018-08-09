
package modelo;


public class creditoclienteGS {
    
    private String creclidoc;
    private String credcodlinea;
    private String creditofecha;
    private String creditomonto;
    
    
    public creditoclienteGS (){
    
    }

    public creditoclienteGS(String creclidoc, String credcodlinea, String creditofecha, String creditomonto) {
        this.creclidoc = creclidoc;
        this.credcodlinea = credcodlinea;
        this.creditofecha = creditofecha;
        this.creditomonto = creditomonto;
    }

    public String getCreclidoc() {
        return creclidoc;
    }

    public void setCreclidoc(String creclidoc) {
        this.creclidoc = creclidoc;
    }

    public String getCredcodlinea() {
        return credcodlinea;
    }

    public void setCredcodlinea(String credcodlinea) {
        this.credcodlinea = credcodlinea;
    }

    public String getCreditofecha() {
        return creditofecha;
    }

    public void setCreditofecha(String creditofecha) {
        this.creditofecha = creditofecha;
    }

    public String getCreditomonto() {
        return creditomonto;
    }

    public void setCreditomonto(String creditomonto) {
        this.creditomonto = creditomonto;
    }

    
    
    
}
