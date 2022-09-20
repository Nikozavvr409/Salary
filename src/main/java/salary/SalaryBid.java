package salary;

import salary.employer.Employer;

public class SalaryBid extends Salary {
    private float bitOfDay;
    private int day;

    public SalaryBid(Employer employer, int day, float bitOfDay) {
        super(employer);
        this.bitOfDay = bitOfDay;
        this.day = day;
        getSalary();
    }

    @Override
    public float getSalary() {
        salary = bitOfDay*day;
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
