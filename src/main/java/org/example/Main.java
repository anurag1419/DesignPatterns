package org.example;

import org.example.Chair.Chair;
import org.example.Table.Table;
import org.example.Factory.FurnitureFactory;
import org.example.Factory.ModernFurniture;
import org.example.Factory.NormalFurniture;

public class Main {
    public static void main(String[] args) {
        // Create Factory of Modern furniture
        FurnitureFactory modernFurnitureFactory =  new ModernFurniture();
        Chair modernChair = modernFurnitureFactory.createChair();
        modernChair.useChair();

        Table table = modernFurnitureFactory.createTable();
        table.useTable();

        // Create Normal furniture
        FurnitureFactory normalFurnitureFactory = new NormalFurniture();
        Chair normalChair = normalFurnitureFactory.createChair();
        normalChair.useChair();

        Table normalTable = normalFurnitureFactory.createTable();
        normalTable.useTable();

    }
}