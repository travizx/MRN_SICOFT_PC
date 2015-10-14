
package com.mx.teknei.mrn.utils;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 1/10/2015
 * @class ConvertInTrama
 */
public class Convert{

    private String id_Ruta;
    private String id_Vehi;
    private String horaAct;
    private String TRAMA;

    public Convert(String id_Ruta, String id_Vehi, String horaAct) {
        this.id_Ruta = id_Ruta;
        this.id_Vehi = id_Vehi;
        this.horaAct = horaAct;
        TRAMA = convertirInTrama();
    }

    public Convert() {
        TRAMA = convertirInTrama();
    }
    
    private final String convertirInTrama(){
        if(id_Ruta == null || id_Ruta.equals("") ){
            System.out.println("ID_RUTA:"+id_Ruta);
            throw new RuntimeException("NO HAY DATO ID RUTA_"+this.getClass().getSimpleName()+"_convertirInTrama" );
        }else if(id_Vehi == null || id_Vehi.equals("")){
            System.out.println("ID_VEH:"+id_Vehi);
            throw new RuntimeException("NO HAY DATO ID RUTA_"+this.getClass().getSimpleName()+"_convertirInTrama" );
        }else if (horaAct == null || horaAct.equals("")) {
            System.out.println("HORA ACTUAL:"+horaAct);
            throw new RuntimeException("NO HAY DATO ID RUTA_"+this.getClass().getSimpleName()+"_convertirInTrama" );
        }else{
            return "INIT,"+id_Ruta+","+id_Vehi+","+horaAct;
        }
    }

    public String getTRAMA() {
        return TRAMA;
    }

    public void setTRAMA(String TRAMA) {
        this.TRAMA = TRAMA;
    }
    
    public String getId_Ruta() {
        return id_Ruta;
    }

    public void setId_Ruta(String id_Ruta) {
        this.id_Ruta = id_Ruta;
    }

    public String getId_Vehi() {
        return id_Vehi;
    }

    public void setId_Vehi(String id_Vehi) {
        this.id_Vehi = id_Vehi;
    }

    public String getHoraAct() {
        return horaAct;
    }

    public void setHoraAct(String horaAct) {
        this.horaAct = horaAct;
    }
    
    
    

    
}
