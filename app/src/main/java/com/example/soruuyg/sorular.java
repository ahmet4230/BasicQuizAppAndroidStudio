package com.example.soruuyg;

import java.util.ArrayList;
import java.util.Arrays;

public class sorular {
    ArrayList<String> s = new ArrayList<>(Arrays.asList(
            "Türkiyenin başkenti hangisidir ?",
            "Konya hangi bölgede bulunur ?",
            "34 plaka nereye aittir ?",
            "42 plaka nereye aittir ?",
            "HANGİSİ EGE BÖLGESİNDE BULUNMAZ ?"

    ));
    ArrayList<String>[] sec = new ArrayList[5];

    ArrayList<String> cev = new ArrayList<>(Arrays.asList(
            "ANKARA",
            "İÇ ANADOLU",
            "İSTANBUL",
            "KONYA",
            "RİZE"

    ));
    sorular(){
        for (int i = 0; i < 5; i++){
            sec[i] = new ArrayList<String>();
        }
        sec[0].add(("ANKARA"));
        sec[0].add("KONYA");
        sec[0].add("İZMİR");
        sec[0].add("BURSA");

        sec[1].add(("EGE"));
        sec[1].add("DOĞU ANADOLU");
        sec[1].add("AKDENİZ");
        sec[1].add("İÇ ANADOLU");

        sec[2].add(("ANKARA"));
        sec[2].add("İSTANBUL");
        sec[2].add("BURSA");
        sec[2].add("İZMİR");

        sec[3].add(("KONYA"));
        sec[3].add("ANKARA");
        sec[3].add("BURSA");
        sec[3].add("İZMİR");

        sec[4].add(("RİZE"));
        sec[4].add("İZMİR");
        sec[4].add("MANİSA");
        sec[4].add("AYDIN");
    }

}
