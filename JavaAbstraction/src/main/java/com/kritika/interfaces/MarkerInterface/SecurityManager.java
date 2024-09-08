package com.kritika.interfaces.MarkerInterface;

public class SecurityManager {
    public static void checkPermission(Object obj){
        if(obj instanceof PermissionCheck){
            System.out.println("Permission Check is required for "+ obj.getClass().getSimpleName());
        }
        else {
            System.out.println("No Permission is required for "+ obj.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        SensitiveData sensitiveData = new SensitiveData("Top Secret");
        checkPermission(sensitiveData);

        String value = "Hello Permission";
        checkPermission(value);
    }
}
