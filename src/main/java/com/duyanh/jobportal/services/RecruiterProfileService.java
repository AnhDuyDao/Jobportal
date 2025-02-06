package com.duyanh.jobportal.services;

import com.duyanh.jobportal.entity.RecruiterProfile;
import com.duyanh.jobportal.repository.RecruiterProfileRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecruiterProfileService {
    private final RecruiterProfileRepository recruiterProfileRepository;


    public RecruiterProfileService(RecruiterProfileRepository recruiterProfileRepository) {
        this.recruiterProfileRepository = recruiterProfileRepository;
    }

    public Optional<RecruiterProfile> getOne(Integer id) {
        return recruiterProfileRepository.findById(id);
    }

    public RecruiterProfile addNew(RecruiterProfile recruiterProfile) {
        return recruiterProfileRepository.save(recruiterProfile);
    }
}
