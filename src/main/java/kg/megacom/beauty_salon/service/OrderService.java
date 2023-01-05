package kg.megacom.beauty_salon.service;

import kg.megacom.beauty_salon.models.dto.MasterDto;
import kg.megacom.beauty_salon.models.dto.OrderDto;
import kg.megacom.beauty_salon.models.request.OrderRequest;
import org.springframework.data.jpa.repository.Query;

import java.text.ParseException;

public interface OrderService extends BaseService<OrderDto>{

    String create(Long clientId,Long masterId,String appDate)throws ParseException;
}
