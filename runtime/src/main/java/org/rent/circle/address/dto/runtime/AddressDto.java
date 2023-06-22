package org.rent.circle.address.dto.runtime;

import lombok.Data;

@Data
public class AddressDto {

    private String street1;

    private String street2;

    private String zipcode;

    private String city;

    private String stateCode;
}
