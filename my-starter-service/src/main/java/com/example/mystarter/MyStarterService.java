package com.example.mystarter;

public class MyStarterService {

    private MyStarterProperties myStarterProperties;

    public String getDataBaseType(String name){
        String str = "hello "+name+" ,your dbType is "+ myStarterProperties.getDbType();
        System.out.println(str);
        return str;
    }

    public String getDataBaseUrl(){
        String url = myStarterProperties.getUrl();
        url = "the database's url here :"+url;
        System.out.println(url);
        return url;
    }

    public void setMyStarterProperties(MyStarterProperties myStarterProperties) {
        this.myStarterProperties = myStarterProperties;
    }
}
