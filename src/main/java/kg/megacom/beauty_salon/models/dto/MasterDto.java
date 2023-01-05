package kg.megacom.beauty_salon.models.dto;

import kg.megacom.beauty_salon.models.MasterSchedule;
import kg.megacom.beauty_salon.models.Salon;
import kg.megacom.beauty_salon.models.enums.MasterWorkTypeEnum;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MasterDto {
    Long id;
    String name;
    String surname;
    Salon salon;
    MasterSchedule schedule;
    MasterWorkTypeEnum workType;

}
