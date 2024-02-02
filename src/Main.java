
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoctorAppointmentScheduler Scheduler =new DoctorAppointmentScheduler();
        Doctor []doctors=new Doctor[5];
        doctors[0]=new Doctor("Reaksmey","Besdoung");
        doctors[1]=new Doctor("Chomruen","Skin");
        doctors[2]=new Doctor("Sokvan","Skin face");
        doctors[3]=new Doctor("Monika","Acne");
        doctors[4]=new Doctor("Phaekdey","General");
        String DocName="";
        String DocSpec ="";
            while(true){
                try {
                    System.out.println("1.Add Appointment with Doctor");
                    System.out.println("2.View Appointment");
                    System.out.println("3.Search Appointment");
                    System.out.println("4.Update Appointment");
                    System.out.println("5.Delete Appointment");
                    System.out.println("Exit");
                    System.out.print("Enter Your Choice:  ");
                    int choice= input.nextInt();
                    switch (choice){
                        case 1:
                            System.out.print("\nEnter Patient Name: ");
                            String Patient = input.next();
                            for(int i=0; i<doctors.length;i++){
                                System.out.println(i+1 +": "+"Doctor_Name:"+doctors[i].getDoctorName()+"   Doctor Specialization :"+doctors[i].getDoctorSpecailization());

                            }
                            System.out.println("Enter Your Choice: ");
                            int ph =input.nextInt();

                                switch (ph){
                                    case 1:
                                        DocName=doctors[0].getDoctorName();
                                        DocSpec=doctors[0].getDoctorSpecailization();
                                            break;
                                    case 2 :
                                        DocName=doctors[1].getDoctorName();
                                        DocSpec=doctors[1].getDoctorSpecailization();
                                        break;
                                    case 3:
                                        DocName=doctors[2].getDoctorName();
                                        DocSpec=doctors[2].getDoctorSpecailization();
                                        break;
                                    case 4:
                                        DocName=doctors[3].getDoctorName();
                                        DocSpec=doctors[3].getDoctorSpecailization();
                                        break;
                                    case 5 :
                                        DocName=doctors[4].getDoctorName();
                                        DocSpec=doctors[4].getDoctorSpecailization();
                                        break;
                                    default:
                                        System.out.println("We don't have doctor of this choice ");
                                }
                            System.out.println("Enter Time Appointment (HH:MM): ");
                            String Time= input.next();
                            System.out.println("Enter Date Appointment(DD-MM-YYYY: ");
                            String Date =input.next();
                            Doctor doctor=new Doctor(DocName,DocSpec);
                            AppointmentManager newAppointment =new AppointmentManager(Patient,doctor,Time,Date);
                            Scheduler.addAppointmentDoctor(newAppointment);

                            break;
                        case 2:
                            Scheduler.ViewSchedulerAppointment();
                            break;
                        case 3:
                            System.out.println("Enter Patient Name for Searching :");
                            String NamePatient= input.next();
                            Scheduler.SearchScheduleAppointment(NamePatient);
                            break;
                        case 4:
                            System.out.print("Enter  Patient Name to Update: ");
                            String NewPatientName= input.next();
                            for(int i=0; i<doctors.length;i++){
                            System.out.println(i+1 +": "+"Doctor_Name:"+doctors[i].getDoctorName()+"   Doctor Specialization :"+doctors[i].getDoctorSpecailization());

                        }
                            System.out.println("Enter Your Choice: ");
                            int kh =input.nextInt();

                            switch (kh){
                                case 1:
                                    DocName=doctors[0].getDoctorName();
                                    DocSpec=doctors[0].getDoctorSpecailization();
                                    break;
                                case 2 :
                                    DocName=doctors[1].getDoctorName();
                                    DocSpec=doctors[1].getDoctorSpecailization();
                                    break;
                                case 3:
                                    DocName=doctors[2].getDoctorName();
                                    DocSpec=doctors[2].getDoctorSpecailization();
                                    break;
                                case 4:
                                    DocName=doctors[3].getDoctorName();
                                    DocSpec=doctors[3].getDoctorSpecailization();
                                    break;
                                case 5 :
                                    DocName=doctors[4].getDoctorName();
                                    DocSpec=doctors[4].getDoctorSpecailization();
                                    break;
                                default:
                                    System.out.println("We don't have doctor of this choice ");
                            }

                            System.out.println("Enter New Time Appointment (HH:MM):");
                            String newTime=input.next();
                            System.out.println("Enter New Date Appointment: (DD-MM-YYYY)");
                            String newDate=input.next();
                            Scheduler.UpdateAppointmentScheduler(NewPatientName,DocName,DocSpec,newTime,newDate);
                            break;
                        case 5 :
                                System.out.println("Enter Patient Name to delete: ");
                                String NameDeletePatient=input.next();
                                Scheduler.DeleteAppointmentSchedule(NameDeletePatient);
                            break;
                        case 6:
                            System.exit(0);
                        default:
                            System.out.println("Invalid input. Please enter a valid option.");
                    }

                }catch (InputMismatchException e){
                    System.out.println("Error: Invalid input. Please enter a valid option.");
                    input.nextLine(); // Consume the invalid input
                }catch (Exception e){
                    System.out.println("Error: " + e.getMessage());
                }
            }
    }
}