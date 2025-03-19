package com.duyanh.jobportal.repository;

import com.duyanh.jobportal.entity.JobPostActivity;
import com.duyanh.jobportal.entity.JobSeekerApply;
import com.duyanh.jobportal.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);

    @Transactional
    @Modifying
    @Query("DELETE FROM JobSeekerApply j WHERE j.job.jobPostId = :jobId")
    void deleteByJobId(@Param("jobId") Integer jobId);
}
