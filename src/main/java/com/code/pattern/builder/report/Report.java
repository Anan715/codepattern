package com.code.pattern.builder.report;

import lombok.Data;

@Data
public class Report {
    private String title;
    private String author;
    private String content;

    public Report(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    // 省略 getter 和 setter 方法

    @Override
    public String toString() {
        return "Report{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
