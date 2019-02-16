package com.epam.javast.quadrilateral.repository.sort;

import com.epam.javast.quadrilateral.repository.comparator.api.QuadrilateralComparator;
import com.epam.javast.quadrilateral.entity.Quadrilateral;

import java.util.ArrayList;
import java.util.List;

public class QuadrilateralSort {

    public static void mergeSort(List<Quadrilateral> quadrilateralList, QuadrilateralComparator compare){
        List<Quadrilateral> left = new ArrayList<>();
        List<Quadrilateral> right = new ArrayList<>();
        int center;

        if(!(quadrilateralList.isEmpty())){
            center = quadrilateralList.size() / 2;

            for(int i = 0; i < center; i++){
                left.add(quadrilateralList.get(i));
            }

            for(int i = center; i < quadrilateralList.size(); i++){
                right.add(quadrilateralList.get(i));
            }
        }
        sort(left, right, quadrilateralList, compare);

    }

    private static void sort(List<Quadrilateral> left, List<Quadrilateral> right,
                      List<Quadrilateral> quadrilateralList, QuadrilateralComparator compare){

        int leftIndex = 0;
        int rightIndex = 0;
        int quadrilateralListIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()){
            if(compare.compare(left.get(leftIndex), right.get(rightIndex)) < 0){
                quadrilateralList.set(quadrilateralListIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                quadrilateralList.set(quadrilateralListIndex, right.get(rightIndex));
                rightIndex++;
            }

            quadrilateralListIndex++;
        }

        List<Quadrilateral> rest;
        int restIndex;
        if(leftIndex >= left.size()){
            rest = right;
            restIndex = rightIndex;
        }else {
            rest = left;
            restIndex = leftIndex;
        }

        for(int i = restIndex; restIndex < rest.size(); restIndex++){
            quadrilateralList.set(quadrilateralListIndex, rest.get(i));
            quadrilateralListIndex++;
        }
    }


    public static void bubbleSort(List<Quadrilateral> quadrilateralList, QuadrilateralComparator compare){
        for(int i = 0; i < quadrilateralList.size(); i++){
            for (int x = i; x < quadrilateralList.size(); x++){
                if(compare.compare(quadrilateralList.get(i), quadrilateralList.get(x)) > 0){
                    Quadrilateral o = quadrilateralList.get(x);
                    quadrilateralList.set(x, quadrilateralList.get(i));
                    quadrilateralList.set(i, o);


                }
            }
        }
    }
}
