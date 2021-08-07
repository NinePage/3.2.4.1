package ru.netology.stats;

public class StatsService {
    public int totalAmount(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            amount += sale;
        }
        return amount;
    }
    public int averageAmount(int[] sales) {
        return totalAmount(sales) / sales.length;
    }
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int underAverageAmount(int[] sales) {
        int average = averageAmount(sales);
        int monthsCount = 0;
        for (int sale : sales) {
            if (sale < average) {
                monthsCount = monthsCount + 1;
            }
        }
        return monthsCount;
    }
    public int overAverageAmount(int[] sales) {
        int average = averageAmount(sales);
        int monthsCount = 0;
        for (int sale : sales) {
            if (sale > average) {
                monthsCount = monthsCount + 1;
            }
        }
        return monthsCount;
    }
}
