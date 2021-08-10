package com.annotation.www;

import java.util.ArrayList;
@FunctionalInterface
interface Test{
    void show();
    //void show2();
}

class FatherAssets {
    public void car() {
        System.out.println("This is fathers car");
    }
}
class SonAssets extends  FatherAssets{
    @Deprecated
    public void show(){

    }
    @SuppressWarnings("unchecked")
    @Override
    public  void car(){
        ArrayList obj = new ArrayList();
        System.out.println("This is sons car");
    }
}
public class PredefinedAnnotation {
    public  static  void main(String[] args){
       SonAssets son = new SonAssets();
        son.car();
        son.show();

    }
}
