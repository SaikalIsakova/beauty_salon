package kg.megacom.beauty_salon.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.beauty_salon.mappers.MasterMapper;
import kg.megacom.beauty_salon.models.dto.MasterDto;
import kg.megacom.beauty_salon.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2/master")
@Api(tags = "Мастер")
public class MasterController {

    @Autowired
    MasterService service;

    MasterMapper mapper=MasterMapper.INSTANCE;


    @PostMapping("/save")
    @ApiOperation("Сохранение мастера")
    MasterDto save(@RequestBody MasterDto masterDto){
        return service.save(masterDto);
    }

    @GetMapping("/find/by/id")
    @ApiOperation("Найти по id")
    MasterDto findById(@RequestParam Long id){
        return service.findById(id);
    }

    @GetMapping("/find/all")
    @ApiOperation("Вывод списка мастеров")
    List<MasterDto> findAll(){
        return service.findAll();
    }

    @DeleteMapping("/delete")
    @ApiOperation("Удаление мастера")
    MasterDto delete(@RequestParam Long id){
        return service.delete(id);
    }

    @GetMapping("/find")
    @ApiOperation("График мастера")
   List <MasterDto> find(@RequestParam Long id){
        return service.findScheduleByMasterId(id);
    }

    @GetMapping("/find/master/by/salon")
    List<MasterDto> findMasterBySalon(@RequestParam Long id){
        return service.findBySalonId(id);
    }

}
