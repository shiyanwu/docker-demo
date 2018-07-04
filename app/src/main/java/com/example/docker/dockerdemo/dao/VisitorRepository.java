package com.example.docker.dockerdemo.dao;

import com.example.docker.dockerdemo.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author shiyanwu
 */
public interface VisitorRepository extends JpaRepository<Visitor, String> {

    Visitor findByIp(String ip);
}
