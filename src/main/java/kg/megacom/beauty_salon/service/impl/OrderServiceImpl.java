package kg.megacom.beauty_salon.service.impl;

import kg.megacom.beauty_salon.dao.MasterRep;
import kg.megacom.beauty_salon.dao.OrderRep;
import kg.megacom.beauty_salon.mappers.ClientMapper;
import kg.megacom.beauty_salon.mappers.MasterMapper;
import kg.megacom.beauty_salon.mappers.OrderMapper;
import kg.megacom.beauty_salon.models.dto.ClientDto;
import kg.megacom.beauty_salon.models.dto.MasterDto;
import kg.megacom.beauty_salon.models.dto.OrderDto;
import kg.megacom.beauty_salon.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    MasterRep masterRep;
    MasterMapper masterMapper=MasterMapper.INSTANCE;
    ClientMapper clientMapper=ClientMapper.INSTANCE;

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


    //Этот метод пока непрвильный,не понимаю что он должен возвращать

    @Override
    public String create(Long clientId, Long masterId,String appDate) throws ParseException {
        OrderDto orderDto = new OrderDto();
        ClientDto clientDto=new ClientDto();
        clientDto.setId(clientId);
        orderDto.setClient(clientMapper.toEntity(clientDto));
        orderDto.setAddDate(new Date());
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date docDate= format.parse(appDate);
        orderDto.setAppointmentDate(docDate);
        MasterDto masterDto =new MasterDto();
        masterRep.findAll();
        masterDto.setId(masterId);
        orderDto.setMaster(masterMapper.toEntity(masterDto));
        rep.save(mapper.toEntity(orderDto));

        return "good";
    }


}

