package com.thoughtworks.collection;

import java.util.ArrayList;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> sortFromBig() {
    	List<Integer> result = new ArrayList<Integer>(array);
        for (int i = 0; i < result.size()-1;i++) {
        	for (int j = i+1; j< result.size();j++) {
        		if(result.get(i)<result.get(j)) {
            		int temp;
            		temp = result.get(j);
            		result.set(j, result.get(i));
            		result.set(i, temp);
            	}
        	}
        	
        }
        return result;
    }

    public List<Integer> sortFromSmall() {
       List<Integer> result = new ArrayList<Integer>(array);
       for(int i = 0; i<result.size()-1; i++) {
    	   for (int j=i+1;j<result.size();j++) {
    		   if(result.get(i)>result.get(j)) {
    			   int temp = result.get(j);
    			   result.set(j,result.get(i));
    			   result.set(i, temp);
    		   }
    	   }
       }
       return result;
    }
}
