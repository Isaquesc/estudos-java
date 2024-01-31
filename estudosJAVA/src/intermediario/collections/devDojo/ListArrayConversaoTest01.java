package intermediario.collections.devDojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
    public static void main(String[] args) {

        //TRANSFORMANDO ARRAYLIST em ARRAY
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));


        //TRANSFORMANDO ARRAY em ARRAYLIST
        Integer[] numerosArrays = new Integer[3];
        numerosArrays[0] = 1;
        numerosArrays[1] = 2;
        numerosArrays[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArrays);
        arrayToList.set(0,12);
        System.out.println(arrayToList);

        ArrayList<Integer> numeroList = new ArrayList<>(Arrays.asList(numerosArrays));
        numeroList.add(15);
        System.out.println(numeroList);

        List<String> list = Arrays.asList("1", "2");
        System.out.println(list);


    }
}
