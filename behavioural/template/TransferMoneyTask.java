package com.company.behavioural.template;

public class TransferMoneyTask extends Task{


    public TransferMoneyTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    public void doExecute() {
        System.out.println("Transfer Money");
    }
}
