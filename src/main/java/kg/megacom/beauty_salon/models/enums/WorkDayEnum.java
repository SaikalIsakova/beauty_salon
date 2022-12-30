package kg.megacom.beauty_salon.models.enums;

public enum WorkDayEnum {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    int value;

    WorkDayEnum(int value) {
        this.value = value;
    }
}
