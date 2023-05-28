package com.code.pattern.builder.report;

public class ReportMain {
    public static void main(String[] args) {
        ReportBuilder builder = new ConcreteReportBuilder();
        builder.setTitle("Weekly Report");
        builder.setAuthor("Tom");
        builder.setContent("This is the weekly report for this week...");
        Report report = builder.build();
        System.out.println(report);

    }
}
