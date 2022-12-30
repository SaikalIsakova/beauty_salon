package kg.megacom.beauty_salon.service.impl;

import kg.megacom.beauty_salon.dao.MasterRep;
import kg.megacom.beauty_salon.dao.OrderRep;
import kg.megacom.beauty_salon.dao.SalonRep;
import kg.megacom.beauty_salon.mappers.ClientMapper;
import kg.megacom.beauty_salon.mappers.MasterMapper;
import kg.megacom.beauty_salon.mappers.OrderMapper;
import kg.megacom.beauty_salon.mappers.SalonMapper;
import kg.megacom.beauty_salon.models.dto.ClientDto;
import kg.megacom.beauty_salon.models.dto.MasterDto;
import kg.megacom.beauty_salon.models.dto.OrderDto;
import kg.megacom.beauty_salon.models.dto.SalonDto;
import kg.megacom.beauty_salon.models.request.OrderRequest;
import kg.megacom.beauty_salon.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRep rep;

    OrderMapper mapper=OrderMapper.INSTANCE;

    @Override
    public OrderDto save(OrderDto orderDto) {
        return mapper.toDto(rep.save(mapper.toEntity(orderDto)));
    }

    @Override
    public OrderDto findById(Long id) {

        return mapper.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("Запись не найдена")));
    }

    @Override
    public List<OrderDto> findAll() {

        return mapper.toDtos(rep.findAll());
    }

    @Override
    public OrderDto delete(Long id) {
        return null;
    }


        @Autowired
        MasterRep masterRep;
    MasterMapper masterMapper=MasterMapper.INSTANCE;
    ClientMapper clientMapper=ClientMapper.INSTANCE;


    //Этот метод пока непрвильный,не понимаю что он должен возвращать
    @Override
    public OrderDto createOrder( String name,String surname,String phoneNumber,String email,Long masterId) {

        OrderDto orderDto=new OrderDto();
        ClientDto clientDto=new ClientDto();
        clientDto.setId(clientDto.getId());
        clientDto.setName(name);
        clientDto.setSurname(surname);
        clientDto.setPhoneNumber(phoneNumber);
        clientDto.setEmail(email);
        orderDto.setClient(clientMapper.toEntity(clientDto));
        orderDto.setAddDate(new Date());
        MasterDto masterDto=new MasterDto();
//        masterDto.setId(masterRep.findById(masterId));
        orderDto.setMaster(masterMapper.toEntity(masterDto));

        return mapper.toDto(rep.save(mapper.toEntity(orderDto)));
    }
}
