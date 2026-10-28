package CollectionsOvning;

import java.util.Collections;
import java.util.LinkedList;

import java.util.Queue;
import  java.util.Set;
import  java.util.HashSet;

public class QueueOvning {

public static void main(String[] args) {

Queue<String> ko = new LinkedList<>();


ko.offer("Kim");

ko.offer("Alex");

ko.offer("Kim");

System.out.println(ko.size());
System.out.println(ko.poll());
System.out.println(ko.peek());

System.out.println(ko);


Set<String> kaffe = new HashSet<>();

kaffe.add("Kajsa");
kaffe.add("hugo");
kaffe.add("max");
kaffe.add("Kajsa");


System.out.println(kaffe);

}

}