package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repository.AddressRepository;
import in.ashokit.repository.EmployeeRepository;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

	EmployeeRepository employeeRepository;
	AddressRepository  addressRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository,AddressRepository  addressRepository ) {
		this.addressRepository =addressRepository;
		this.employeeRepository =employeeRepository;	
	}
	
	@Transactional(rollbackOn = Exception.class)
	public void saveData() {
		
		Employee emp =new Employee();
		emp.setEmpId(103);
		emp.setEmpName("Aarya");
		emp.setEmpSal(950000);
		
		employeeRepository.save(emp);
		
		//int a =10/0;
		
		Address address =new Address();
		address.setAddId(503);
		address.setEmpId(103);
		address.setEmpCity("Mumbai");
		address.setEmpCountry("India");
		address.setEmpState("MH");
		
		addressRepository.save(address);
	}
}

