package kg.megacom.beauty_salon.service.impl;

import kg.megacom.beauty_salon.dao.ClientRep;
import kg.megacom.beauty_salon.mappers.ClientMapper;
import kg.megacom.beauty_salon.models.Client;
import kg.megacom.beauty_salon.models.dto.ClientDto;
import kg.megacom.beauty_salon.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    ClientMapper mapper=ClientMapper.INSTANCE;
    @Autowired
    ClientRep rep;


    @Override
    public ClientDto save(ClientDto clientDto) {
        return mapper.toDto(rep.save(mapper.toEntity(clientDto)));
    }

    @Override
    public ClientDto findById(Long id) {

        return mapper.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("Клиент не найден")));
    }

    @Override
    public List<ClientDto> findAll() {

        return mapper.toDtos(rep.findAll());
    }

    @Override
    public ClientDto delete(Long id) {

        return null;
    }
}
