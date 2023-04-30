package org.rent.circle.address.dto.runtime;

import lombok.Data;

@Data
public class AddressDto {

    private String address1;

    private String address2;

    private String zipcode;

    private String city;

    private String stateCode;
}
