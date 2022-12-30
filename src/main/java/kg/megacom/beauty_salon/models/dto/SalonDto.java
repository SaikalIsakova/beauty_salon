package kg.megacom.beauty_salon.models.dto;

import kg.megacom.beauty_salon.models.Salon;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Optional;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SalonDto {
    Long id;
    String name;
    String address;
    String phoneNumber;

}
