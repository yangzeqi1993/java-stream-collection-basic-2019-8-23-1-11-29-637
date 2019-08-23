package com.thoughtworks.collection;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
    	int sum = 0;
    	if(leftBorder>rightBorder) {
    		int temp = leftBorder;
    		leftBorder = rightBorder;
    		rightBorder = temp;
    	}
       for(int i=leftBorder; i<=rightBorder;i++) {
    	   if (i%2==0) {
    		   sum += i;
    	   }
       }
       return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for (int i =0;i < arrayList.size(); i++) {
        	sum += arrayList.get(i)*3+2;
        }
        return sum;
    }
//
//    public double getAverageOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
