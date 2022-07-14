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
            //query = query.substring(query.indexOf(":" + 1));
            String[] stringarr = query.split(" ");
            int[] arr = new int[stringarr.length];
            for(int i = 8; i < stringarr.length; i++) {
                arr[i] = Integer.parseInt(stringarr[i].replace(",",""));
            }
            int ret = arr[8];
            for (int i = 9; i < stringarr.length; i++) {
                if (arr[i] > ret) {
                    ret = arr[i];
                }
            }
            return String.valueOf(ret);
        } else {
            return "";
        }
    }
}
