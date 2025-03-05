package oop2;

public class Main {
    public static void main(String[] args) {

        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        System.out.println("Stock: " + stock.name + " (" + stock.symbol + ")");
        System.out.println("Oldingi narxi: $" + stock.previousClosingPrice);
        System.out.println("Hozirgi narxi: $" + stock.currentPrice);
        System.out.printf("Narx ozgarish foizi: %.2f%% ",stock.getChangePercent());
    }
}