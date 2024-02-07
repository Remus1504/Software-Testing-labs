package tests;

import Utils.TestUtils;
import model.User;

import java.sql.SQLOutput;

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

        User testUser = new User(test_username,test_password,test_first_name, test_last_name, test_mobile_number);

        System.out.println("Starting the assertions of the test method: testUserConstructor");

        if(testUser.getUsername() == test_username) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC1-getUsername-passed" + TestUtils.TEXT_COLOR_RESET);
        } else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-getUsername-FAILED" + TestUtils.TEXT_COLOR_RESET);

        if(testUser.getPassword() == test_password) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC2-getPassword-passed" + TestUtils.TEXT_COLOR_RESET);
        } else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-getUsername-FAILED" + TestUtils.TEXT_COLOR_RESET);

        if(testUser.getFirstName() == test_first_name) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC2-getFirstName-passed" + TestUtils.TEXT_COLOR_RESET);
        } else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-getFirstName-FAILED" + TestUtils.TEXT_COLOR_RESET);

        if(testUser.getLastName() == test_last_name) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC2-getLastName-passed" + TestUtils.TEXT_COLOR_RESET);
        } else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-getLastName-FAILED" + TestUtils.TEXT_COLOR_RESET);

        if(testUser.getMobileNumber() == test_mobile_number) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC2-getMobileNumber-passed" + TestUtils.TEXT_COLOR_RESET);
        } else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-getMobileNumber-FAILED" + TestUtils.TEXT_COLOR_RESET);

        assert testUser.getUsername() == test_username;
        assert testUser.getFirstName() == test_first_name;
        assert testUser.getLastName() == test_last_name;
        assert testUser.getMobileNumber() == test_mobile_number;
        assert  testUser.getPassword() == test_password;

        System.out.println("All Java assertions in the test suite have passed (none have failed)");
    }
}
