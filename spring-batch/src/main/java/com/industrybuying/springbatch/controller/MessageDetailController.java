package com.industrybuying.springbatch.controller;

import com.industrybuying.springbatch.dto.MessageDetailDTO;
import com.industrybuying.springbatch.service.MessageDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageDetailController {

    @Autowired
    private MessageDetailService messageDetailService;

    @GetMapping("/search")
    public ResponseEntity<MessageDetailDTO> getDetailsOfMessages(@RequestParam("query") String query){
       MessageDetailDTO messageDetails = messageDetailService.getMessageDetail(query);
       return new ResponseEntity<>(messageDetails, HttpStatus.OK);
    }
}
