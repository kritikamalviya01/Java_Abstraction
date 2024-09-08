package com.kritika.interfaces.MarkerInterface;

public class SensitiveData implements PermissionCheck{
    private String data;

    SensitiveData(String data){
        this.data = data;
    }
}
