package salary;

import salary.employer.Employer;

public class HourlyBid extends Salary {
    private int hour;
    private float bitHour;

    public HourlyBid(Employer employer, int hour, float bitHour) {
        super(employer);
        this.bitHour = bitHour;
        this.hour = hour;
        getSalary();
    }

    @Override
    public float getSalary() {
        salary = hour*bitHour;
        return salary;
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(this.employer.toString());
        builder.append(" ");
        builder.append(this.getClass().getName());
        builder.append(" ");
        builder.append(salary);

        return builder.toString();
    }
}
