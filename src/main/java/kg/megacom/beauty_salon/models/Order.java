package kg.megacom.beauty_salon.models;

import kg.megacom.beauty_salon.models.enums.OrderStatusEnum;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name="tb_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date addDate;
    Date updateDate;
    Date appointmentDate;
    @Enumerated(EnumType.STRING)
    OrderStatusEnum status;

    @ManyToOne
    @JoinColumn(name="client_id")
    Client client;

    @ManyToOne
    @JoinColumn(name="master_id")
    Master master;





}
