package com.company.behavioural.template;

public abstract class Task {

    public AuditTrail auditTrail;
    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();

        doExecute();

    }
    public abstract void doExecute();
}
