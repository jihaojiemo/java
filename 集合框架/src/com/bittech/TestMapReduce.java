package com.bittech;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

class Order {

    private String title;
    private double price;
    private int amount;

    public Order(String title, double price, int amount) {
        this.title = title;
        this.price = price;
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

public class TestMapReduce {

    public static void main(String[] args) {


        //在List集合中保存这些订单的信息
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order("Iphone", 8999.99, 10));
        orderList.add(new Order("外星人笔记本", 12999.99, 5));
        orderList.add(new Order("MacBookPro", 18999.99, 5));
        orderList.add(new Order("Java从入门到放弃.txt", 9.99, 20000));
        orderList.add(new Order("中性笔", 1.99, 200000));

        //计算订单金额总和
        double totalPrice = orderList.stream()
                //结果应该为double类型
                //.map(order -> order.getAmount() * order.getPrice())
                .mapToDouble(order -> order.getPrice() * order.getAmount())
                .reduce((sum, x) -> sum = sum + x)
                .orElseGet(() -> 0.0D);
        System.out.println("订单总额为："+totalPrice);


        /*
        //统计分析（订单数量、最大金额、最小金额、平均金额、订单总金额）
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order("Iphone", 8999.99, 10));
        orderList.add(new Order("外星人笔记本", 12999.99, 5));
        orderList.add(new Order("MacBookPro", 18999.99, 5));
        orderList.add(new Order("Java从入门到放弃.txt", 9.99, 20000));
        orderList.add(new Order("中性笔", 1.99, 200000));

        //第一种方法：
        int orderCount = 0;
        double maxPrice = Double.MIN_VALUE;
        double minPrice = Double.MAX_VALUE;
        double orderAvg = 0.0D;
        double orderTotal = 0.0D;

        for(Order order : orderList) {
            orderCount++;
            double orderPrice = order.getPrice() * order.getAmount();
            if (maxPrice < orderPrice) {
                maxPrice = orderPrice;
            }
            if (minPrice > orderPrice) {
                minPrice = orderPrice;
            }
            orderTotal = orderTotal + orderPrice;
        }
        orderAvg = orderTotal / orderCount;

        System.out.println("订单数量：" + orderCount);
        System.out.println("最大金额：" + maxPrice);
        System.out.println("最小金额：" + minPrice);
        System.out.println("平均金额：" + orderAvg);
        System.out.println("订单总金额：" + orderTotal);

        System.out.println("---------------");

        //第二种方法：
        DoubleSummaryStatistics statistics = orderList.stream()
                .mapToDouble(order -> order.getAmount() * order.getPrice())
                .summaryStatistics();

        System.out.println("订单数量：" + statistics.getCount());
        System.out.println("最大金额：" + statistics.getMax());
        System.out.println("最小金额：" + statistics.getMin());
        System.out.println("平均金额：" + statistics.getAverage());
        System.out.println("订单总金额：" + statistics.getSum());
        */

    }
}
