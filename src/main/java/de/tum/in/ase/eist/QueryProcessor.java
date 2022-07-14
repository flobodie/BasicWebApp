package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Flo";
        } else if (query.contains("largest")) { // TODO extend the programm here
            query = query.substring(query.indexOf(":"));
            String[] stringarr = query.split(",");
            int[] arr = new int[stringarr.length];
            for(int i = 0; i < stringarr.length; i++) {
                arr[i] = Integer.parseInt(stringarr[i]);
            }
            return Arrays.stream(arr).max().toString();
        } else {
            return "";
        }
    }
}
