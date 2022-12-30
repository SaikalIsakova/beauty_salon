package kg.megacom.beauty_salon.models.request;

import kg.megacom.beauty_salon.models.Salon;
import kg.megacom.beauty_salon.models.dto.ClientDto;
import kg.megacom.beauty_salon.models.dto.MasterDto;
import kg.megacom.beauty_salon.models.dto.SalonDto;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderRequest {
    ClientDto clientDto;
    SalonDto salonDto;
    MasterDto masterDto;

}
