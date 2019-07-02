package io.zipcoder;

import java.util.NoSuchElementException;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier implements Runnable {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        try {
            while (stringIterator.hasNext()) copied += " " + stringIterator.next();
        } catch (NoSuchElementException e){
            copied += "Ouch!";
        }
    }
}
