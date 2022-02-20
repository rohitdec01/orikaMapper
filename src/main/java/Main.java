import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;
import dto.EmployeeDto;
import entity.AddressEntity;
import entity.EmployeeEntitu;
import ma.glasnost.orika.MapperFacade;
import orika.OrikaConfiguration;

public class Main {
    private static MapperFacade mapperFacade = new OrikaConfiguration();

    public static void main(String args[]) {
        System.out.println("********Simple Orika mapping when properties are same******************");
        orikaMapping();
        System.out.println("*****************************************");
    }

    private static void orikaMapping() {
        EmployeeEntitu empEntity = buildEmployeeEntity();
        EmployeeDto empDto = mapperFacade.map(empEntity, EmployeeDto.class);
        System.out.println("Simple mapping from empEntity to empDto " +  empDto);
    }

    private static EmployeeEntitu buildEmployeeEntity() {
        EmployeeEntitu employeeEntitu = new EmployeeEntitu();
        employeeEntitu.setId(1);
        employeeEntitu.setName("Rohit");
        employeeEntitu.setLastName("Bhatia");
        employeeEntitu.setAddress(buildAddressEntity()); // Notice AddressEntityToAddressDtoMapper mapper to convert.
        return employeeEntitu;
    }

    private static AddressEntity buildAddressEntity() {
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setCity("Lisle");
        addressEntity.setState("IL");
        addressEntity.setZip("60532");
        return addressEntity;
    }
}
