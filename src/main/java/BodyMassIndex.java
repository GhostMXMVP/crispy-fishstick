/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivaantiwari
 */
import java.util.*;

public class BodyMassIndex {

    void BMI(double m, double h, String n, double a, String g, String e) {
        Scanner sc = new Scanner(System.in);
        double bmi = m / (h * h);
        double bmr = 0;
        double new_Height = h * 100; // convert height in cm for BMR
        double maintenance_cal = 0;
        if (g.equalsIgnoreCase("Male")) {
            //Male BMR = 10W + 6.25h -5A + 5
            bmr = 10 * m + 6.25 * new_Height - 5 * a + 5;
            if (e.equalsIgnoreCase("little") || e.equalsIgnoreCase("none")) {
                maintenance_cal = bmr * 1.2;
            } else if (e.equalsIgnoreCase("light")) {
                maintenance_cal = bmr * 1.375;
            } else if (e.equalsIgnoreCase("moderate")) {
                maintenance_cal = bmr * 1.55;
            } else if (e.equalsIgnoreCase("heavy")) {
                maintenance_cal = bmr * 1.725;
            }
        } else if (g.equalsIgnoreCase("Female")) {
            // Female BMR = BMR=10W+6.25H−5A−161
            bmr = 10 * m + 6.25 * new_Height - 5 * a - 161;
            if (e.equalsIgnoreCase("little") || e.equalsIgnoreCase("none")) {
                maintenance_cal = bmr * 1.2;
            } else if (e.equalsIgnoreCase("light")) {
                maintenance_cal = bmr * 1.375;
            } else if (e.equalsIgnoreCase("moderate")) {
                maintenance_cal = bmr * 1.55;
            } else if (e.equalsIgnoreCase("heavy")) {
                maintenance_cal = bmr * 1.725;
            }
        }
        if (bmi <= 18.5) {
            System.out.println("Name: " + n);
            System.out.println();
            System.out.println("Age: " + a);
            System.out.println();
            System.out.println("Gender: " + g);
            System.out.println();
            System.out.println("Height: " + h);
            System.out.println();
            System.out.println("Weight: " + m);
            System.out.println();
            System.out.println("BMI: " + bmi);
            System.out.println();

            System.out.println("You are underweight");
            System.out.println();
            System.out.println("Basal Metabolic Rate (BMR, which is the calories you need to take to be alive at rest): " + bmr);
            System.out.println("Maintenance calories: " + maintenance_cal);

            System.out.println("Since you are underweight, to increase your weight you need to consume mroe calories than your maintenance calories, which is the calories needed to consume to maintain your weight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Name: " + n);
            System.out.println();
            System.out.println("Age: " + a);
            System.out.println();
            System.out.println("Gender: " + g);
            System.out.println();
            System.out.println("Height: " + h);
            System.out.println();
            System.out.println("Weight: " + m);
            System.out.println();
            System.out.println("BMI: " + bmi);
            System.out.println();
            System.out.println("You are normal weight");

            System.out.println();
            System.out.println("Basal Metabolic Rate (BMR, which is the calories you need to take to be alive at rest): " + bmr);
            System.out.println("Maintenance calories: " + maintenance_cal);

            System.out.println("Since you are normal weight, its better if you don't increase or decrease your weight, since your weight is already optimum");
        } else if (bmi >= 25 && bmi <= 29.9) {

            System.out.println("Name: " + n);
            System.out.println();
            System.out.println("Age: " + a);
            System.out.println();
            System.out.println("Gender: " + g);
            System.out.println();
            System.out.println("Height: " + h);
            System.out.println();
            System.out.println("Weight: " + m);
            System.out.println();
            System.out.println("BMI: " + bmi);
            System.out.println();
            System.out.println("You are overweight");

            System.out.println();
            System.out.println("Basal Metabolic Rate (BMR, which is the calories you need to take to be alive at rest): " + bmr);
            System.out.println("Maintenance calories: " + maintenance_cal);
            System.out.println();
            System.out.println("Since you are overweight, to lose weight you should consume less calories than your maintainenance calories, which is the calories");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("Name: " + n);
            System.out.println();
            System.out.println();
            System.out.println("Age: " + a);
            System.out.println();
            System.out.println("Gender: " + g);
            System.out.println();
            System.out.println("Height: " + h);
            System.out.println();
            System.out.println("Weight: " + m);
            System.out.println();
            System.out.println("BMI: " + bmi);
            System.out.println();
            System.out.println("You have Class I Obesity");

            System.out.println();

            System.out.println("Basal Metabolic Rate (BMR, which is the calories you need to take to be alive at rest): " + bmr);
            System.out.println("Maintenance calories: " + maintenance_cal);

            System.out.println("Since you have Class I Obesity, you will need to eat lesser calories than your maintenance calories, which is the calories you need to take to maintain your weight");
        } else if (bmi >= 35 && bmi <= 39.9) {
            System.out.println("Name: " + n);
            System.out.println();
            System.out.println("Age: " + a);
            System.out.println();
            System.out.println("Gender: " + g);
            System.out.println();
            System.out.println("Height: " + h);
            System.out.println();
            System.out.println("Weight: " + m);
            System.out.println();
            System.out.println("BMI: " + bmi);
            System.out.println();
            System.out.println("You have Class II Obesity");

            System.out.println();

            System.out.println("Basal Metabolic Rate (BMR, which is the calories you need to take to be alive at rest): " + bmr);
            System.out.println("Maintenance calories: " + maintenance_cal);

            System.out.println("Since you have Class II Obesity, you have extreme obesity, hence to do extreme weight loss, you will have to eat much less calories than your maintenance calories ,which is the calories you need to take to maintain your weight");
        } else if (bmi <= 40) {
            System.out.println("Name: " + n);
            System.out.println();
            System.out.println("Age: " + a);
            System.out.println();
            System.out.println("Gender: " + g);
            System.out.println();
            System.out.println("Height: " + h);
            System.out.println();
            System.out.println("Weight: " + m);
            System.out.println();
            System.out.println("BMI: " + bmi);
            System.out.println();
            System.out.println("You have Class III obesity (severely obese)");

            System.out.println();

            System.out.println("Basal Metabolic Rate (BMR, which is the calories you need to take to be alive at rest): " + bmr);
            System.out.println("Maintenance calories: " + maintenance_cal);

            System.out.println("Since you are severely overweight, you need to take much less calories to do weight loss than your maintencance calories, which is the calories you need to take to maintain your weight");
        }
    }

