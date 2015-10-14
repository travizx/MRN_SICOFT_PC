/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.mrn.view;

import com.mx.teknei.mrn.dto.TramaOKDTO;
import com.mx.teknei.mrn.socket.tcp.SocketC;
import com.mx.teknei.mrn.utils.Configuration;
import com.mx.teknei.mrn.utils.Convert;
import com.mx.teknei.pc.lib.entities.SfmoReceNave;
import com.mx.teknei.pc.lib.entities.SfpcCata;
import com.mx.teknei.pc.lib.entities.SfpfItin;
import com.mx.teknei.pc.lib.service.IRecpNavService;
import com.mx.teknei.pc.lib.service.ISfpcCataService;
import com.mx.teknei.pc.lib.service.ISfpfITINService;
import com.mx.teknei.pc.lib.service.imp.RecpNavService;
import com.mx.teknei.pc.lib.service.imp.SfpcCataService;
import com.mx.teknei.pc.lib.service.imp.SfpfITINService;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 */
public class SelectRutaFrame extends javax.swing.JFrame {

    /**
     * Creates new form SelectRutaFrame
     */
    public SelectRutaFrame() {
        Configuration.getInstance();
        initBDInformation();
        initComponents();
        itinVentanaStart();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConsolaCond = new javax.swing.JPanel();
        AvisoLabel = new javax.swing.JLabel();
        RLimonesButton = new javax.swing.JButton();
        RDiagonalButton = new javax.swing.JButton();
        RMuseoButton = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        CloseItiButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

        ConsolaCond.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consola del Conductor", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        ConsolaCond.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        AvisoLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AvisoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AvisoLabel.setText(Configuration.VALOR_VISTA_INIT);
        AvisoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        RLimonesButton.setText("LIMONES");
        RLimonesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RLimonesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RLimonesButtonActionPerformed(evt);
            }
        });

        RDiagonalButton.setText("DIAGONAL");
        RDiagonalButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RDiagonalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDiagonalButtonActionPerformed(evt);
            }
        });

        RMuseoButton.setText("MUSEO");
        RMuseoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RMuseoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RMuseoButtonActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        CloseItiButton.setText("CERRAR");
        CloseItiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseItiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsolaCondLayout = new javax.swing.GroupLayout(ConsolaCond);
        ConsolaCond.setLayout(ConsolaCondLayout);
        ConsolaCondLayout.setHorizontalGroup(
            ConsolaCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AvisoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ConsolaCondLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ConsolaCondLayout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addGroup(ConsolaCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CloseItiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RLimonesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RDiagonalButton, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(RMuseoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(247, 247, 247))
        );
        ConsolaCondLayout.setVerticalGroup(
            ConsolaCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsolaCondLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(AvisoLabel)
                .addGap(23, 23, 23)
                .addComponent(RLimonesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RDiagonalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(RMuseoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CloseItiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(Salir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConsolaCond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConsolaCond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     * @param textButton Texto que contiene adentro el boton.
     * @return true - acepto
     * @return false - cancelo
     */
    private boolean ConfirmBox(String textButton) {
        Object[] optionsPanel = {"Aceptar", "Cancelar"};
        int checkConfirmDialog = JOptionPane.showOptionDialog(this,
                "¿Está seguro de inciar el recorrido de " + textButton + "?",
                "Confirmación para el Conductor",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE, null,
                optionsPanel, optionsPanel[1]);
        if (checkConfirmDialog == JOptionPane.YES_OPTION) {
            return true;
        } else if (checkConfirmDialog == JOptionPane.NO_OPTION) {
            return false;
        } else {
            return false;
        }

    }

    private void itinVentanaStart() {
        //Pintar Boton SALIR
        Salir.setVisible(false);
        //Buscar Si hay abierto un itinerario en PC_ABORDO(por si se apaga el PC)
        SfpfITINService itiService = new SfpfITINService();
        SfpfItin itinENTY = itiService.BuscarUltimoIti();
        if (itinENTY != null) {
            if (itinENTY.getIdEsta() == 2) {
                System.out.println("-Itinerario INACTIVO");
                AvisoLabel.setText(Configuration.VALOR_VISTA_INIT);
                RDiagonalButton.setVisible(true);
                RLimonesButton.setVisible(true);
                RMuseoButton.setVisible(true);
                CloseItiButton.setVisible(false);
            } else {
                //Si hay un ITIN ACTIVO
                System.out.println("-Itinerario ACTIVO");
                AvisoLabel.setText(Configuration.VALOR_VISTA_CLOSE);
                RDiagonalButton.setVisible(false);
                RLimonesButton.setVisible(false);
                RMuseoButton.setVisible(false);
                CloseItiButton.setVisible(true);
            }

        } else {
            System.out.println("-SIN itinerario EXISTENTE");
            //Si hay un ITIN ACTIVO
            System.out.println("--ESTA ACTIVO UN ITIN---");
            AvisoLabel.setText(Configuration.VALOR_VISTA_INIT);
            RDiagonalButton.setVisible(true);
            RLimonesButton.setVisible(true);
            RMuseoButton.setVisible(true);
            CloseItiButton.setVisible(false);
        }
    }

    private void initBDInformation() {
        //Guardar las 3 Rutas que existen
        ISfpcCataService cataService = new SfpcCataService();
        listaCataRuta = cataService.BuscarCodCata(Configuration.RUTAS_IN_BD);
        //Checa que si existan en la BD  por lo menos estas Datos de RUTAS
        if (listaCataRuta == null) {
            System.out.println("NO HAY DATOS: No hay Datos correspondientes en un Catalogo. Favor de verificar_" + this.getClass().getSimpleName() + "_initInformation");
        }
        //Guardar el id_Vehiculo que esta RECV_NAVE
        IRecpNavService recpNavService = new RecpNavService();
        objRecNave = recpNavService.UltimoReceNave();
    }

    private String getDateActually() {
        Date dateLimonesAcept = new Date();
        return String.valueOf(dateLimonesAcept.getTime());
    }

    private String findIDRuta(String buttonClicked) {
        String temp = null;
        for (SfpcCata cataRuta : listaCataRuta) {
            if (buttonClicked.equals(cataRuta.getCodCort()) || cataRuta.getCodCort().startsWith(buttonClicked)) {
                temp = cataRuta.getDesCort().replace(" ", "");
            }
        }
        return temp;
    }

    private String findIDVehi() {
        return String.valueOf(objRecNave.getSfvhVehi().getIdVehi());
    }

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_SalirActionPerformed

    private void RLimonesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RLimonesButtonActionPerformed
        // Accion del Boton Limones
        if (ConfirmBox(RLimonesButton.getText())) {
            System.out.println("-----OPRIMIO LIMONES-------");
            //Oprimio Aceptar ... cambia de panel y envia INFO al Listener
            Convert convertTrama = new Convert(findIDRuta(RLimonesButton.getText()), findIDVehi(), getDateActually());
            SocketC sockeClient = new SocketC(convertTrama.getTRAMA());
            System.out.println("TRAMA:" + convertTrama.getTRAMA());
            System.out.println("OK:" + sockeClient.sendOK());
            if (sockeClient.sendOK()) {
                //Guardar ITINIERARIO EN BD
                TramaOKDTO OK_DTO = sockeClient.getOK_DTO();
                SfpfItin newItin = new SfpfItin();
                System.out.println("--Reelleno SfpfItin");
                try {
                    newItin.setIdItin(Integer.parseInt(OK_DTO.getID_ITIN_INFO()));
                    newItin.setIdEsta(1);//ITINERARIO ACTIVO
                    newItin.setIdTipo(3);//MODO AUTOMATICO
                    newItin.setIdConSis(1);
                    newItin.setUsrCrea("SICOFT");
                    newItin.setFchCrea(new Date());
                    ISfpfITINService itiService = new SfpfITINService();
                    itiService.AgregarITINACTIVO(newItin);
                    System.out.println("---SE CREO ITIN CORRECTAMENTE EN BD IN PC ");
                } catch (Exception e) {
                    System.out.println("ERROR AL CONVERTIR LOS DATOS y AGREGAR ITIN" + e.getMessage());
                }
                //Cambiar de Panel y obtener sus valores de dimensiones
                AvisoLabel.setText(Configuration.VALOR_VISTA_CLOSE);
                RDiagonalButton.setVisible(false);
                RLimonesButton.setVisible(false);
                RMuseoButton.setVisible(false);
                CloseItiButton.setVisible(true);
                CloseItiButton.setEnabled(false);
                this.revalidate();
                this.repaint();
                desactivarBotonClose = true;
                System.out.println("desactivarBotonClose:" + desactivarBotonClose);   
            }
        }
    }//GEN-LAST:event_RLimonesButtonActionPerformed

    private void RDiagonalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDiagonalButtonActionPerformed
        // Acción del Boton de Diagonal
        if (ConfirmBox(RDiagonalButton.getText())) {
            System.out.println("-----OPRIMIO DIAGONAL-------");
            //Oprimio Aceptar ... cambia de panel y envia INFO al Listener
            Convert convertTrama = new Convert(findIDRuta(RDiagonalButton.getText()), findIDVehi(), getDateActually());
            SocketC sockeClient = new SocketC(convertTrama.getTRAMA());
            System.out.println("TRAMa:" + convertTrama.getTRAMA());
            System.out.println("OK:" + sockeClient.sendOK());
            if (sockeClient.sendOK()) {
                //Guardar ITINIERARIO EN BD
                TramaOKDTO OK_DTO = sockeClient.getOK_DTO();
                SfpfItin newItin = new SfpfItin();
                System.out.println("--Reelleno SfpfItin");
                try {
                    newItin.setIdItin(Integer.parseInt(OK_DTO.getID_ITIN_INFO()));
                    newItin.setIdEsta(1);//ITINERARIO ACTIVO
                    newItin.setIdTipo(3);//MODO AUTOMATICO
                    newItin.setIdConSis(1);
                    newItin.setUsrCrea("SICOFT");
                    newItin.setFchCrea(new Date());
                    ISfpfITINService itiService = new SfpfITINService();
                    itiService.AgregarITINACTIVO(newItin);
                    System.out.println("---SE CREO ITIN CORRECTAMENTE EN BD IN PC ");
                } catch (Exception e) {
                    System.out.println("ERROR AL CONVERTIR LOS DATOS y AGREGAR ITIN" + e.getMessage());
                }
                //Cambiar de Panel y obtener sus valores de dimensiones
                AvisoLabel.setText(Configuration.VALOR_VISTA_CLOSE);
                RDiagonalButton.setVisible(false);
                RLimonesButton.setVisible(false);
                RMuseoButton.setVisible(false);
                CloseItiButton.setVisible(true);
                CloseItiButton.setEnabled(false);
                this.revalidate();
                this.repaint();
                desactivarBotonClose = true;
                System.out.println("desactivarBotonClose:" + desactivarBotonClose);
            }

        }


    }//GEN-LAST:event_RDiagonalButtonActionPerformed

    private void activarBotonClose() {
        CloseItiButton.setEnabled(true);
        this.revalidate();
        this.repaint();
    }

    private static void tiempo() {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {

                    Thread.sleep(2000);
                } catch (Exception e) {
                    System.out.println("Error en el Tiempo de tu Programa");
                } finally {
                    activoTiempo = false;
                }
            }
        }).start();

    }
    private void RMuseoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RMuseoButtonActionPerformed
        // Accción del Boton de Museo
        if (ConfirmBox(RMuseoButton.getText())) {
            System.out.println("-----OPRIMIO MUSEO-------");
            //Oprimio Aceptar ... cambia de panel y envia INFO al Listener
            Convert convertTrama = new Convert(findIDRuta(RMuseoButton.getText()), findIDVehi(), getDateActually());

            SocketC sockeClient = new SocketC(convertTrama.getTRAMA());
            System.out.println("TRAMa:" + convertTrama.getTRAMA());
            System.out.println("OK:" + sockeClient.sendOK());
            if (sockeClient.sendOK()) {
                //Guardar ITINIERARIO EN BD
                TramaOKDTO OK_DTO = sockeClient.getOK_DTO();
                SfpfItin newItin = new SfpfItin();
                System.out.println("--Reelleno SfpfItin");
                try {
                    newItin.setIdItin(Integer.parseInt(OK_DTO.getID_ITIN_INFO()));
                    newItin.setIdEsta(1);//ITINERARIO ACTIVO
                    newItin.setIdTipo(3);//MODO AUTOMATICO
                    newItin.setIdConSis(1);
                    newItin.setUsrCrea("SICOFT");
                    newItin.setFchCrea(new Date());
                    ISfpfITINService itiService = new SfpfITINService();
                    itiService.AgregarITINACTIVO(newItin);
                    System.out.println("---SE CREO ITIN CORRECTAMENTE EN BD IN PC ");
                } catch (Exception e) {
                    System.out.println("ERROR AL CONVERTIR LOS DATOS y AGREGAR ITIN" + e.getMessage());
                }
                //Cambiar de Panel y obtener sus valores de dimensiones
                AvisoLabel.setText(Configuration.VALOR_VISTA_CLOSE);
                RDiagonalButton.setVisible(false);
                RLimonesButton.setVisible(false);
                RMuseoButton.setVisible(false);
                CloseItiButton.setVisible(true);
                CloseItiButton.setEnabled(false);
                this.revalidate();
                this.repaint();
                desactivarBotonClose = true;
                System.out.println("desactivarBotonClose:" + desactivarBotonClose);
            }
        }
    }//GEN-LAST:event_RMuseoButtonActionPerformed

    private void CloseItiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseItiButtonActionPerformed
        // Accion del Boton CERRAR
        //Buscar el ultimo ITIN
        SfpfITINService itiService = new SfpfITINService();
        SfpfItin itinENTY = itiService.BuscarUltimoIti();
        String id_itin = "0";
        if (itinENTY != null) {
            //Relleno itinENTITY

            //Obtengo itin ID
            id_itin = String.valueOf(itinENTY.getIdItin());
            /////////////SOCKET
            //Envia informacion del cierre de itinerario
            SocketC sockeClient = new SocketC("CLOSE," + findIDVehi() + "," + id_itin + "," + new Date().getTime());
            System.out.println("++TRAMA:" + sockeClient.getMsgSend());
            System.out.println("++OK:" + sockeClient.sendOK());
            if (sockeClient.sendOK()) {
                //Borro de la BD el ITIN
                itiService.EliminarITINActivo(itinENTY);
                //Cambiar de Panel y obtener sus valores de dimensiones
                CloseItiButton.setVisible(false);
                RDiagonalButton.setVisible(true);
                RLimonesButton.setVisible(true);
                RMuseoButton.setVisible(true);
                AvisoLabel.setText(Configuration.VALOR_VISTA_INIT);
                this.revalidate();
                this.repaint();
                System.out.println("---Cierro Itinerario");
            }
        } else {
            System.out.println("ERROR INCONSISTENCIA SI NO HAY INTIN EN BD");
        }


    }//GEN-LAST:event_CloseItiButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelectRutaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectRutaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectRutaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectRutaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        ventaFrame = new SelectRutaFrame();

        vista = new Thread(new Runnable() {
            public void run() {
                ventaFrame.setVisible(true);
            }
        });
        vista.start();
        Thread hiloVigila = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {
                        //                    System.out.println("WHILE");
                        Thread.sleep(4176000);//Tiempo de que espera el boton de CERRAR a Activarse
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SelectRutaFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (desactivarBotonClose) {
                        ventaFrame.activarBotonClose();
                        desactivarBotonClose = false;

                    }
                }
            }
        });
        hiloVigila.start();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvisoLabel;
    private javax.swing.JButton CloseItiButton;
    private javax.swing.JPanel ConsolaCond;
    private javax.swing.JButton RDiagonalButton;
    private javax.swing.JButton RLimonesButton;
    private javax.swing.JButton RMuseoButton;
    private javax.swing.JButton Salir;
    // End of variables declaration//GEN-END:variables
    private List<SfpcCata> listaCataRuta;
    private SfmoReceNave objRecNave;
    private String realTime;
    private static boolean activoTiempo = true;
    private static boolean desactivarBotonClose = false;
    private static SelectRutaFrame ventaFrame;
    private static Thread vista;

}
