package com.industrybuying.springbatch.service.impl;

import com.industrybuying.springbatch.dto.*;
import com.industrybuying.springbatch.model.MessageDetail;
import com.industrybuying.springbatch.repository.MessageDetailRepository;
import com.industrybuying.springbatch.service.MessageDetailService;
import com.industrybuying.springbatch.utility.PerformanceTimer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageDetailServiceImpl implements MessageDetailService {

    @Autowired
    private MessageDetailRepository messageDetailRepo;

    @Override
    public MessageDetailDTO getMessageDetail(String query) {
        PerformanceTimer performanceTimer = new PerformanceTimer("Fetching Message Detail");
        int total = 0, truth_spam = 0, truth_not_spam = 0,cube_spam = 0, cube_not_spam = 0 , google_spam = 0 , google_not_spam = 0,ibm_spam = 0,
        ibm_not_spam = 0 ;
        double sum_google_spam = 0, sum_google_not_spam = 0,  sum_ibm_spam = 0, sum_ibm_not_spam = 0;
        List<MessageDetail> messageDetailList= messageDetailRepo.findAllByMessageContaining(query);
        total = messageDetailList.size();

        for(MessageDetail messageDetail: messageDetailList){
            if(messageDetail.getTruth().equals("spam"))
                truth_spam++;
            else
                truth_not_spam++;

            if(messageDetail.getCubee().equals("spam"))
                cube_spam++;
            else cube_not_spam++;

            if(messageDetail.getGoogle().equals("spam"))
                google_spam++;
            else
                google_not_spam++;

            sum_google_spam += messageDetail.getGoogleSpam();
            sum_google_not_spam += messageDetail.getGoogleNotSpam();

            if(messageDetail.getIbm().equals("spam"))
                ibm_spam++;
            else
                ibm_not_spam++;

            sum_ibm_spam += messageDetail.getIbmSpam();
            sum_ibm_not_spam += messageDetail.getIbmNotSpam();
        }

        Truth truth = new Truth();
        truth.setSpam(truth_spam);
        truth.setNot_spam(truth_not_spam);

        Cubee cubee = new Cubee();
        cubee.setSpam(cube_spam);
        cubee.setNot_spam(cube_not_spam);

        Google google = new Google();
        google.setSpam(google_spam);
        google.setNot_spam(google_not_spam);
        google.setAvg_spam_score(sum_google_spam/total);
        google.setAvg_not_spam_score(sum_google_not_spam/total);

        Ibm ibm = new Ibm();
        ibm.setSpam(ibm_spam);
        ibm.setNot_spam(ibm_not_spam);
        ibm.setAvg_spam_score(sum_ibm_spam/total);
        ibm.setAvg_not_spam_score(sum_ibm_not_spam/total);


        MessageDetailDTO messageDetailDTO =  new MessageDetailDTO();
        messageDetailDTO.setTotal(messageDetailList.size());
        messageDetailDTO.setTruth(truth);
        messageDetailDTO.setCube(cubee);
        messageDetailDTO.setGoogle(google);
        messageDetailDTO.setIbm(ibm);
        performanceTimer.display();
        return messageDetailDTO;
    }
}
