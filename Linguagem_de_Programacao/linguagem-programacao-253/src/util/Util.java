package util;

import java.util.Scanner;

public class Util {
    static Scanner ler = new Scanner(System.in);

    public static int solicitaInt(String msg){
        System.out.println(msg);
        return ler.nextInt();
    }

    public static String solicitaPalavra(String msg){
        System.out.println(msg);
        return ler.next();
    }

    public static void imprimeResultado(String resultado){
        System.out.print(resultado);
    }

    public static float solicitaNumeroDecimalFloat(String msg){
        System.out.println(msg);
        return ler.nextFloat();
    }
}

