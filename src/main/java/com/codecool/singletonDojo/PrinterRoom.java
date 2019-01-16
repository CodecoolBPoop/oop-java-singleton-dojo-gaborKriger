package com.codecool.singletonDojo;

import java.util.ArrayList;
import java.util.List;

public class PrinterRoom {

    private static PrinterRoom instance = null;

    private List<Printer> printers = new ArrayList<>();

    private PrinterRoom() {
        for (int i = 0; i < 10; i++) {
            Printer printer = new Printer(i + 1);
            printers.add(printer);
        }
    }

    public static PrinterRoom getInstance(){
        if (instance == null) {
            instance = new PrinterRoom();
        }
        return instance;
    }

    public void printPrinterID() {
        for (Printer printer : printers) {
            System.out.println("Printer ID: " + printer.getId());
        }
    }
}
