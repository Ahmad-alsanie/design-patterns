package com.sanie.structural.decorator;

public abstract class ReportDecorator implements Report {
    protected Report decoratedReport;

    public ReportDecorator(Report report) {
        this.decoratedReport = report;
    }

    public String generate() {
        return decoratedReport.generate();
    }
}
