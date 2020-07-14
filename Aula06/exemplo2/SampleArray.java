package exemplo2;

import java.util.ArrayList;

public class SampleArray {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Huguinho");
        lista.add("Zezinho");
        lista.add("Patinhas");
        lista.add(2,"Maga"); //"emprurra" os elementos da lista

        //lista.remove((Integer)7); //remove o nº 7
        //lista.remove(1); //remove o item de índice 1
        //System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).charAt(0) == 'P') {
                System.out.println("Tio");
            }else {
                System.out.println(lista.get(i));
            }
            
        }

        //para cada elemento do array faça
        for (String nome : lista) {
            nome += "-"; //não altera a lista
            System.out.println(nome);
        }


        System.out.println(lista);

    }
    
    

}