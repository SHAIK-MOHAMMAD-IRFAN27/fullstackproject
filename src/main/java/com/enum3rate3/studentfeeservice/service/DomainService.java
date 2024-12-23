package com.enum3rate3.studentfeeservice.service;

import com.enum3rate3.studentfeeservice.model.Domain;
import com.enum3rate3.studentfeeservice.repo.DomainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomainService {
    @Autowired
    private DomainRepo domainRepo;

    public Domain createDomain(Domain domain) {
        return domainRepo.save(domain);
    }
}