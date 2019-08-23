package com.thoughtworks.collection;

import org.junit.Test;

import java.util.*;

import static org.fest.assertions.api.Assertions.assertThat;

public class MyMapTest {

    @Test
    public void should_sort_from_big_to_small() {
        //从大到小排序
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(array);

        MyMap myMap = new MyMap(list);

        Integer[] result = new Integer[]{5, 4, 3, 2, 1};
        List<Integer> resultList = Arrays.asList(result);

        assertThat(myMap.sortFromBig()).isEqualTo(resultList);
    }

    @Test
    public void should_sort_from_small_to_big() {
        //从小到大排序
        Integer[] array = new Integer[]{3, 2, 4, 5, 1};
        List<Integer> list = Arrays.asList(array);

        MyMap myMap = new MyMap(list);

        Integer[] result = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> resultList = Arrays.asList(result);

        assertThat(myMap.sortFromSmall()).isEqualTo(resultList);
    }
}
