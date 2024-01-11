package dev.leoduarte.designpatterns.visitor;

import dev.leoduarte.designpatterns.visitor.implementations.*;

public class VisitorTest {

    // Youtube Video
    // https://youtu.be/UQP5XqMqtqQ

    public static void main(String[] args) {
        CustomerA customerA = getCustomerA();
        CustomerB customerB = getCustomerB();
        CustomerC customerC = getCustomerC();

        // Send EMAIL for ALL
        customerA.acceptVisitor(new VisitorSendEmailMarketing());
        customerB.acceptVisitor(new VisitorSendEmailMarketing());
        customerC.acceptVisitor(new VisitorSendEmailMarketing());


        // Sending SLACK MESSAGE for CustomerB and CustomerC
        System.out.println("==================================");
        customerB.acceptVisitor(new VisitorSendSlackMarketing());
        customerC.acceptVisitor(new VisitorSendSlackMarketing());


        // Sending WHATSAPP just for the CustomerC
        System.out.println("==================================");
        customerC.acceptVisitor(new VisitorSendEmailMarketing());

    }

    private static CustomerA getCustomerA() {
        return CustomerA.builder()
                .onlyCustomerAProperty("Cliente AAAA")
                .name("ClienteA")
                .lastName("AbrAcAdAbrA").build();
    }

    private static CustomerB getCustomerB() {
        return CustomerB.builder()
                .onlyCustomerBProperty("Cliente BBBB")
                .name("ClienteB")
                .lastName("aBBracadaBBra").build();
    }

    private static CustomerC getCustomerC() {
        return CustomerC.builder()
                .onlyCustomerCProperty("Cliente CCCC")
                .name("ClienteC")
                .lastName("abraCCCCadabra").build();
    }
}
