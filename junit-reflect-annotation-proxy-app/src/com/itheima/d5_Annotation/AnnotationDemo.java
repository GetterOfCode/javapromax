package com.itheima.d5_Annotation;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationDemo {
    @Test
    public void parseClass(){
        Class c = BookStore.class;
        //Book l;
        if (c.isAnnotationPresent(Book.class)) {
            Book book = (Book)c.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.author()));

        }


    }
    @Test
    public void parseMethod() throws NoSuchMethodException {
        Class c = BookStore.class;
        Method method= c.getDeclaredMethod("test");
        if(method.isAnnotationPresent(Book.class)){
            Book declaredAnnotation = method.getDeclaredAnnotation(Book.class);
            System.out.println(declaredAnnotation.value());
            System.out.println(declaredAnnotation.price());
            System.out.println(Arrays.toString(declaredAnnotation.author()));


        }


    }
}
@Book(value = "《情深深雨蒙蒙》",price = 99.9,author = {"琼瑶","delei"})
class BookStore{
    @Book(value = "《三少爷的剑》",price = 399.9,author = {"古龙","熊耀华"})
    public void test(){

    }

}
