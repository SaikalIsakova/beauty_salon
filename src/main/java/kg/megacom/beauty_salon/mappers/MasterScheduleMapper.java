package kg.megacom.beauty_salon.mappers;

import kg.megacom.beauty_salon.dao.MasterScheduleRep;
import kg.megacom.beauty_salon.models.MasterSchedule;
import kg.megacom.beauty_salon.models.dto.MasterScheduleDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MasterScheduleMapper extends BaseMapper<MasterSchedule, MasterScheduleDto>{
    MasterScheduleMapper INSTANCE= Mappers.getMapper(MasterScheduleMapper.class);
}
