package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(50,true);
        System.out.println(printer.getPages());
        int pagesPrinted = printer.printPages(4);
        System.out.println(pagesPrinted);
        pagesPrinted = printer.printPages(10);
        System.out.println(pagesPrinted);


    }
}
