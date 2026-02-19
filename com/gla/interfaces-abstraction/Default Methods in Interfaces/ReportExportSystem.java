public class ReportExportSystem {

    interface ReportExporter {

        void exportToCSV();
        void exportToPDF();

        // New format added later
        default void exportToJSON() {
            System.out.println("Exporting report in JSON format (Default)");
        }
    }

    static class SalesReport implements ReportExporter {

        public void exportToCSV() {
            System.out.println("Sales Report exported as CSV");
        }

        public void exportToPDF() {
            System.out.println("Sales Report exported as PDF");
        }
    }

    public static void main(String[] args) {

        ReportExporter report = new SalesReport();

        report.exportToCSV();
        report.exportToPDF();
        report.exportToJSON(); // Uses default method
    }
}
