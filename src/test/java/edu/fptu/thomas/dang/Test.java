package edu.fptu.thomas.dang;

import repository.csv.CSVDataMiner;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test
{
    public static void main(String[] args) {
        CSVDataMiner.getInstance().openFile("./import/companies.csv");
        CSVDataMiner.getInstance().startMonitoring();
    }
}
