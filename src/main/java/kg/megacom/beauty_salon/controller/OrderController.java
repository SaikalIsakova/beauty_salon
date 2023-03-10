package kg.megacom.beauty_salon.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.beauty_salon.mappers.OrderMapper;
import kg.megacom.beauty_salon.models.dto.OrderDto;
import kg.megacom.beauty_salon.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/api/v2/order")
@Api(tags = "Запись")
public class OrderController {

    @Autowired
    OrderService service;

    OrderMapper mapper = OrderMapper.INSTANCE;

    @PostMapping("/save")
    @ApiOperation("Сохранение записи")
    OrderDto save(@RequestBody OrderDto orderDto) {
        return service.save(orderDto);
    }

    @GetMapping("/find/by/id")
    @ApiOperation("Найти запись по id")
    OrderDto findById(@RequestParam Long id) {
        return service.findById(id);
    }

    @GetMapping("/find/all")
    @ApiOperation("Вывод всех записей")
    List<OrderDto> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/delete")
    @ApiOperation("Удаление записи")
    OrderDto delete(@RequestParam Long id) {
        return service.delete(id);
    }


   @PostMapping("/save/order")
    String createOrder(@RequestParam Long clientId,@RequestParam Long masterId,@RequestParam String appDate) throws ParseException {
        return service.create(clientId,masterId,appDate);
 }
}
