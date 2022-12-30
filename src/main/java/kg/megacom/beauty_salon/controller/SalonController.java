package kg.megacom.beauty_salon.controller;

import com.sun.xml.internal.ws.api.addressing.WSEndpointReference;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.beauty_salon.models.dto.SalonDto;
import kg.megacom.beauty_salon.service.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Салон")
@RestController
@RequestMapping("/api/v2/salon")
public class SalonController {

    @Autowired
    SalonService service;

    @ApiOperation("Создание салона")
    @PostMapping("/save")
    SalonDto save(@RequestBody SalonDto salonDto) {
        return service.save(salonDto);
    }

    @ApiOperation("Найти по номеру")
    @GetMapping("/find/by/id")
    SalonDto findById(@RequestParam Long id){
        return service.findById(id);
    }

    @ApiOperation("Вывод списка салонов")
    @GetMapping("/find/all")
    List<SalonDto>findAll(){
        return service.findAll();
    }

    @ApiOperation("Удаление салона")
    @DeleteMapping("/delete")
    SalonDto delete(@RequestParam Long id){
        return service.delete(id);
    }


}
