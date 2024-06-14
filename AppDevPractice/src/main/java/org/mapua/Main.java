package org.mapua;
public class Main {
    public class NameData {
        String[][][] NameData = new String[2][3][4];
        public NameData() {
            NameData[0][0][0] = "Alice";
            NameData[0][0][1] = "Bob";
            NameData[0][0][2] = "Charlie";
            NameData[0][0][3] = "David";

            NameData[0][1][0] = "Eve";
            NameData[0][1][1] = "Frank";
            NameData[0][1][2] = "Grace";
            NameData[0][1][3] = "Hank";

            NameData[0][2][0] = "Ivy";
            NameData[0][2][1] = "Jack";
            NameData[0][2][2] = "Karen";
            NameData[0][2][3] = "Leo";
        }
    }

    public void main(String[] args) {
        NameData data = new NameData();
        System.out.println("Clear Data Output");

        System.out.println(data.NameData[0][2][0]);
    }
}