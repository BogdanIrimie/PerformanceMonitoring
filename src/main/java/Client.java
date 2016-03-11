import benchmarking.Monitoring;
import datamodel.ComponentPerformance;
import dmon.core.commons.helpers.PidManipulation;
import dmon.core.commons.mongo.MongoManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import rabbit.Receiver;

import java.awt.*;

public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        MDC.put("pid", PidManipulation.getPid());
        logger.info("Performance monitoring is started!");

        Receiver receiver = new Receiver();
        receiver.startReceiving();

        MDC.clear();
    }
}
