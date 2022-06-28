package ru.netology.stats.services;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int amountSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSales(long[] sales) {
        int sum = 0;
        int averagesum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
            averagesum = sum / sales.length;
        }
        return averagesum;
    }

    public int aversgeSalesMonth(long[] sales) {
        int month = 0;
        int sumaverage = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sumaverage)
                month++;
        }
        return month;
    }

    public int aversgeSalesMonhtMax(long[] sales) {
        int month = 0;
        int maxsummax = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxsummax)
                month++;
        }
        return month;
    }

}

