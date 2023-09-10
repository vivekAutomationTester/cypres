package library.reports;

import java.io.IOException;

/**
 * The type Reporter.
 */
public class Reporter {

    // Provides instance of the Report
    private volatile static ReportManager reportManager;

    private Reporter()
    {
        // This will block the direct instantiation of the class
    }

    /**
     * Gets instance of the Report
     *
     * @return the instance
     * @throws IOException the io exception
     */
    public static ReportManager getInstance() throws IOException {

        if(reportManager ==null)
            reportManager = new ReportManager(); // Stops multiple instances of the report
        return reportManager;
    }
}
