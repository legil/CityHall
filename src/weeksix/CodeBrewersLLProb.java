package weeksix;

import java.util.LinkedList;

public class CodeBrewersLLProb {

	    public static void main(String[] args) {
	        LinkedList<Integer> list = new LinkedList<Integer>();
	        int random = (int) (1+Math.random()*100); // = 10 for example
	        //generate random
	        for (int i = 0; i < 100; i++) {
	            int r = (int) (1 + Math.random() * 100);
	            if (r == 10) {
	                continue;
	            }
	            list.add(r);
	        }

	        System.out.println("Random:" + random);
	        //Sort
	        list.sort(null);
	        System.out.println(list.toString());

	        if (list.contains(random)) { //Random is already present add the element at the first occurrence
	            list.add(list.indexOf(random), random);
	        } else if (random < list.getFirst()){ //Random < first element in list
	            list.addFirst(random);
	        } else if(random > list.getLast()){ //Random > last element in list
	            list.addLast(random);
	        } else if (random < list.get(list.size()/2)) { //Random is located in the 1st half
	            insert(list, random, 0, list.size() / 2);
	        } else if (random >= list.get(list.size()/2)){ //Random is located in the 2nd half
	            insert(list, random, list.size() / 2, list.size());
	        }
	        System.out.println(list.toString());
	    }
	    //No need to go through the entire list.
	    //Only the half that does not contains the element
	    private static void insert(LinkedList<Integer> list, int random, int start, int end){
	        for(int i = start; i < end; i++) {
	            //Element between the a number that is larger and smaller than it
	            if(random > list.get(i) && random < list.get(i+1)) {
	                list.add(i + 1, random);
	                break;
	            }
	    }
	}
}
