package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverageSale(int[] sales) {
        return calculateSum(sales) / 12;
    }

    public int calculateMonthWithMaxSale(int[] sales) {
        int index = 0;
        int maxNum = 0;
        int result = 0;

        for (int sale : sales) {
            if (sale > maxNum) {
                maxNum = sale;
                result = index;
            }
            index += 1;
        }
        return result + 1;
    }

    public int calculateMonthWithMinSale(int[] sales) {
        int index = 0;
        int minNum = sales[0];
        int result = 0;

        for (int sale : sales) {
            if (sale < minNum) {
                minNum = sale;
                result = index;
            }
            index = index + 1;
        }
        return result + 1;
    }

    public int calculateMonthGreaterAverageSales(int[] sales) {
        int averageSale = calculateAverageSale(sales);
        int counter = 0;
        for (int sale : sales) {
            if (sale > averageSale) {
                counter += 1;
            }
        }
        return counter;
    }

    public int calculateMonthLessAverageSales(int[] sales) {
        int averageSale = calculateAverageSale(sales);
        int counter = 0;
        for (int sale : sales) {
            if (sale < averageSale) {
                counter += 1;
            }
        }
        return counter;
    }
}
