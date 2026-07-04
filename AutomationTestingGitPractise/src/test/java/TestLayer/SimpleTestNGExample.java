package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTestNGExample {

    @Test(groups = {"SendRequest"})
    public void testSendRequest() {
        System.out.println("Running Send Request Test");
        Assert.assertTrue(true);
    }

    @Test(groups = {"Expense"})
    public void testExpense() {
        System.out.println("Running Expense Test");
        Assert.assertTrue(true);
    }

    @Test(groups = {"Login"})
    public void testLogin() {
        System.out.println("Running Login Test");
        Assert.assertTrue(true);
    }
}