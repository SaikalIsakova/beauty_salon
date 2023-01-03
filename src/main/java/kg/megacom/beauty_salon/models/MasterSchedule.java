package kg.megacom.beauty_salon.models;

import kg.megacom.beauty_salon.models.enums.WorkDayEnum;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name="tb_schedule")
public class MasterSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Temporal(TemporalType.TIME)
    Date startTime;
    @Temporal(TemporalType.TIME)
    Date endTime;
    @Enumerated(EnumType.STRING)
    WorkDayEnum workDay;

}
