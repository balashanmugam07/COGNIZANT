public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        // Simulated database lookup
        if (id == 101) {
            return "Customer ID: 101, Name: Rahul";
        } else if (id == 102) {
            return "Customer ID: 102, Name: Priya";
        } else {
            return "Customer not found.";
        }

    }

}