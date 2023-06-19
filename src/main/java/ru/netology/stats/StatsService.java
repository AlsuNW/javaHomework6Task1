package ru.netology.stats;

public class StatsService {
    public int salesSum(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageMonthSales(int[] sales) {
        int sum = 0;
        int average;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        average = sum / sales.length;
        return average;

    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int salesBelowAverage(int[] sales) {
        int sum = 0;
        int average;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        average = sum / sales.length;

        int monthsBelowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthsBelowAverage = monthsBelowAverage + 1;
            }
        }
        return monthsBelowAverage;
    }

    public int salesAboveAverage(int[] sales) {
        int sum = 0;
        int average;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        average = sum / sales.length;

        int monthsAboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                monthsAboveAverage = monthsAboveAverage + 1;
            }
        }
        return monthsAboveAverage;
    }
}
