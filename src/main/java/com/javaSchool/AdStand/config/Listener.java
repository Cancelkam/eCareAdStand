package com.javaSchool.AdStand.config;

import com.javaSchool.AdStand.model.Tariff;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.sound.midi.Soundbank;

@PropertySource(value = "classpath:application.properties")
@Component
@Slf4j
public class Listener implements MessageListener {

    @Override
    @JmsListener(destination = "${activemq.destination}")
    public void onMessage(Message message) {
        try {
            ObjectMessage objectMessage = (ObjectMessage) message;
            Tariff tariff = (Tariff) objectMessage.getObject();
            //do additional processing
            System.out.println("Received Message: " + tariff.toString());
        } catch (Exception e) {
            System.out.println("Received Exception : " + e);
        }

    }

}