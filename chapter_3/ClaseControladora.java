package chapter_3;

import java.util.Scanner;

public class ClaseControladora {

    public static void main(String[] args) {

        ClaseControlada cc = new ClaseControlada();
        cc.setNombres("Alexander Yosimar");
        cc.setApellidos("Cervantes Pineda");

        System.out.printf("Hola, me llamo %s %s", cc.getNombres(), cc.getApellidos());

    }
}
