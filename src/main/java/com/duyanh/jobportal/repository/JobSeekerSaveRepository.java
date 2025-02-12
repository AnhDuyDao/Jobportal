package com.duyanh.jobportal.repository;

import com.duyanh.jobportal.entity.JobPostActivity;
import com.duyanh.jobportal.entity.JobSeekerProfile;
import com.duyanh.jobportal.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {
    List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}
