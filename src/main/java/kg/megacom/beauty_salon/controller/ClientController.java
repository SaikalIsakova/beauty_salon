package kg.megacom.beauty_salon.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.beauty_salon.mappers.ClientMapper;
import kg.megacom.beauty_salon.models.dto.ClientDto;
import kg.megacom.beauty_salon.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/client")
@Api(tags = "Клиент")
public class ClientController {

    @Autowired
    ClientService service;

    ClientMapper mapper=ClientMapper.INSTANCE;

    @PostMapping("/save")
    @ApiOperation("Сохранение клиента")
    ClientDto save(@RequestBody ClientDto clientDto){
        return service.save(clientDto);
    }

    @GetMapping("/find/by/id")
    @ApiOperation("Найти по id")
    ClientDto findById(@RequestParam Long id){
        return service.findById(id);
    }

    @GetMapping("/find/all")
    @ApiOperation("Вывод списка клиентов")
    List<ClientDto>findAll(){
        return service.findAll();
    }

    @DeleteMapping("/delete")
    @ApiOperation("Удаление клиента")
    ClientDto delete(@RequestParam Long id){
        return service.delete(id);
    }
}
