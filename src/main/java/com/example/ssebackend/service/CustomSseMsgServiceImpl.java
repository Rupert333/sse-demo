package com.example.ssebackend.service;

import com.block.idgenerator.IdGenerator;
import com.block.sse.starter.domain.MsgRequest;
import com.block.sse.starter.service.SseMsgService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class CustomSseMsgServiceImpl implements SseMsgService {
    @Resource
    private IdGenerator idGenerator;

    @Override
    public String generateMsgId() {
        return idGenerator.generate();
    }

    @Override
    public List<MsgRequest> getMessagesAfter(String clientId, String lastEventId) {
        return List.of();
    }
}
