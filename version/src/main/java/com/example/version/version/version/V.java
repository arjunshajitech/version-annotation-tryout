package com.example.version.version.version;

import java.util.UUID;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "v")
public class V {
    
    @Id
    @GeneratedValue()
    private UUID id;
    private String name;
    private int age;

    @Version
    private int version;

    public V(String name,int age) {
        this.name = name;
        this.age = age;
    }

}
