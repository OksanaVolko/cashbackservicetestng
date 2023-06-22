package ru.netology.service;

import java.util.concurrent.Callable;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRomainCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);


    }

    @org.testng.annotations.Test
    public void shouldReturnHundredIfAmountIsNineHundred() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);


    }

    @org.testng.annotations.Test
    public void shouldReturnBoundaryIfAmountIsZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);

    }
}