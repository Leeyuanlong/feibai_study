package com.feibai.spring.study.aspect.log;

public class LogObject {

  private String opsId;
  private String methodName;
  private String businessStr;

  public String getOpsId() {
    return opsId;
  }

  public void setOpsId(String opsId) {
    this.opsId = opsId;
  }

  public String getMethodName() {
    return methodName;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  public String getBusinessStr() {
    return businessStr;
  }

  public void setBusinessStr(String businessStr) {
    this.businessStr = businessStr;
  }
}
