package com.mccoyale.springboot.backlogapp;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface backlogrepo extends JpaRepository < backlog, Long > {
    List < backlog > findByUserName(String user);
}