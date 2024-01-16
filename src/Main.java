//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Integer N = 3;
        List <Integer> listacasual =generaListaCasuale(3);
        System.out.println(listacasual);

        System.out.println(listaInversa(listacasual));
        pariDispari(listacasual,false
        );

    }

    public static List<Integer> generaListaCasuale(int N) {
        List<Integer> listaCasuale = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            listaCasuale.add(random.nextInt(101));
        }

        Collections.sort(listaCasuale);
        return listaCasuale;
    };

    public static List<Integer> listaInversa(List<Integer>lista) {
        List<Integer> listaInvertita = new ArrayList<>(lista);
        Collections.reverse(listaInvertita);
        lista.addAll(listaInvertita);

        return lista ;
    };

    public static void pariDispari(List<Integer>list, boolean booleano){
        if(booleano==true){
            for(int i = 0;i<list.size();i+=2){
                System.out.println(list.get(i));
            }
        }
        else {for (int i = 1 ; i < list.size();i+=2){
            System.out.println(list.get(i));
        }
        }
    }


}