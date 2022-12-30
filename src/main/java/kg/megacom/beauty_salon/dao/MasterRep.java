package kg.megacom.beauty_salon.dao;

import kg.megacom.beauty_salon.models.Master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterRep extends JpaRepository<Master,Long> {

    @Query("select m from Master m inner join MasterSchedule s on s.id=:id where s.id=m.schedule.id")
    Master findMasterScheduleById(Long id);
}
