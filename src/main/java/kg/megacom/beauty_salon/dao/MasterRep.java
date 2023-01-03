package kg.megacom.beauty_salon.dao;

import kg.megacom.beauty_salon.models.Master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MasterRep extends JpaRepository<Master,Long> {

    @Query("select s from MasterSchedule s inner join Master m on s.id=:id where s.id=m.schedule.id")
    List<Master> findScheduleByMasterId(Long id);

    @Query("select m from Master m inner join Salon s on m.salon.id=:salonId")
    List<Master> findMasterBySalonId(Long salonId);
}
