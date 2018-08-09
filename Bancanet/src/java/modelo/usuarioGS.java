package modelo;


public class usuarioGS {
    
    //variables globales de constructor
    private String usudoc;
    private String usunom;
    private String usuclave;
    private String usuroot;
    
    //constructor vacio
    public usuarioGS(){
    }

    public usuarioGS(String usudoc, String usunom, String usuclave, String usuroot) {
        this.usudoc = usudoc;
        this.usunom = usunom;
        this.usuclave = usuclave;
        this.usuroot = usuroot;
    }

    public String getUsudoc() {
        return usudoc;
    }

    public void setUsudoc(String usudoc) {
        this.usudoc = usudoc;
    }

    public String getUsunom() {
        return usunom;
    }

    public void setUsunom(String usunom) {
        this.usunom = usunom;
    }

    public String getUsuclave() {
        return usuclave;
    }

    public void setUsuclave(String usuclave) {
        this.usuclave = usuclave;
    }

    public String getUsuroot() {
        return usuroot;
    }

    public void setUsuroot(String usuroot) {
        this.usuroot = usuroot;
    }
    
    
    
}
