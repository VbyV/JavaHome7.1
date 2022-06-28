package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void ShouldFindMinSales() {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectMinDay = 9;
        int actualMinDay = service.minSales(sales);
        Assertions.assertEquals(expectMinDay, actualMinDay);

    }
    @Test
    public void ShouldFindMaxSales() {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectMaxDay = 8;
        int actualMaxDay = service.maxSales(sales);
        Assertions.assertEquals(expectMaxDay, actualMaxDay);
    }
    @Test
    public void ShouldFindSumSales() {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectSum = 180;
        int actualSum = service.amountSales(sales);
        Assertions.assertEquals(expectSum, actualSum);
    }
    @Test
    public void ShouldFindAverageSumSales() {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectAmSum = 15;
        int actualAmSum = service.averageSales(sales);
        Assertions.assertEquals(expectAmSum, actualAmSum);

    }
@Test
    public void  ShouldFindMonthMinSales() {
        StatsService service = new StatsService();
    long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expectMinMonth = 5;
    int actualMinMonth = service.aversgeSalesMonth(sales);
    Assertions.assertEquals(expectMinMonth, actualMinMonth);
}
@Test
    public void ShouldFindMonthMaxSales() {
        StatsService service = new StatsService();
    long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expectMaxMonth = 5;
    int actualMaxMonth = service.aversgeSalesMonhtMax(sales);
    Assertions.assertEquals(expectMaxMonth, actualMaxMonth);
}
}
