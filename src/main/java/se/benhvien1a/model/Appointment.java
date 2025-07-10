/*
 * @ (#) Appointment.java 1.0 7/11/2025
 *
 * Copyright (c) 2025 IUH.All rights reserved
 */

package se.benhvien1a.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/*
 * @description
 * @author : Nguyen Truong An
 * @date : 7/11/2025
 * @version 1.0
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String phone;
    private LocalDateTime dob;
    private LocalDateTime preferredDate;
    private String message;
    private AppointmentStatus status; // pending, confirmed, done, cancelled
}