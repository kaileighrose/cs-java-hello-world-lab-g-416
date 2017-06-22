package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        String response;
        Double version;
        response = System.getProperty("java.specification.version");
        version = Double.parseDouble(response);
        System.out.println(version);
        return version;
    }

    public static void main(String[] args) {
        getVersion();
    }
}
