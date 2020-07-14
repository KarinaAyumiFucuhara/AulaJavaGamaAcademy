package ex6_4;

import java.util.ArrayList;

public class AppAnimalProp {
    public static void main(String[] args) {
        GerenciarEx6_4 animais = new GerenciarEx6_4();

        animais.addAnimal("Roy", "Higlander", "branco", 2015, "Lucia", "9999-9999");
        animais.addAnimal("Roy", "Higlander", "branco", 2015, "Karina", "9999-9999");
        animais.addAnimal("Baruki", "Lhasa", "branco", 2018, "Batchan", "9999-9999");


        System.out.println(animais.listarAnimais());

        System.out.println(animais.listarProp_dadoRaçaAnimal("Higlander"));
    }

}