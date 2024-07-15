package douglas.dipe.adapters.in.dto;

import douglas.dipe.domain.model.Address;

public record AddressDTO(
        int number,
        String street,
        String neighborhood,
        String city,
        String zipCode
) {
    public Address doAddress() {
        return new Address(
                number,
                street,
                neighborhood,
                city,
                zipCode
        );
    }
}
