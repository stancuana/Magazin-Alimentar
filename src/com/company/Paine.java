package com.company;

public class Paine extends Aliment{


    public Paine(String numeAliment, String gramaj, String dataDeExpirare) {
        super(numeAliment, gramaj, dataDeExpirare);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean verificareDataDeExpirare(String dataDeExpirareValida) {
        return super.verificareDataDeExpirare(dataDeExpirareValida);
    }

    @Override
    public void modificareGramaj(String gramajNou) {
        super.modificareGramaj(gramajNou);
    }
}
