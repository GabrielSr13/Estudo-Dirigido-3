//Gabriel Silva Rosa
//INF-217U COMPUTAÇÃO PARALELA E DISTRIBUIDA :: 7º INF
//Estudo Dirigido III


package prova;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prova {

    public static String primeiraPassada(String pTexto) {
        String Result = "";
        char C;
        for (int i = 0; i < pTexto.length(); i++) {
            String resultado = pTexto.substring(i, i + 1);
            C = resultado.charAt(0);
            if ((int) C >= 65 && (int) C < 91) {

                C = (char) (C + 3);

            } else if ((int) C >= 97 && (int) C < 123) {

                C = (char) (C + 3);

            }

            Result = Result + C;

        }

        return Result;
    }

    public static String segundaPassada(String pTexto) {
        String Result = "";
        char C;
        for (int i = pTexto.length(); i > 0; i--) {
            String resultado = pTexto.substring(i - 1, i);
            C = resultado.charAt(0);
            Result = Result + C;

        }

        return Result;
    }

    public static String terceiraPassada(String pTexto) {
        String Result = "";
        char C;
        for (int i = 0; i < pTexto.length() / 2; i++) {
            String resultado = pTexto.substring(i, i + 1);
            C = resultado.charAt(0);
            Result = Result + C;

        }
        for (int i = pTexto.length() / 2; i < pTexto.length(); i++) {
            String resultado = pTexto.substring(i, i + 1);
            C = resultado.charAt(0);
            C = (char) (C - 1);
            Result = Result + C;

        }

        return Result;
    }

    public static void main(String[] args) throws IOException {
        int N, M;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        N = Integer.parseInt(in.readLine()) + 1;

        String Result = null;
        System.out.println("\n");
        for (int k = 1; k < N; k++) {
            String x = in.readLine();

            Result = primeiraPassada(x);
            Result = segundaPassada(Result);
            Result = terceiraPassada(Result);
            System.out.println(Result);

        }
    }

}
