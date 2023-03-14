import java.util.Scanner;

class datetimeyear{
    public static void main(String[] args) {
        int date;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = sc.nextInt();
        System.out.println("Enter month:");
        int month = sc.nextInt();
        System.out.println("Enter day:");
        int day = sc.nextInt();
        if(month<=0||month>12||day>31)
{
    System.out.println("invalid month");
    System.out.println(year + "/" + month + "/" + day);
}
        }
        else{
            System.out.println("invalid day");
            System.out.println(year + "/" + month + "/" + date);
        }
        System.out.println(year + "/" + month + "/" + day);
        switch (month) {
            case 1:
            System.out.println(day + "st " + " jan" + "" + year);
            break;
            case 2:
            System.out.println(day + "sd " + " feb" + " " + year);
            break;
            case 3:
            System.out.println(day + "th " + " march" + " " + year);
            break;
            case 4:
            System.out.println(day + "th " + "april" + " " + year);
            break;
            case 5:
            System.out.println(day + "th " + "may" + " " + year);
            break;
            case 6:
            System.out.println(day + "th " + "june" + " " + year);
            break;
            case 7:
            System.out.println(day + "th " + "july" + "" + year);
            break;
            case 8:
            System.out.println(day + "th " + "aug" + " " + year);
            break;
            case 9:
            System.out.println(day + "th " + "sep" + " " + year);
            break;
            case 10:
            System.out.println(day + "th " + "oct" + " " + year);
            break;
            case 11:
            System.out.println(day + "th " + "nov" + " " + year);
            break;
            case 12:
            System.out.println(day + "th " + "december" + " " + year);
            break;
            default:
            System.out.println("invalid month");
            break;


        }
    }
}