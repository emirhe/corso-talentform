package com.oop.interfaces;

public class ClassWithInterface implements Interface {
	
	String article;
    double price;


    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public static void main(String[] args) {


        ClassWithInterface testInterface = new ClassWithInterface();

        testInterface.setArticle("T-Shirt");
        testInterface.setPrice(10.50);

        System.out.println(testInterface.getArticle());
        System.out.println(testInterface.getPrice());

    }


}
