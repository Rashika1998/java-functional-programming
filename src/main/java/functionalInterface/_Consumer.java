package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        //Imperative approach
        greedCustomer(new Customer("Rashika", "+94768003266"));

        //Declarative approach
        Customer customerConsumer = new Customer("Sandushi", "+94710000977");

        greedCustomerConsumer.accept(customerConsumer);
        greedCustomerBiConsumer.accept(customerConsumer, false);

    }

    //Imperative approach
    static void greedCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName +
                ", thank for registering phone " +
                customer.customerPhoneNumber);
    }

    //Declarative approach
    static Consumer<Customer> greedCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    ", thank for registering phone number " +
                    customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greedCustomerBiConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +
                    ", thank for registering phone number " +
                    (showPhoneNumber ? customer.customerPhoneNumber: "+94*********") );


    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
