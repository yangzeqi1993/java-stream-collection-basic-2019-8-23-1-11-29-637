package com.thoughtworks.collection;

import java.util.LinkedList;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
    	List<Integer>  result = new LinkedList<>();
        for(int i = 0;i<array.size();i++) {
        	if(array.get(i)%2 == 0) {
        		result.add(array.get(i));
        	}
        }
        return result;
    }
//
//    public List<Integer> filterMultipleOfThree() {
//        throw new NotImplementedException();
//    }
}
