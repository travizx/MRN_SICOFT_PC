package com.mx.teknei.mrn.socket.tcp;

import com.mx.teknei.mrn.dto.TramaErrorDTO;
import com.mx.teknei.mrn.dto.TramaOKDTO;
import com.mx.teknei.mrn.utils.Configuration;
import com.mx.teknei.mrn.utils.DecodeTrama;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 23/09/2015
 * @class Socket
 */
public class SocketC {

    
    
    private DataInputStream in; //Respuesta de los Datos Recibidos
    private String msgSend; // Mensaje que se quiere enviar
    private String msgResponse;//Mensaje de respuesta del servidor
    private boolean msgOK;//Ok is true
    private TramaOKDTO OK_DTO;

    public SocketC(String msgSend) {
        this.msgSend = msgSend;
        this.msgResponse = null;
        this.msgOK = false;
        Socket socket = null; //Objeto Socket - comunication with Z230
        try {
            //Init Socket with Parameters
            socket = new Socket(Configuration.SOCKET_HOST, Integer.parseInt(Configuration.SOCKET_PORT));
            //Objeto de comunicación ****** Envío
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            //Enviar lo que tenga el por Parametro
            out.writeUTF(msgSend);
            System.out.println("IS CONECTED:" + socket.isConnected());
            //Objeto de Comunicacion ****** Recibido
            in = new DataInputStream(socket.getInputStream());
            msgResponse = in.readUTF();
            System.out.println("msgREsponde:"+msgResponse);
            checkResponse(msgResponse);
            socket.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            //Logger.getLogger(SocketC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            e.printStackTrace();
            //Logger.getLogger(SocketC.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

   

    public String getMsgSend() {
        return msgSend;
    }

    public void setMsgSend(String msgSend) {
        this.msgSend = msgSend;
    }

    private void checkResponse(String msgResponse) {
        if (this.msgResponse.contains("FATAL")) {
            DecodeTrama decodec = new DecodeTrama(msgResponse);
            msgOK = false;
        }else if(this.msgResponse.contains("ERROR")){
            DecodeTrama decodec = new DecodeTrama(msgResponse);
            TramaErrorDTO ERROR_DTO = decodec.getErrorDTO();
            System.out.println("ERROR QUE SE RECIBIO:"+ERROR_DTO.getERROR_INFO());
            JOptionPane.showMessageDialog(null,ERROR_DTO.getERROR_INFO(),"Mensaje de Información", JOptionPane.INFORMATION_MESSAGE);
            msgOK = false;
        }else if (this.msgResponse.contains("OK")) {
            DecodeTrama decodec = new DecodeTrama(msgResponse);
            OK_DTO = decodec.getOkDTO();
            System.out.println("TRAMA CORRECTA OK:"+OK_DTO.getID_ITIN_INFO());
            msgOK = true;
        }else if (this.msgResponse.contains("FIN")) {
            msgOK = true;
        }else{
             msgOK = false;
        }
    }

    public boolean sendOK() {
        return this.msgOK;
    }

    public String getMsgResponse() {
        return msgResponse;
    }

    public TramaOKDTO getOK_DTO() {
        return OK_DTO;
    }
    

}
