package jpabasic.section8_example.domain;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

//@MappedSuperclass
public abstract class BaseEntity {
    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
