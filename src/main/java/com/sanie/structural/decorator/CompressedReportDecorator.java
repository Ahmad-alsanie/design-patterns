package com.sanie.structural.decorator;

public class CompressedReportDecorator extends ReportDecorator {
    public CompressedReportDecorator(Report report) {
        super(report);
    }

    public String generate() {
        return compress(super.generate());
    }

    private String compress(String reportContent) {
        // Implement compression logic here
        return "Compressed " + reportContent;
    }
}
