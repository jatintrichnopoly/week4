package com.Nikhila.cleancode;
import java.lang.Math;
import com.Nikhila.cleancode.Interest;
public class InterestCalculator implements Interest
{
    double principleAmount,rateOfInterest;
    int timePeriod;
    InterestCalculator(double principleAmount, double rateOfInterest, int timePeriod)
    {
        this.principleAmount=principleAmount;
        this.rateOfInterest=rateOfInterest;
        this.timePeriod=timePeriod;
    }

    @Override
    public double calculateSimpleInterest() {
        double simpleInterest;
         
        simpleInterest=(principleAmount*timePeriod*rateOfInterest)/100;
        return simpleInterest;
    }
    @Override
    public double calculateCompoundInterest() {
        double compoundInterest;
        compoundInterest=(principleAmount * (Math.pow(1+(rateOfInterest/100),timePeriod)))-principleAmount;

        return compoundInterest;
    }

}