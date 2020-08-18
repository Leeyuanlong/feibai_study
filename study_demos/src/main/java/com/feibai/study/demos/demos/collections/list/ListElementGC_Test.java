package com.feibai.study.demos.demos.collections.list;

import com.feibai.study.demos.demos.reflect.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ListElementGC_Test {

  public static void main(String[] args) throws Exception {
    List<Person> persons = new ArrayList<>();


    persons.add(new Person("", 11));
    persons.add(new Person("", 12));
    persons.add(new Person("", 13));

    persons.clear();

    System.gc();

    TimeUnit.SECONDS.sleep(20);

  }


}