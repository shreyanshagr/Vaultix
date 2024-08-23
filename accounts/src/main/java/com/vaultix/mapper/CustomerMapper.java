package com.vaultix.mapper;

import com.vaultix.dto.CustomerDto;
import com.vaultix.entity.Customer;
//import org.mapstruct.Mapper;

//@Mapper(componentModel = "spring")
//public interface CustomerMapper {
//    Customer dtoToCustomer(CustomerDto customerDto);
//    CustomerDto customerToDto(Customer customer);
//}

public class CustomerMapper {

    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }

}