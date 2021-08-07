package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void totalAmount() {
        int expected = 180;
        int actual = service.totalAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void averageAmount() {
        int expected = 15;
        int actual = service.averageAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        int expected = 8;
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void underAverageAmount() {
        int expected = 5;
        int actual = service.underAverageAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void overAverageAmount() {
        int expected = 5;
        int actual = service.overAverageAmount(sales);
        assertEquals(expected, actual);
    }
}