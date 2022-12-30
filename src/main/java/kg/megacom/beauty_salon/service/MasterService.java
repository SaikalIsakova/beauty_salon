package kg.megacom.beauty_salon.service;

import kg.megacom.beauty_salon.models.Master;
import kg.megacom.beauty_salon.models.dto.MasterDto;

import java.util.List;

public interface MasterService extends BaseService<MasterDto>{
    MasterDto find(Long id);
    List<MasterDto> findBySalonId(Long id);
}
