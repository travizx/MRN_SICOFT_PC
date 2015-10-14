
package com.mx.teknei.mrn.utils;

import com.mx.teknei.mrn.dto.TramaErrorDTO;
import com.mx.teknei.mrn.dto.TramaOKDTO;
import javax.swing.JOptionPane;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 8/10/2015
 * @class DecodeTrama
 */
public class DecodeTrama {

    private final int NUM_DATA_ERROR = 2;
    private final int NUM_DATA_OK = 2;
    private TramaErrorDTO errorDTO;
    private TramaOKDTO okDTO;
    
    public DecodeTrama(String trama) {
        if(trama.contains("FATAL")){
            JOptionPane.showMessageDialog(null,"¡ERROR DE CONECCIÓN con SERVER!","Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } else if(trama.contains("ERROR")){
            String[] tramaSplit = trama.split(",");
            if(isCorrectDecoTramaERROR(tramaSplit) ){
                //Rellenar el DTO de INCIO
                try {
                    errorDTO = new TramaErrorDTO();
                    errorDTO.setERROR_INFO(tramaSplit[1]);
                } catch (Exception e) {
                    System.out.println("ERROR TRAMA:QUE MANDA UN ERROR con INFO."+this.getClass().getSimpleName());
                }
            }else{
                System.out.println("ERROR TRAMA:NO se descompone correctamente."+this.getClass().getSimpleName());
            }   
        } else if (trama.contains("OK")) {
            String[] tramaSplit = trama.split(",");
            if(isCorrectDecoTramaOK(tramaSplit) ){
                //Rellenar el DTO de INCIO
                try {
                    okDTO = new TramaOKDTO();
                    okDTO.setID_ITIN_INFO(tramaSplit[1]);
                } catch (Exception e) {
                    System.out.println("ERROR TRAMA:QUE MANDA UN ERROR con INFO."+this.getClass().getSimpleName());
                }
            }else{
                System.out.println("ERROR TRAMA:NO se descompone correctamente."+this.getClass().getSimpleName());
            }   
        }else{
            
        }
    }
    
    public final boolean isCorrectDecoTramaERROR(String[] decodecTRAMA){
        if(decodecTRAMA.length == NUM_DATA_ERROR){
            return true;    
        }else{
            return false;
        }
    }
    
    public final boolean isCorrectDecoTramaOK(String[] decodecTRAMA){
        if(decodecTRAMA.length == NUM_DATA_OK){
            return true;    
        }else{
            return false;
        }
    }

    public TramaErrorDTO getErrorDTO() {
        return errorDTO;
    }

    public TramaOKDTO getOkDTO() {
        return okDTO;
    }
    
    
    
}
