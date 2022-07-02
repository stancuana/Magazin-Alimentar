package com.company;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RaftTest {

    @Test
    public void test(){



        Paine paine=new Paine("Paine","500g","1.07.2022");
        Lapte lapte=new Lapte("Lapte","1L","3.07.2022");

        ArrayList<Aliment> alimente=new ArrayList<>();

        alimente.add(paine);
        alimente.add(lapte);

        Raft raft=new Raft(alimente);

        raft.afisare();
        System.out.println("..........Modificare Gramaj..........");
        raft.modificareGramaj("300g");
        raft.afisare();
        System.out.println("...........Verificare Data De Expirare..........");
        System.out.println(raft.verificareDataDeExpirare("1.07.2022"));


    }

}