package ru.rsatu;

import org.apache.commons.math3.distribution.NormalDistribution;

public class Main_child2 
{
    public static void doSomething()
    {
        String H = "Hello World!";
        System.out.println(H);   
        adopted.rand(H);

        NormalDistribution normalDistribution = new NormalDistribution(10, 3);
        double randomValue = normalDistribution.sample();
        System.out.println(randomValue);

    }

}
