public class DependencyInjectionTest {

    public static void main(String[] args) {

        // Create Repository
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject Repository into Service
        CustomerService service = new CustomerService(repository);

        // Find Customers
        service.getCustomerDetails(101);
        service.getCustomerDetails(102);
        service.getCustomerDetails(103);

    }

}