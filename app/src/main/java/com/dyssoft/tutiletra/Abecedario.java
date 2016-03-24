package com.dyssoft.tutiletra;

import java.util.ArrayList;

/**
 * Created by SantiagoGonzalez on 04/03/2016.
 */
public class Abecedario {
    private int i =0;
    private int size = 0;
    private ArrayList<String> abecedario;


    public Abecedario(){
        llenarAbecedario();
        size = abecedario.size();
    }

    public String getLetraAlAzar(){
        int n = 0;
        String letra = null;
        n = (int) (Math.random()*size-1);
        if (abecedario.get(n) == null){
            System.out.println("nulo");
        }else{
            letra = abecedario.remove(n);
        }
        size = abecedario.size();
        i++;
		/*ArrayList <String> temporal = abecedario;
		for (int i = 0; i < )*/
        System.out.println(letra);
        return letra;
    }

    public int numeroAlAzar(){
        int n = 0;
        n = (int) (Math.random()*abecedario.size()+01);
        return n;
    }

    public boolean estaVacio(){
        if (abecedario.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public void llenarAbecedario(){
        abecedario = new ArrayList<String>();
        abecedario.add("A");
        abecedario.add("B");
        abecedario.add("C");
        abecedario.add("D");
        abecedario.add("E");
        abecedario.add("F");
        abecedario.add("G");
        abecedario.add("H");
        abecedario.add("I");
        abecedario.add("J");
        abecedario.add("K");
        abecedario.add("L");
        abecedario.add("M");
        abecedario.add("N");
        abecedario.add("O");
        abecedario.add("P");
        abecedario.add("Q");
        abecedario.add("R");
        abecedario.add("S");
        abecedario.add("T");
        abecedario.add("U");
        abecedario.add("V");
        abecedario.add("W");
        abecedario.add("X");
        abecedario.add("Y");
        abecedario.add("Z");
    }
}
