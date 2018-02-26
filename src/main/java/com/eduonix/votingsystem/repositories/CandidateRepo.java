/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduonix.votingsystem.repositories;

import com.eduonix.votingsystem.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Oksana
 */
@Repository
public interface CandidateRepo extends JpaRepository<Candidate, Integer> {
    public Candidate findById(Long id);
}
