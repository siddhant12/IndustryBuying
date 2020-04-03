package com.industrybuying.springbatch.service;

import com.industrybuying.springbatch.dto.MessageDetailDTO;
import org.springframework.stereotype.Service;


public interface MessageDetailService {
    public MessageDetailDTO getMessageDetail(String query);
}
