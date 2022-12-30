package kg.megacom.beauty_salon.service.impl;

import kg.megacom.beauty_salon.dao.MasterScheduleRep;
import kg.megacom.beauty_salon.mappers.MasterScheduleMapper;
import kg.megacom.beauty_salon.models.MasterSchedule;
import kg.megacom.beauty_salon.models.dto.MasterScheduleDto;
import kg.megacom.beauty_salon.service.MasterScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MasterScheduleServiceImpl implements MasterScheduleService {
    @Autowired
    MasterScheduleRep rep;

    MasterScheduleMapper mapper=MasterScheduleMapper.INSTANCE;

    @Override
    public MasterScheduleDto save(MasterScheduleDto masterScheduleDto) {
        return mapper.toDto(rep.save(mapper.toEntity(masterScheduleDto)));
    }

    @Override
    public MasterScheduleDto findById(Long id) {

        return mapper.toDto(rep.findById(id).orElseThrow(()-> new RuntimeException("Аккаунт не найден")));
    }

    @Override
    public List<MasterScheduleDto> findAll() {

        return mapper.toDtos(rep.findAll());
    }

    @Override
    public MasterScheduleDto delete(Long id) {

        return null;
           }


}
