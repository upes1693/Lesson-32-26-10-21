package com.collections_java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(1);
        boolean b= list.isEmpty();
        boolean b2= list.contains(3);
        //list.clear();
        list.set(1,8);
        Object[] numArr= list.toArray();

//        Iterator<Integer> itr= list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

        ListIterator<Integer> itr2= list.listIterator();
//        while(itr2.hasNext()){
//            System.out.println("Next index"+ itr2.nextIndex());
//            System.out.println(itr2.next());
//        }
//        while(itr2.hasPrevious()){
//            System.out.println(itr2.previous());
//        }


//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for ( Integer listItem : list) {
//            System.out.println(listItem);
//        }

        Collection<String> words=new LinkedList<>();
        words.add("Hello");
        words.add("World");
        words.add("Java");
        words.add("LinkedList");

//        Iterator<String> itr3= words.descendingIterator();
//        while(itr3.hasNext()){
//            System.out.println(itr3.next());
//        }

        Set<Double> doubleSet=new LinkedHashSet<>();
        doubleSet.add(1.1);
        doubleSet.add(2.2);
        doubleSet.add(3.1);
        doubleSet.add(5.1);
        doubleSet.add(3.7);
        doubleSet.add(1.1);
        doubleSet.add(null);
        doubleSet.add(null);


//        Iterator<Double> itr4= doubleSet.iterator();
//        while(itr4.hasNext()){
//            System.out.println(itr4.next());
//        }

        TreeSet<Country> countries=new TreeSet<>();
        countries.add(new Country(3,"France"));
        countries.add(new Country(4,"Italy"));
        countries.add(new Country(2,"USA"));
        countries.add(new Country(1,"Israel"));

        for (Country country:countries) {
            System.out.println(country.getCode()+" "+country.getName());
        }

    }
}
