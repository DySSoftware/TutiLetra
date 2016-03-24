package com.dyssoft.tutiletra;

import java.util.ArrayList;

/**
 * Created by SantiagoGonzalez on 04/03/2016.
 */
public class Utils {

    //Variables para usar en otras clases
    //private  ArrayList<String> abecedario;
    private static String[] abc = {"A","B","C","D","E","F","G","H","I",
            "J","K","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    /*public static final ArrayList obtenerAbecedario(){
        ArrayList<String> abcCompleto = new ArrayList<>();
        for (int i = 0; i < abc.length;){
            abcCompleto.add(abc[i]);
        }
        return abcCompleto;
    }

*/
        public static String letraAzar() {
            int numeroAzar = (int) (Math.random()*26);
            String devolver = "";
            switch (numeroAzar){
                case 0:
                    devolver = "A";
                    break;
                case 1:
                    devolver = "B";
                    break;
                case 2:
                    devolver = "C";
                    break;
                case 3:
                    devolver = "D";
                    break;
                case 4:
                    devolver = "E";
                    break;
                case 5:
                    devolver = "F";
                    break;
                case 6:
                    devolver = "G";
                    break;
                case 7:
                    devolver = "H";
                    break;
                case 8:
                    devolver = "I";
                    break;
                case 9:
                    devolver = "J";
                    break;
                case 10:
                    devolver = "K";
                    break;
                case 11:
                    devolver = "L";
                    break;
                case 12:
                    devolver = "M";
                    break;
                case 13:
                    devolver = "N";
                    break;
                case 14:
                    devolver = "O";
                    break;
                case 15:
                    devolver = "P";
                    break;
                case 16:
                    devolver = "Q";
                    break;
                case 17:
                    devolver = "R";
                    break;
                case 18:
                    devolver = "S";
                    break;
                case 19:
                    devolver = "T";
                    break;
                case 20:
                    devolver = "U";
                    break;
                case 21:
                    devolver = "V";
                    break;
                case 22:
                    devolver = "W";
                    break;
                case 23:
                    devolver = "X";
                    break;
                case 24:
                    devolver = "Y";
                    break;
                case 25:
                    devolver = "Z";
                    break;
            }
            return devolver;
        }

        public static int numero(int nfinal){
            int numero = (int) (Math.random() *nfinal);
            return numero;

        }
    }


