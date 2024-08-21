package com.spring3.oauth.jwt.entity;

import com.spring3.oauth.jwt.entity.enums.ReviewStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "performance_review")
public class PerfomanceReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "review_period_start")
    private LocalDate reviewPeriodStart;

    @Column(name = "review_period_end")
    private LocalDate reviewPeriodEnd;

    @Column(name = "overall_rating")
    private BigDecimal overallRating;

    private String comments;
    private ReviewStatus status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "reviewer_id")
    private User reviewer;
}
