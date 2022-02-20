package orika.mapper;

import dto.AddressDto;
import entity.AddressEntity;
import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.metadata.Type;

public class AddressEntityToAddressDtoMapper extends CustomConverter<AddressEntity, AddressDto> {

    public AddressDto convert(AddressEntity addressEntity, Type<? extends AddressDto> type, MappingContext mappingContext) {
        AddressDto addressDto = new AddressDto();
        addressDto.setCity(addressEntity.getCity());
        addressDto.setProvinces(addressEntity.getState()); // this is different in both the objects.
        addressDto.setZip(addressEntity.getZip());

        return addressDto;
    }
}
