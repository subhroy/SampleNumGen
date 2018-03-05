package com.subh.mvn.sample;

import java.util.UUID;

/**
 * Generate a unique number
 *
 */
public class NumGenerator
{

    public static void main( String[] args )
    {
        NumGenerator obj = new NumGenerator();
        System.out.println("Unique Number : " + obj.generateUniqueKey());
    }

    public String generateUniqueKey(){

    	String id = UUID.randomUUID().toString();
    	return id;

    }
}