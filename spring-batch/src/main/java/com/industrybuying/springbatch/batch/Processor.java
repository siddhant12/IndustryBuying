package com.industrybuying.springbatch.batch;

import com.industrybuying.springbatch.model.MessageDetail;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<MessageDetail,MessageDetail> {

    @Override
    public MessageDetail process(MessageDetail messageDetail) throws Exception {
        return messageDetail;
    }
}
