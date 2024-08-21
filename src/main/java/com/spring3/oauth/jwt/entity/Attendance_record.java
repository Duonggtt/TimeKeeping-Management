package com.spring3.oauth.jwt.entity;

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
    private long id;

    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private LocalDateTime date;
    private BigDecimal totalHours;
    private BigDecimal totalOvertime;

}
