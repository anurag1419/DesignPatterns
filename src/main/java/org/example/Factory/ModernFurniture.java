package org.example.Factory;

import org.example.Chair.Chair;
import org.example.Chair.ModernChair;
import org.example.Table.Table;
import org.example.Table.ModernTable;

public class ModernFurniture implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }


}
