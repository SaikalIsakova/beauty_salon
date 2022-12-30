package kg.megacom.beauty_salon.models;

import kg.megacom.beauty_salon.models.enums.MasterWorkTypeEnum;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name="tb_master")
public class Master {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;
    @ManyToOne
    @JoinColumn(name="salon_id")
    Salon salon;
    @ManyToOne
    @JoinColumn(name="schedule_id")
    MasterSchedule schedule;
    @Enumerated(EnumType.STRING)
    MasterWorkTypeEnum workType;


}
