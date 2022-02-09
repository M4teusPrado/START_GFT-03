package br.com.GFT.Ex04;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

    public static void main(String[] args) {

        List<Integer> arr1 = java.util.Arrays.asList(10,5,98,452);
        List<Integer> arr2 = java.util.Arrays.asList(10,5,98,452);

        System.out.println(multiplicandoArrays(arr1,arr2));

        List<Integer> arr3 = java.util.Arrays.asList(548,213,10);
        List<Integer> arr4 = java.util.Arrays.asList(5,21,12);

        System.out.println(multiplicandoArrays(arr3,arr4));

        List<Integer> arr5 = java.util.Arrays.asList(50,60,70);
        List<Integer> arr6 = java.util.Arrays.asList(5,21,12);

        System.out.println(multiplicandoArrays(arr5,arr6));

        List<Integer> arr7 = java.util.Arrays.asList(60,70);
        List<Integer> arr8 = java.util.Arrays.asList(1,2,3);

        System.out.println(multiplicandoArrays(arr7,arr8));
    }



    public static List<Integer> multiplicandoArrays(List<Integer> arr1, List<Integer> arr2) {

        if (arr1.size() != arr2.size()) {
            System.out.println("Arrays não são do mesmo tamanho");
            return null;
        }

        List<Integer> resposta = new ArrayList<>();
        for (int i = 0; i < arr1.size(); i++)
            resposta.add( arr1.get(i) * arr2.get(i));

        return resposta;
    }

}
