package com.example;

public class App {

    public String giaiPhuongTrinhBac1(double a, double b) {
        if (a == 0 && b == 0) {
            return "VSN";
        } else if (a == 0 && b != 0) {
            return "VN";
        } else {
            double x = -b / a;
            return "CN: x = " + x;
        }
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.giaiPhuongTrinhBac1(2, -4));
    }
}