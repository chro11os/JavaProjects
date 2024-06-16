package org.MainPackage;

import java.util.Scanner;

public class NameData {
    private String[][][] nameData;

    public NameData() {
        nameData = new String[2][3][4]; // Initializes the array with empty slots
    }

    public void inputData(String firstName, String lastName) {
        boolean added = false;
        for (int i = 0; i < nameData.length && !added; i++) {
            for (int j = 0; j < nameData[i].length && !added; j++) {
                for (int k = 0; k < nameData[i][j].length && !added; k++) {
                    if (nameData[i][j][k] == null) { // Find the next available slot
                        nameData[i][j][k] = firstName + " " + lastName;
                        added = true;
                    }
                }
            }
        }
        if (!added) {
            System.out.println("No available slot to add the name.");
        }
    }

    public void printData() {
        for (int i = 0; i < nameData.length; i++) {
            for (int j = 0; j < nameData[i].length; j++) {
                for (int k = 0; k < nameData[i][j].length; k++) {
                    if (nameData[i][j][k] != null) {
                        System.out.println("nameData[" + i + "][" + j + "][" + k + "] = " + nameData[i][j][k]);
                    }
                }
            }
        }
    }
}