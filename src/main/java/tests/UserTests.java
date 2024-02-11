package tests;

import Utils.TestUtils;
import model.User;


import Utils.TestUtils;
import model.User;

public class UserTests {
    public static void main(String[] args) {
        testUserConstructor();
    }

    public static void testUserConstructor() {
        String test_username = "Mike";
        String test_password = "my_passwd";
        String test_first_name = "Mike";
        String test_last_name = "Smith";
        String test_mobile_number = "07771234567";

        try {
            User testUser = new User(test_username, test_password, test_first_name, test_last_name, test_mobile_number);

            System.out.println("Starting the assertions of the test method: testUserConstructor");

            if (testUser.getUsername().equals(test_username)) {
                System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC1-getUsername-passed" + TestUtils.TEXT_COLOR_RESET);
            } else
                System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-getUsername-FAILED" + TestUtils.TEXT_COLOR_RESET);

            if (testUser.getPassword().equals(test_password)) {
                System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC2-getPassword-passed" + TestUtils.TEXT_COLOR_RESET);
            } else
                System.out.println(TestUtils.TEXT_COLOR_RED + "TC2-getPassword-FAILED" + TestUtils.TEXT_COLOR_RESET);

            if (testUser.getFirstName().equals(test_first_name)) {
                System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC3-getFirstName-passed" + TestUtils.TEXT_COLOR_RESET);
            } else
                System.out.println(TestUtils.TEXT_COLOR_RED + "TC3-getFirstName-FAILED" + TestUtils.TEXT_COLOR_RESET);

            if (testUser.getLastName().equals(test_last_name)) {
                System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC4-getLastName-passed" + TestUtils.TEXT_COLOR_RESET);
            } else
                System.out.println(TestUtils.TEXT_COLOR_RED + "TC4-getLastName-FAILED" + TestUtils.TEXT_COLOR_RESET);

            if (testUser.getMobileNumber().equals(test_mobile_number)) {
                System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC5-getMobileNumber-passed" + TestUtils.TEXT_COLOR_RESET);
            } else
                System.out.println(TestUtils.TEXT_COLOR_RED + "TC5-getMobileNumber-FAILED" + TestUtils.TEXT_COLOR_RESET);

            assert testUser.getUsername().equals(test_username);
            assert testUser.getPassword().equals(test_password);
            assert testUser.getFirstName().equals(test_first_name);
            assert testUser.getLastName().equals(test_last_name);
            assert testUser.getMobileNumber().equals(test_mobile_number);

            System.out.println("All Java assertions in the test suite have passed (none have failed)");
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
