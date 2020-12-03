package ch.hicoders.jam101.week01.ciftci;

import ch.hicoders.jam101.week01.ciftlik.*;

public class Ciftci {

    public static void main(String[] args) {
        Inek birinci_inek = new Inek("sarikiz");
        Inek ikinci_inek = new Inek("karakiz");
        Inek ucuncu_inek = new Inek("tosun");
        Tavuk birinci_tavuk = new Tavuk("cilli");
        Tavuk ikinci_tavuk = new Tavuk("pacali");
        Tavuk ucuncu_tavuk = new Tavuk("suslu");

        System.out.println("birinci inegin adi " + birinci_inek.inekAdi);
        System.out.println("ikinci inegin adi " + ikinci_inek.inekAdi);
        System.out.println("ucuncu inegin adi " + ucuncu_inek.inekAdi);
        System.out.println("birinci tavugun adi " + birinci_tavuk.tavukAdi);
        System.out.println("ikinci tavugun adi " + ikinci_tavuk.tavukAdi);
        System.out.println("ucuncu tavugun adi " + ucuncu_tavuk.tavukAdi);
        System.out.println("Bizim toplam " + Inek.inekSayisi + " tane inegimiz vardir.");
        System.out.println("Bizim toplam " + Tavuk.tavukSayisi + " tane tavugumuz vardir");

    }
}
