import dto.EmployeeDto;
import entity.EmployeeEntitu;
import ma.glasnost.orika.MapperFacade;
import orika.OrikaConfiguration;

public class Main {
    private static MapperFacade mapperFacade = new OrikaConfiguration();

    public static void main(String args[]) {
        System.out.println("********Simple Orika mapping when properties are same******************");
        simpleOrikaMapping();
        System.out.println("*****************************************");
    }

    private static void simpleOrikaMapping() {
        // Convert simple mapping using Orika mapper
        EmployeeEntitu empEntity = new EmployeeEntitu();
        empEntity.setId(1);
        empEntity.setName("Rohit");
        empEntity.setLastName("Bhatia");

        EmployeeDto empDto = mapperFacade.map(empEntity, EmployeeDto.class);
        System.out.println("Simple mapping from empEntity to empDto " +  empDto);
    }
}
