package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 1, 17, 21, 19, 20, 7, 14, 2, 18};
        int expected = 155;

        int actual = service.calculateSum(sales);
        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateAverageSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 1, 17, 21, 19, 20, 7, 14, 2, 18};
        int expected = 12;

        int actual = service.calculateAverageSale(sales);
        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateMonthWithMaxSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 1, 17, 21, 19, 20, 7, 14, 2, 18};
        int expected = 6;

        int actual = service.calculateMonthWithMaxSale(sales);
        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateMonthWithMinSale() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 1, 17, 21, 19, 20, 7, 14, 2, 18};
        int expected = 4;

        int actual = service.calculateMonthWithMinSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthGreaterAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 1, 17, 21, 19, 20, 7, 14, 2, 18};
        int expected = 8;

        int actual = service.calculateMonthGreaterAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthLessAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 1, 17, 21, 19, 20, 7, 14, 2, 18};
        int expected = 4;

        int actual = service.calculateMonthLessAverageSales(sales);
        assertEquals(expected, actual);
    }
}