/*
 * @ (#) News.java 1.0 7/11/2025
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
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String slug;
    @Column(columnDefinition = "TEXT")
    private String content;
    private String image;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "news_categories",
            joinColumns = @JoinColumn(name = "news_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories = new HashSet<>();
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    private boolean isActive;

    // Ensure at least one category
    @PrePersist
    @PreUpdate
    public void validateCategories() {
        if (categories == null || categories.isEmpty()) {
            throw new IllegalArgumentException("Each news article must have at least one category (tag)");
        }
    }
}