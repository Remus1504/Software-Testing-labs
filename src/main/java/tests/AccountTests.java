package tests;

import Utils.TestUtils;
import model.Account;
import java.util.Date;

public class AccountTests {

    public static void main(String[] args) {
        //testConstructor();
        testSetters();
    }

    public static void testConstructor(){
        // Creating a Date object representing the date
        Date dateOfOpening = new Date(101, 3, 15); // Year, Month, Day
        String accountNumber = "12345";
        String userNameOfAccountHolder = "Remus";
        String accountType = "Savings";

        // Creating an Account object with the date parameter
        Account newAccount = new Account(accountNumber, userNameOfAccountHolder, accountType, dateOfOpening);

        if(newAccount.getAccountNumber() == accountNumber) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC1-getAccountNumber-passed" + TestUtils.TEXT_COLOR_RESET);
        } else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-getAccountNumber-FAILED" + TestUtils.TEXT_COLOR_RESET);

        if(newAccount.getUsernameOfAccountHolder() == userNameOfAccountHolder) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC2-getUserNameOfAccountHolder-passed" + TestUtils.TEXT_COLOR_RESET);
        } else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC2-getUserNameOfAccountHolder-FAILED" + TestUtils.TEXT_COLOR_RESET);

        if(newAccount.getAccountType() == accountType) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC3-getAccountType-passed" + TestUtils.TEXT_COLOR_RESET);
        } else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC3-getAccountType-FAILED" + TestUtils.TEXT_COLOR_RESET);

        if(newAccount.getAccountOpeningDate() == dateOfOpening) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC4-getAccountOpeningDate-passed" + TestUtils.TEXT_COLOR_RESET);
        } else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC4-getAccountOpeningDate-FAILED" + TestUtils.TEXT_COLOR_RESET);

        assert newAccount.getAccountNumber() == accountNumber;
        assert newAccount.getAccountType() == accountType;
        assert newAccount.getUsernameOfAccountHolder() == userNameOfAccountHolder;
        assert newAccount.getAccountOpeningDate() == dateOfOpening;

        System.out.println("All Java assertions in the test constructor suite have passed (none have failed)");
    }

    public static void testSetters(){
        Date dateOfOpening = new Date(101, 3, 15); // Year, Month, Day
        String accountNumber = "12345";
        String userNameOfAccountHolder = "Remus";
        String accountType = "Savings";

        // Creating an Account object with the date parameter
        Account newAccount = new Account(accountNumber, userNameOfAccountHolder, accountType, dateOfOpening);
        String accountNumberTest = "1234";
        String userNameOfAccountHolderTest = "Jonathan";
        String accountTypeTest = "Standard";
        Date dateOfTestOpening = new Date(103, 3, 15);
        newAccount.setAccountNumber(accountNumberTest);
        newAccount.setUsernameOfAccountHolder(userNameOfAccountHolderTest);
        //newAccount.setAccountType(accountTypeTest);
        newAccount.setAccountOpeningDate(dateOfTestOpening);

        if(newAccount.getAccountNumber() == accountNumberTest) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TS1-getAccountNumber-passed" + TestUtils.TEXT_COLOR_RESET);
        } else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TS1-getAccountNumber-FAILED" + TestUtils.TEXT_COLOR_RESET);

        if(newAccount.getUsernameOfAccountHolder() == userNameOfAccountHolderTest) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TS2-getUsernameOfAccountHolder-passed" + TestUtils.TEXT_COLOR_RESET);
        } else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TS2-getUsernameOfAccountHolder-FAILED" + TestUtils.TEXT_COLOR_RESET);

        if(newAccount.getAccountType() == accountTypeTest) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TS3-getAccountType-passed" + TestUtils.TEXT_COLOR_RESET);
        } else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TS3-getAccountType-FAILED" + TestUtils.TEXT_COLOR_RESET);

        if(newAccount.getAccountOpeningDate() == dateOfTestOpening) {
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TS4-getAccountOpeningDate-passed" + TestUtils.TEXT_COLOR_RESET);
        } else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TS4-getAccountOpeningDate-FAILED" + TestUtils.TEXT_COLOR_RESET);

        assert newAccount.getAccountNumber().equals("1234");
        assert newAccount.getAccountType() == accountTypeTest;
        assert newAccount.getUsernameOfAccountHolder().equals("Jonathan");
        assert newAccount.getAccountOpeningDate() == dateOfTestOpening;

        System.out.println("All Java assertions in the test setter suite have passed (none have failed)");

    }
}

