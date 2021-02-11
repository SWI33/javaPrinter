package com.company;

public class Printer {

     private int tonerLevel;
    private boolean duplex;
     private int pages;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >=1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pages = pages;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount <= 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return  this.tonerLevel;
        } else  {
            return -1;
        }
    }

    public int printPages(int printedPages) {
        int pagesToPrint = (pages/2) + (pages % 2);
        if(this.duplex) {
            pagesToPrint /=2;
            System.out.println("printing in duplex");
        }
        this.pages += printedPages;
        return pagesToPrint;
    }

    public int getPages() {
        return pages;
    }
}
