package com.neoteric.java0407;

import org.junit.jupiter.api.Test;

public class StudentFormTest {
   @Test
    public void test(){
       Student parent1=new Student();
       Student parent2=new Student();
       Student parent3=new Student();
       Student parent4=new Student();
       Student parent5=new Student();
       parent1.firstName=new char[]{'M','a','n','i','d','e','e','p'};
       parent1.lastName=new char[]{'U','t','l','a'};
       System.out.println(parent1.firstName);
       System.out.println(parent1.lastName);



    }

}
