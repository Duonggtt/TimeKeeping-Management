package com.spring3.oauth.jwt.entity;

import com.spring3.oauth.jwt.entity.enums.RecordStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "attendance_record")
public class Attendance_record {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "checked_in")
    private LocalDateTime checkedIn;

    @Column(name = "checked_out")
    private LocalDateTime checkedOut;
    private LocalDateTime date;

    @Column(name = "total_hours")
    private BigDecimal totalHours;

    @Column(name = "total_overtime")
    private BigDecimal totalOvertime;

    private RecordStatus status;

}
