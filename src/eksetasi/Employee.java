/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eksetasi;

/**
 *
 * @author user
 */
import java.time.LocalDate;
import java.util.ArrayList;

public class Employee {
    private int id;
    private String type;
    private double salary;
    private double finalSalary;
    private int leaveDays;
    private int sickDays;
    private int absenceDays;

    // Μισθολογικές αλλαγές και ώρες εργασίας
    private ArrayList<LocalDate> effectiveDates = new ArrayList<>();
    private ArrayList<Double> hourlyRates = new ArrayList<>();
    private ArrayList<LocalDate> workDates = new ArrayList<>();
    private ArrayList<Double> workHours = new ArrayList<>();

    // === Υπολογισμοί ===

    // Μηνιαίος ή ημερομίσθιος
    public double calc_salary() {
        return finalSalary = salary;
    }

    // Απώλεια μισθού από απουσίες
    public double calc_salary_absence() {
        double lost = salary / 25.0;
        return finalSalary = salary - (absenceDays * lost);
    }

    // Ωρομίσθιος με πολλαπλά effectiveDate
    public double calc_hourly_salary() {
        double total = 0.0;

        for (int i = 0; i < workDates.size(); i++) {
            LocalDate workDate = workDates.get(i);
            double hours = workHours.get(i);
            double rate = 0.0;

            for (int j = 0; j < effectiveDates.size(); j++) {
                LocalDate effDate = effectiveDates.get(j);
                boolean isLast = j == effectiveDates.size() - 1;
                LocalDate nextEffDate = isLast ? null : effectiveDates.get(j + 1);

                if (!workDate.isBefore(effDate) && (isLast || workDate.isBefore(nextEffDate))) {
                    rate = hourlyRates.get(j);
                    break;
                }
            }

            total += rate * hours;
        }

        return finalSalary = total;
    }

    // === Προσθήκες δεδομένων ===
    public void addHourlyRate(String date, double rate) {
        effectiveDates.add(LocalDate.parse(date));
        hourlyRates.add(rate);
    }

    public void addWorkHour(String date, double hours) {
        workDates.add(LocalDate.parse(date));
        workHours.add(hours);
    }

    // === Getters / Setters ===
    public int getId() { return id; }
    public String getType() { return type; }
    public double getSalary() { return salary; }
    public double getFinalSalary() { return finalSalary; }
    public int getLeaveDays() { return leaveDays; }
    public int getSickDays() { return sickDays; }
    public int getAbsenceDays() { return absenceDays; }

    public void setId(int id) { this.id = id; }
    public void setType(String type) { this.type = type; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setFinalSalary(double finalSalary) { this.finalSalary = finalSalary; }
    public void setLeaveDays(int leaveDays) { this.leaveDays = leaveDays; }
    public void setSickDays(int sickDays) { this.sickDays = sickDays; }
    public void setAbsenceDays(int absenceDays) { this.absenceDays = absenceDays; }
}





















/*class Employee {
    private int id;
    private String date;
    private int totalHours;
    private String type;
    private double salary;
    private double finalsalary;
    private int leaveDays;
    private int sickDays;
    private int absenceDays;
    
    //Τα τρία είδη εργαζομένων
    public double calc_salary(){
        return finalsalary = salary;
    }
    public double calc_salary_absence(){
        double lost_salary = salary / 25.0;
        return finalsalary = salary - (absenceDays * lost_salary);
    }
    public double hour_salary(){
        return finalsalary = salary * totalHours;
    }
    public void add_hours(int hours){
        totalHours += hours;
    }
    
    
    //Getters
    public int getId() { return id; }
    public String getDate() { return date; }
    public String getType() { return type; }
    public double getSalary() { return salary; }
    public double getFinalSalary() { return finalsalary; }
    public int getLeaveDays() { return leaveDays; }
    public int getSickDays() { return sickDays; }
    public int getAbsenceDays() { return absenceDays; }
    
    //Setters
    public void setId(int id) { this.id = id; }
    public void setDate(String date) { this.date = date; }
    public void setType(String type) { this.type = type; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setFinalSalary(double finalsalary) { this.finalsalary = finalsalary; }
    public void setLeaveDays(int leaveDays) { this.leaveDays = leaveDays; }
    public void setSickDays(int sickDays) { this.sickDays = sickDays; }
    public void setAbsenceDays(int absenceDays) { this.absenceDays = absenceDays; }
}*/