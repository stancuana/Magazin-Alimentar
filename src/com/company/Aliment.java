package com.company;

public class Aliment extends Mancare {

    private String numeAliment;
    private String gramaj;
    private String dataDeExpirare;


    public Aliment(String numeAliment,String gramaj, String dataDeExpirare) {
        this.numeAliment = numeAliment;
        this.gramaj=gramaj;
        this.dataDeExpirare=dataDeExpirare;
    }

    public Aliment() {
    }


    public String getNumeAliment() {
        return numeAliment;
    }

    public void setNumeAliment(String numeAliment) {
        this.numeAliment = numeAliment;
    }

    public String getGramaj() {
        return gramaj;
    }

    public void setGramaj(String gramaj) {
        this.gramaj = gramaj;
    }

    public String getDataDeExpirare() {
        return dataDeExpirare;
    }

    public void setDataDeExpirare(String dataDeExpirare) {
        this.dataDeExpirare = dataDeExpirare;
    }


    @Override
    public String toString() {
        return "Nume aliment: " + this.numeAliment + "\n" +
                "Gramaj: " + this.gramaj + "\n" +
                "Data de expirare: " + this.dataDeExpirare + "\n";
    }

    @Override
    public boolean verificareDataDeExpirare(String dataDeExpirareValida) {
        if(this.dataDeExpirare.equals(dataDeExpirareValida)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void modificareGramaj(String gramajNou) {

        this.setGramaj(gramajNou);
        this.getGramaj();

    }
}
