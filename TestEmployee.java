public class TestEmployee {
    public static void main(String[] args) {
        Employee em1 = new FullTimeEmployee("สมชาย", 20000);
        Employee em2 = new ContractEmployee("สมหญิง",120,150);

        em1.showSalary();
        em2.showSalary();
    }
}
