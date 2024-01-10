package structural.decorator;

public class HtmlReportDecorator extends ReportDecorator {
    public HtmlReportDecorator(Report report) {
        super(report);
    }

    public String generate() {
        return addHtmlTags(super.generate());
    }

    private String addHtmlTags(String reportContent) {
        return "<html><body>" + reportContent + "</body></html>";
    }
}