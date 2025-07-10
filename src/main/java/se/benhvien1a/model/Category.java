/*
 * @ (#) Categories.java 1.0 7/11/2025
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

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String slug;
}