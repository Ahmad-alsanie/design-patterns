package com.sanie.structural.decorator;

public class ReportService {
    public static void main(String[] args) {
        Report report = new PlainTextReport();
        Report htmlReport = new HtmlReportDecorator(report);
        Report compressedHtmlReport = new CompressedReportDecorator(htmlReport);

        System.out.println(htmlReport.generate());
        System.out.println(compressedHtmlReport.generate());
    }
}
