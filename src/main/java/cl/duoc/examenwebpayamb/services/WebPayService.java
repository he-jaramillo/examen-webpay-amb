package cl.duoc.examenwebpayamb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import cl.duoc.examenwebpayamb.clients.WebPayFeignClient;
import cl.duoc.examenwebpayamb.model.dto.WebPayTransactionInitRequest;
import cl.duoc.examenwebpayamb.model.dto.WebPayTransactionInitResponse;

@Service
public class WebPayService {
    
    @Autowired
    WebPayFeignClient webPayFeignClient;

    @Value("${webpay.headers.api-key-id}")
    private String webPayApiKeyId;

    @Value("${webpay-headers.api-key-secret}")
    private String webPayApiKeySecret;

    public WebPayTransactionInitResponse initTransaction(WebPayTransactionInitRequest request){
        return webPayFeignClient.initTransaction(webPayApiKeyId, webPayApiKeySecret, request);
        
    }
}