/*
 * @ (#) Doctor.java 1.0 7/11/2025
 *
 * Copyright (c) 2025 IUH.All rights reserved
 */

package se.benhvien1a.model;

/*
 * @description
 * @author : Nguyen Truong An
 * @date : 7/11/2025
 * @version 1.0
 */
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String degree;
    private String position;
    private String department;
    private String experience;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    private boolean isActive = true;
}