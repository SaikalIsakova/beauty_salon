package kg.megacom.beauty_salon.service;

import kg.megacom.beauty_salon.models.dto.MasterDto;
import kg.megacom.beauty_salon.models.dto.OrderDto;
import kg.megacom.beauty_salon.models.request.OrderRequest;
import org.springframework.data.jpa.repository.Query;

public interface OrderService extends BaseService<OrderDto>{

    OrderDto createOrder(String name,String surname,String phoneNumber,String email,Long masterId);
}
