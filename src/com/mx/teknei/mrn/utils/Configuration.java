/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.mrn.utils;

import java.io.IOException;
import java.util.Properties;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 1/10/2015
 * @class Configuration
 */
public class Configuration {

    private Properties properties;
    /**
     * Configuration file name
     */
    private final static String CONFIG_FILE_NAME = "Configuration.properties";

    public  static String SOCKET_HOST;

    public  static String SOCKET_PORT;
    
    public  static String RUTAS_IN_BD;
    
    public  static String VALOR_VISTA_INIT;
    
    public  static String VALOR_VISTA_CLOSE;

    private Configuration() {
        this.properties = new Properties();
        try {
            properties.load(Configuration.class.getClassLoader().getResourceAsStream(CONFIG_FILE_NAME));
        } catch (IOException ioex) {
            ioex.printStackTrace();
//            Logger.getLogger(Configuration.class.getName()).log(Level.SEVERE, null, ioex);
        }
        SOCKET_HOST = this.properties.getProperty("socket_host");
        SOCKET_PORT = this.properties.getProperty("socket_port");
        RUTAS_IN_BD = this.properties.getProperty("rutas_bd_pc");
        VALOR_VISTA_INIT = this.properties.getProperty("var_init_lb");
        VALOR_VISTA_CLOSE = this.properties.getProperty("var_close_lb");
        

    }

    public static Configuration getInstance() {
        return ConfigurationHolder.INSTANCE;
    }

    private static class ConfigurationHolder {

        private static final Configuration INSTANCE = new Configuration();
    }

    /**
     * Retorna la propiedad de configuración solicitada
     *
     * @param key
     * @return
     */
    public String getProperty(String key) {
        return this.properties.getProperty(key);
    }
}
