package br.com.netbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.netbook.jpa.JPAUser;

@Repository
public interface UserRepository extends JpaRepository<JPAUser, Long> {

}
