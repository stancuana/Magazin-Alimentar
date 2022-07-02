package com.company;

import java.util.ArrayList;

public class Raft extends Aliment{

    private ArrayList<Aliment> alimente;


    public Raft(ArrayList<Aliment> alimente){
        this.alimente=alimente;
    }

    @Override
    public boolean verificareDataDeExpirare(String dataDeExpirareValida) {
        for(Aliment aliment:alimente){

            return aliment.verificareDataDeExpirare(dataDeExpirareValida);
        }
       return true;
    }

    @Override
    public void modificareGramaj(String gramajNou) {
        for(Aliment aliment:alimente){

            aliment.modificareGramaj(gramajNou);
        }
    }

    public void afisare(){

        for(Aliment aliment:alimente){

            System.out.println(aliment.toString());
        }
    }
}
