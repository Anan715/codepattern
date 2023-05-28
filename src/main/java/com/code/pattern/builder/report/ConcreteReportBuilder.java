package com.code.pattern.builder.report;

public class ConcreteReportBuilder implements ReportBuilder {
    private Report report = new Report(null, null, null);

    @Override
    public void setTitle(String title) {
        report.setTitle(title);
    }

    @Override
    public void setAuthor(String author) {
        report.setAuthor(author);
    }

    @Override
    public void setContent(String content) {
        report.setContent(content);
    }

    @Override
    public Report build() {
        return report;
    }
}
