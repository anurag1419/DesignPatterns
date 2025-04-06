package org.example.Factory;

import org.example.Chair.Chair;
import org.example.Table.Table;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}
