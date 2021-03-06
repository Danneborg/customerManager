package kononikhin.Service;

import kononikhin.Entities.ActualAddress;
import kononikhin.Entities.Customer;
import kononikhin.Entities.RegisteredAddress;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(int customerId);

    void deleteCustomer(int customerId);

    List<Customer> searchCustomers(String searchName);

    void saveCustomer(Customer customer, RegisteredAddress registeredAddress, ActualAddress actualAddress,Boolean checkbox);

    void saveCustomer(Customer customer, ActualAddress actualAddress,RegisteredAddress registeredAddress);
}
