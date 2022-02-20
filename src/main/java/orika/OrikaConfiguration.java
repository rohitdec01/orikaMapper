package orika;

import dto.EmployeeDto;
import entity.EmployeeEntitu;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import orika.mapper.AddressEntityToAddressDtoMapper;

public class OrikaConfiguration extends ConfigurableMapper {

    @Override
    protected void configure(MapperFactory factory) {
        factory.classMap(EmployeeEntitu.class, EmployeeDto.class)
                .field("lastName", "familyName") // when the properties are not same.
                .byDefault() // to register all by default properties who's property name or type is same.
                .register();

        // Because state property in Entity class is different in dto class. And to create a totally
        // custom object we have to create a custom mapper
        ConverterFactory converterFactory = factory.getConverterFactory();
        converterFactory.registerConverter(new AddressEntityToAddressDtoMapper());
    }
}