    void proteinTarget(double m, double h, String n, double a, String g, String e) {
        // if weight is normal, then protein target should be 1.6g per kg of body weight
        // if weight is underweight, then protein target should be 2g per kg of body weight
        // if weight is overweight, then protein target should be 2.4g per kg of body weight
        double bmi = m / (h * h);
        System.out.println("Weight: " + m);
        if (bmi <= 18.5) {
            double pt = m * 2;
            System.out.println("Your protein target: " + pt);
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            double pt = m * 1.6;
            System.out.println("Your protein target: " + pt);
        } else if (bmi <= 24.9) {
            double pt = m * 2.4;
            System.out.println("Your protein target: " + pt);
        }
    }

    void targetCal(double m, double h, String n, double a, String g, String e) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your target weight (the weight you want to get by losing weight) : ");
        double target_w = sc.nextDouble();
        System.out.println("Enter the time period by which you want to lose your weight: ");
        double time = sc.nextDouble();
        System.out.println("Enter unit of time(weeks/months/years): ");
        String unit_t = sc.next();
        if (unit_t.equalsIgnoreCase("weeks")) {
            time = time * 7;
        } else if (unit_t.equalsIgnoreCase("months")) {
            time = time * 30;
        } else if (unit_t.equalsIgnoreCase("years")) {
            time = time * 365;
        }
        double weight_toLose = m - target_w;
        double cal_deficit_total = weight_toLose * 7700; //since 1kg body fat has 7700 calories
        double cal_deficit = cal_deficit_total / time;
        System.out.println();
        System.out.println("If you want to lose " + weight_toLose + " to attain a weight of " + target_w + " in a period of " + time + " , then you need to consume " + cal_deficit + " to attain your target weight");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter your gender (M/F): ");
        String gender = sc.next();
        System.out.println("Enter mass in kilograms (kg): ");
        double mass = sc.nextDouble();
        System.out.println("Enter height in metres (m): ");
        double height = sc.nextDouble();
        System.out.println("Enter age: ");
        double age = sc.nextDouble();
        System.out.println("Input activity level (little/no excercise/light excercise/moderate excercise/heavy excercise: )");
        String excercise = sc.next();
        BodyMassIndex obj = new BodyMassIndex();
        obj.BMI(mass, height, name, age, gender, excercise);
        obj.proteinTarget(mass, height, name, age, gender, excercise);
        obj.targetCal(mass, height, name, age, gender, excercise);
    } 
}