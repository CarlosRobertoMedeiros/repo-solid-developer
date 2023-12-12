package br.com.roberto.estudo.fopag.transportlayer;

public class PayroolRequest {
    private int employeeId;
    private int month;
    private int year;

    private PayroolRequest() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public static class Builder{
        private int employeeId;
        private int month;
        private int year;

        public Builder employeeId(int employeeId){
            this.employeeId = employeeId;
            return this;
        }

        public Builder month(int month){
            this.month = month;
            return this;
        }

        public Builder year(int year){
            this.year = year;
            return this;
        }

        public PayroolRequest build(){
            PayroolRequest payroolRequest = new PayroolRequest();
            payroolRequest.employeeId = this.employeeId;
            payroolRequest.month = this.month;
            payroolRequest.year = this.year;
            return payroolRequest;
        }

    }
}
