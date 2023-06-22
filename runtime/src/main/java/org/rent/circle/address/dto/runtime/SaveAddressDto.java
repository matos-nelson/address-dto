package org.rent.circle.address.dto.runtime;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaveAddressDto {

    @NotBlank(message = "Street address may not be blank")
    private String street1;

    private String street2;

    @NotBlank(message = "Zipcode may not be blank")
    private String zipcode;

    @NotBlank(message = "City may not be blank")
    private String city;

    @NotBlank(message = "State may not be blank")
    private String stateCode;
}
