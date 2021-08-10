package com.annotation.www;

import java.lang.annotation.*;
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String os() default  "Symbian";
    int version() default 6;
}
@SmartPhone(os = "Android" ,version = 5)
class samsungMobile{
    String color;
    float size;
    public samsungMobile(String color, float size) {
        this.color = color;
        this.size = size;
    }
}
public class CustomAnnotation {
    public  static  void main(String[] args){
       samsungMobile sam = new samsungMobile("black",6.3f);
       Class c = sam.getClass();
        Annotation an = c.getAnnotation(SmartPhone.class);
        SmartPhone s =(SmartPhone)an;
        System.out.println(s.os());
    }
}
