package com.easyrest.userData;

import com.github.javafaker.Faker;

public class FakeData {
    private static Faker faker = new Faker();

    public static String getFullName() { return faker.name().fullName(); }
    public static String getEmail() { return faker.internet().emailAddress(); }
    public static String getPassword() { return faker.internet().password(8, 12); }
    public static String getPhone() { return faker.phoneNumber().phoneNumber(); }
}
