package org.property.management.address.dto.runtime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {

    private String address1;

    private String address2;

    private String zipcode;

    private String city;

    private String stateCode;
}