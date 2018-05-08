package com.javafortesters.Hoofdstuk016;

import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RandomValues {
    @Test
    public void TestRandomValues(){
        Random generate = new Random();

        boolean randomBoolean = generate.nextBoolean();
        int randomInt = generate.nextInt();
        int randomIntRange = generate.nextInt(12);
        long randomLong = generate.nextLong();
        double randomDouble = generate.nextDouble();
        double randomGaussian = generate.nextGaussian();
        byte[] bytes = new byte[generate.nextInt(100)];
        generate.nextBytes(bytes); // fill bytes with random data

        System.out.println(randomBoolean + ", " +
                randomInt + ", " + randomIntRange + ", " +
                randomLong + ", " +
                randomDouble + ", " +
                randomGaussian + ", " +
                bytes);
    }

    @Test
    public void TestRandomString() {
        String randomString = getSaltString(100);
        assertThat(randomString.length(), is(100));
        System.out.println(randomString);
    }

    protected String getSaltString(int lengte) {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < lengte) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    }
