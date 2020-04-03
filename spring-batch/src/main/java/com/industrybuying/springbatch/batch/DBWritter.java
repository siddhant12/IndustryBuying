package com.industrybuying.springbatch.batch;

import com.industrybuying.springbatch.model.MessageDetail;
import com.industrybuying.springbatch.repository.MessageDetailRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWritter implements ItemWriter<MessageDetail> {

    @Autowired
    private MessageDetailRepository messageDetailRepository;

    @Override
    public void write(List<? extends MessageDetail> list) throws Exception {
        messageDetailRepository.saveAll(list);
    }
}
