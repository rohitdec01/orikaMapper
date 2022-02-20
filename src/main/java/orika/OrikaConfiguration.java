package orika;

import dto.EmployeeDto;
import entity.EmployeeEntitu;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

public class OrikaConfiguration extends ConfigurableMapper {

    @Override
    protected void configure(MapperFactory factory) {
        factory.classMap(EmployeeEntitu.class, EmployeeDto.class)
                .field("lastName", "familyName") // when the properties are not same.
                .byDefault() // to register all by default properties who name or type is same.
                .register();
    }
}
