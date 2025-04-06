package org.example.Factory;

import org.example.Chair.Chair;
import org.example.Chair.NormalChair;
import org.example.Table.Table;
import org.example.Table.NormalTable;

public class NormalFurniture implements FurnitureFactory {

    public Chair createChair() {
        return new NormalChair();
    }

    public Table createTable() {
        return new NormalTable();
    }

}
