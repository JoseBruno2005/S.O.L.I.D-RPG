package Main;


import Classes.Bruxo;
import Classes.Guerreiro;
import Classes.Mago;
import Classes.Paladino;
import Raca.Elfo;
import Raca.Humano;
import Raca.MortoVivo;
import Raca.Orc;

public class Main {
    public static void main(String[] args) {

        Elfo Elfo1 = new Elfo("Layza", "Hetero", new Bruxo());
        System.out.println(Elfo1);
        Elfo1.poder1();
        Elfo1.poder2();
        System.out.println("------------------------------------");


        Humano Humano1 = new Humano("Bruno", "Hetero", new Guerreiro());
        System.out.println(Humano1);
        Humano1.poder1();
        Humano1.poder2();
        System.out.println("------------------------------------");


        MortoVivo Mortovivo1 = new MortoVivo("Joao","Gay", new Mago());
        System.out.println(Mortovivo1);
        Mortovivo1.poder1();
        Mortovivo1.poder2();
        System.out.println("------------------------------------");


        Orc Orc1 = new Orc("Venicio","Gay", new Paladino());
        System.out.println(Orc1);
        Orc1.poder1();
        Orc1.poder2();
        System.out.println("------------------------------------");

    }
}
