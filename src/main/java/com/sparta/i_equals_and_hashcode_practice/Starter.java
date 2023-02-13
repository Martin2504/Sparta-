package com.sparta.i_equals_and_hashcode_practice;

import com.sparta.i_equals_and_hashcode_practice.Customer;

public class Starter {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Humza", "Malik", 1);
        Customer cust2 = new Customer("Martin", "Petrov", 2);
        Customer cust3 = new Customer("Martin", "Petrov", 2);

        System.out.println(cust1.equals(cust2));
        System.out.println(cust2.equals(cust3));
        System.out.println(cust2 == cust3);

    }
}

