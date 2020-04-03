package com.industrybuying.springbatch.repository;

import com.industrybuying.springbatch.model.MessageDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MessageDetailRepository extends JpaRepository<MessageDetail,Integer> {

    List<MessageDetail> findAllByMessageContaining(String message);

}
