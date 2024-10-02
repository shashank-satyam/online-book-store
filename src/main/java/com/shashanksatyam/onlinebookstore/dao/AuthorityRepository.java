package com.shashanksatyam.onlinebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shashanksatyam.onlinebookstore.entity.Authority;
import com.shashanksatyam.onlinebookstore.entity.AuthorityId;

@RepositoryRestResource
public interface AuthorityRepository extends JpaRepository<Authority, AuthorityId> {

}
