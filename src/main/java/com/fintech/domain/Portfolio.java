package com.fintech.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record Portfolio(@Id Long id, String name) {
}