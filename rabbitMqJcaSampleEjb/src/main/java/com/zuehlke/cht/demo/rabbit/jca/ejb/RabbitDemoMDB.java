package com.zuehlke.cht.demo.rabbit.jca.ejb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Envelope;
import com.zuehlke.cht.demo.rabbit.jca.rar.RabbitListener;
import java.util.Base64;

@MessageDriven(activationConfig = { 
		@ActivationConfigProperty(propertyName = "queueName", propertyValue = "hello") 
})
public class RabbitDemoMDB implements RabbitListener {
	@Override
	public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties, byte[] body) {
		System.out.println("handleDelivery(...) -> " + Base64.getEncoder().encodeToString(body)); //DEBUG
	}
}
