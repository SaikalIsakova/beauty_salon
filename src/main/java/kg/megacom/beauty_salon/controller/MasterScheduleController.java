package kg.megacom.beauty_salon.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.beauty_salon.mappers.MasterScheduleMapper;
import kg.megacom.beauty_salon.models.Master;
import kg.megacom.beauty_salon.models.MasterSchedule;
import kg.megacom.beauty_salon.models.dto.MasterScheduleDto;
import kg.megacom.beauty_salon.service.MasterScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/schedule")
@Api(tags = "График")
public class MasterScheduleController {

    @Autowired
    MasterScheduleService service;

    MasterScheduleMapper mapper=MasterScheduleMapper.INSTANCE;

    @PostMapping("/save")
    @ApiOperation("Сохранение графика")
    MasterScheduleDto save(@RequestBody MasterScheduleDto masterScheduleDto){
        return service.save(masterScheduleDto);

    }

    @GetMapping("/find/by/id")
    @ApiOperation("Найти график по id")
    MasterScheduleDto findById(@RequestParam Long id){
        return service.findById(id);
    }

    @GetMapping("/find/all")
    @ApiOperation("Вывод графика")
    List<MasterScheduleDto>findAll(){
        return service.findAll();
    }

    @DeleteMapping("/delete")
    @ApiOperation("Удаление графика")
    MasterScheduleDto delete(@RequestParam Long id){
        return service.delete(id);
    }

}
