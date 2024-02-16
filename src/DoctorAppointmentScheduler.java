import java.util.ArrayList;

public class DoctorAppointmentScheduler {
    private ArrayList<AppointmentManager> AppointmentScheduler;
    public DoctorAppointmentScheduler(){
    this.AppointmentScheduler=new ArrayList<>();

     }

     public void addAppointmentDoctor(AppointmentManager newAppointment) throws Exception {
            for (AppointmentManager AddAppointment : AppointmentScheduler){
                if(AddAppointment.getDoctor().getDoctorName().equalsIgnoreCase(newAppointment.getDoctor().DoctorName)
                && AddAppointment.getDoctor().getDoctorSpecailization().equalsIgnoreCase(newAppointment.getDoctor().DoctorSpecailization)
                && AddAppointment.getTime().equalsIgnoreCase(newAppointment.getTime())
                &&AddAppointment.getDate().equalsIgnoreCase(newAppointment.getDate())){
                    throw new Exception("Appointment on the same time, Date with Doctor isn't Allowed.");

                    }
                }
            AppointmentScheduler.add(newAppointment);
            System.out.println("Appointment Added Successful");
            }


        /* for(int i=0; i<AppointmentScheduler.size();i++) {

                 if (!AppointmentScheduler.get(i).Patient_Name.equalsIgnoreCase(newAppointment.getPatient_Name())
                         && AppointmentScheduler.get(i).doctor.DoctorName.equalsIgnoreCase(newAppointment.getDoctor().DoctorName)
                         && AppointmentScheduler.get(i).doctor.DoctorSpecailization.equalsIgnoreCase(newAppointment.getDoctor().getDoctorSpecailization())
                         && AppointmentScheduler.get(i).getTime().equalsIgnoreCase(newAppointment.getTime())
                         && AppointmentScheduler.get(i).getDate().equalsIgnoreCase(newAppointment.getDate())) {
                     throw new Exception("Appointment has something the same with other Appointment");

             }
                AppointmentScheduler.add(newAppointment);
            System.out.println("Appointment Added Successful");
         }*/


     public void ViewSchedulerAppointment(){
            System.out.println("List Appointment Scheduler");
         System.out.println("PatientName\t\tDoctorName\t\tDocSpecialization\t\tTime\t\tDate");
         for (AppointmentManager appointmentManager : AppointmentScheduler) {
             System.out.println(appointmentManager.getPatient_Name() + "\t\t" + appointmentManager.getDoctor().getDoctorName()
                     + "\t\t" + appointmentManager.getDoctor().getDoctorSpecailization() + "\t\t" + appointmentManager.getTime() +
                     "\t\t" + appointmentManager.getDate());
         }
           /* for (AppointmentManager getappointment : AppointmentScheduler){
                System.out.println(getappointment);
            }*/
     }

    public  void SearchScheduleAppointment(String Patient){
        int p=0;
        for(AppointmentManager getappointment : AppointmentScheduler){
            if(getappointment.Patient_Name.equalsIgnoreCase(Patient)){
                p=1;
                System.out.println("Appointment has Found\n "+"Patient_Name: "+getappointment.Patient_Name+"\nDoctor_Name:"+getappointment.getDoctor().getDoctorName()
                                                            +"\nSpecialization:"+getappointment.getDoctor().DoctorSpecailization+"\nTime:"+getappointment.getTime()
                                                                +"\nDate: "+getappointment.getDate());

            }
        }
        if(p==0){
            System.out.println("Appointment has not found");
        }
    }
    public void UpdateAppointmentScheduler(String Patient,String doctorName,String Specialization,String Time,String Date ) throws Exception {
        int j=0;
         for(int i=0; i<AppointmentScheduler.size();i++){

            if(AppointmentScheduler.get(i).Patient_Name.equalsIgnoreCase(Patient)){
                j=1;
                if(!AppointmentScheduler.get(i).Patient_Name.equalsIgnoreCase(Patient)
                        && AppointmentScheduler.get(i).doctor.DoctorName.equalsIgnoreCase(doctorName)
                        && AppointmentScheduler.get(i).doctor.DoctorSpecailization.equalsIgnoreCase(Specialization)
                        && AppointmentScheduler.get(i).getTime().equalsIgnoreCase(Time)
                        && AppointmentScheduler.get(i).getDate().equalsIgnoreCase(Date)){
                    throw new Exception("Appointment has something the same with other Appointment");

                }
                Doctor newDoctor =new Doctor(doctorName,Specialization);
                AppointmentScheduler.get(i).setDoctor(newDoctor);
                AppointmentScheduler.get(i).setTime(Time);
                AppointmentScheduler.get(i).setDate(Date);
                System.out.println("Appointment Update Successful ;");
        }   /*
            for(AppointmentManager getappointment : AppointmentScheduler){
            if(getappointment.Patient_Name.equalsIgnoreCase(Patient)){
              if(!getappointment.Patient_Name.equalsIgnoreCase(Patient)
            && getappointment.doctor.DoctorName.equalsIgnoreCase(doctorName)
            && getappointment.doctor.DoctorSpecailization.equalsIgnoreCase(Specialization)
                    && getappointment.getTime().equalsIgnoreCase(Time)
            && getappointment.getDate().equalsIgnoreCase(Date)){
                  throw new Exception("Appointment has something the same with other Appointment");
             }*/

            }
        if(j==0){
            System.out.println("Information Appointment Patient doesn't have in our List Appointment");
        }

        }

        public void DeleteAppointmentSchedule(String Patient){
         int j=0;
            for(int i=0; i<AppointmentScheduler.size();i++){
                if(AppointmentScheduler.get(i).Patient_Name.equalsIgnoreCase(Patient)){
                    AppointmentScheduler.remove(i);
                    j=1;
                    System.out.println("Appointment had deleted");
                }

            }
            if(j==0){
                System.out.println("Appointment not found to delete");
            }
        }


    }



