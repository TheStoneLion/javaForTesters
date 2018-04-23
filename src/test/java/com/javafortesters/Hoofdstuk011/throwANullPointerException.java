package com.javafortesters.Hoofdstuk011;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class throwANullPointerException {
//    @Test
//    public void throwANullPointerException(){
//        Integer age=null;
//        String ageAsString = age.toString();
//        String yourAge =
//                "You are " + ageAsString + " years old";
//        assertEquals("You are 18 years old", yourAge);
//    }

    @Test
    public void fixedANullPointerException(){
        Integer age=18;
        String ageAsString = age.toString();
        String yourAge =
                "You are " + ageAsString + " years old";
        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void catchANullPointerException(){
        Integer age=null;
        String ageAsString;
        try{
            ageAsString = age.toString();
        }catch(NullPointerException e){
            age = 18;
            ageAsString = age.toString();
        }

        String yourAge =
                "You are " + age.toString() + " years old";
        assertEquals("You are 18 years old", yourAge);
    }

//    @Test
//    public void catchAnArithmeticExceptionInsteadOfANullPointerException(){
//        Integer age=null;
//        String ageAsString;
//        try{
//            ageAsString = age.toString();
//        }catch(ArithmeticException e){
//            age = 18;
//            ageAsString = age.toString();
//        }
//
//        String yourAge =
//                "You are " + age.toString() + " years old";
//        assertEquals("You are 18 years old", yourAge);
//    }

    @Test
    public void catchANullPointerExceptionAndShowMessage(){
        Integer age=null;
        String ageAsString;
        try{
            ageAsString = age.toString();
        }catch(NullPointerException e){
            System.out.println("getMessage - " +
                    e.getMessage());
            System.out.println("getStacktrace - " +
                    e.getStackTrace());
            System.out.println("printStackTrace");
            e.printStackTrace();

            age = 18;
            ageAsString = age.toString();
        }

        String yourAge =
                "You are " + age.toString() + " years old";
        assertEquals("You are 18 years old", yourAge);
    }}
