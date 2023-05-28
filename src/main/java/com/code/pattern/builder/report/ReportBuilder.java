package com.code.pattern.builder.report;

// 定义报告建造者接口 ReportBuilder，包含设置报告属性和创建报告的抽象方法。
public interface ReportBuilder {
    void setTitle(String title);
    void setAuthor(String author);
    void setContent(String content);
    Report build();
}
